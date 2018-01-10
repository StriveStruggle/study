package com.jack.io;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author geqiang on 2018/1/5
 */
public class Processor {
    private static final Logger LOGGER = LoggerFactory.getLogger(Processor.class);
    private static final ExecutorService service = Executors.newFixedThreadPool(16);

    public void process(final SelectionKey selectionKey) {
        service.submit(new Runnable() {
            @Override
            public void run() {
                ByteBuffer buffer = ByteBuffer.allocate(1024);
                SocketChannel socketChannel = (SocketChannel) selectionKey.channel();
                int count = 0;
                try {
                    count = socketChannel.read(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (count < 0) {
                    try {
                        socketChannel.close();
                        selectionKey.cancel();
                        LOGGER.info("{}\t Read ended", socketChannel);
                        return;
                    } catch (IOException e) {

                    }
                } else if (count == 0) {
                    return;
                }
                LOGGER.info("{}\t Read message {}", socketChannel, new String(buffer.array()));
                return;
            }
        });
    }

}
