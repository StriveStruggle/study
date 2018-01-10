package com.jack.io;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.nio.channels.spi.AbstractSelector;
import java.nio.channels.spi.SelectorProvider;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author geqiang on 2018/1/5
 */
public class ProcessorTwo {
    private static final Logger LOGGER = LoggerFactory.getLogger(ProcessorTwo.class);
    private static final ExecutorService service = Executors.newFixedThreadPool(2 * Runtime.getRuntime().availableProcessors());

    private Selector selector;

    public ProcessorTwo() throws IOException {
        this.selector = SelectorProvider.provider().openSelector();
        start();
    }

    public void addChannel(SocketChannel socketChannel) throws ClosedChannelException {
        socketChannel.register(this.selector, SelectionKey.OP_READ);
    }

    public void wakeup() {
        this.selector.wakeup();
    }

    public void start() {
        service.submit(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        if (selector.select(500) <= 0) {
                            continue;
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    Set<SelectionKey> keys = selector.selectedKeys();
                    Iterator<SelectionKey> iterator = keys.iterator();
                    while (iterator.hasNext()) {
                        SelectionKey key = iterator.next();
                        iterator.remove();
                        if (key.isReadable()) {
                            ByteBuffer buffer = ByteBuffer.allocate(1024);
                            SocketChannel socketChannel = (SocketChannel) key.channel();
                            int count = 0;
                            try {
                                count = socketChannel.read(buffer);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            if(count<0){
                                try {
                                    socketChannel.close();
                                    key.cancel();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }

                                LOGGER.info("{}\t Read ended",socketChannel);
                                continue;
                            }else if(count==0){
                                LOGGER.info("{}\t Message size is 0",socketChannel);
                                continue;
                            }else{
                                LOGGER.info("{}\t Read message {}",socketChannel,new String(buffer.array()));
                            }
                        }
                    }
                }
            }
        });
    }
}
