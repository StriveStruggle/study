package com.jack.io;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.*;
import java.util.Iterator;
import java.util.Set;

/**
 * @author geqiang on 2018/1/5
 * 经典Reactor模式中，尽管一个线程可同时监控多个请求（Channel）,但是所有读/写请求以及对新连接请求的处理
 * 都在同一个线程中处理，无法充分利用多CPU的优势，同时读/写操作也会阻塞对新连接请求的处理，因此可以引入多线程，并行处理
 * 多个读/写操作。
 */
public class NIOServerTwo {
    private static final Logger LOGGER= LoggerFactory.getLogger(NIOServerTwo.class);

    public static void main(String[] args) throws IOException {
        Selector selector = Selector.open();
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.configureBlocking(false);
        serverSocketChannel.bind(new InetSocketAddress(1234));
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
        while (true){
            if(selector.selectNow()<0){
                continue;
            }
            Set<SelectionKey> keys = selector.selectedKeys();
            Iterator<SelectionKey> iterator = keys.iterator();
            while (iterator.hasNext()){
                SelectionKey key = iterator.next();
                iterator.remove();
                if (key.isAcceptable()){
                    ServerSocketChannel acceptServerSocketChannel= (ServerSocketChannel) key.channel();
                    SocketChannel socketChannel = acceptServerSocketChannel.accept();
                    socketChannel.configureBlocking(false);
                    LOGGER.info("Accept request from {}",socketChannel.getRemoteAddress());
                    SelectionKey readKey = socketChannel.register(selector, SelectionKey.OP_READ);
                    readKey.attach(new Processor());
                }else if(key.isReadable()){
                    Processor processor = (Processor) key.attachment();
                    processor.process(key);
                }
            }
        }
    }
}
