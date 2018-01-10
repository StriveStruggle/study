package com.jack.io;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.Iterator;
import java.util.Set;

/**
 * @author geqiang on 2018/1/5
 * Reactor 将I/O事件发派给对应的Handler
 * Acceptor处理客户端连接请求
 * Handlers执行非阻塞读/写
 */
public class NIOServer {
    private static final Logger LOGGER=LoggerFactory.getLogger(NIOServer.class);

    public static void main(String[] args) throws IOException{
        Selector selector = Selector.open();
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.configureBlocking(false);
        serverSocketChannel.bind(new InetSocketAddress(1234));
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
        while (selector.select()>0){
            Set<SelectionKey> keys=selector.selectedKeys();
            Iterator<SelectionKey> iterator = keys.iterator();
            while (iterator.hasNext()){
                SelectionKey key=iterator.next();
                iterator.remove();
                if(key.isAcceptable()){
                    ServerSocketChannel acceptServerSocketChannel = (ServerSocketChannel) key.channel();
                    SocketChannel socketChannel = acceptServerSocketChannel.accept();
                    socketChannel.configureBlocking(false);
                    LOGGER.info("Accept request from {}",socketChannel.getRemoteAddress());
                    socketChannel.register(selector,SelectionKey.OP_READ);
                }else if(key.isReadable()){
                    SocketChannel socketChannel = (SocketChannel) key.channel();
                    ByteBuffer buffer=ByteBuffer.allocate(1024);
                    int count = socketChannel.read(buffer);
                    if(count<=0){
                        socketChannel.close();
                        key.cancel();
                        LOGGER.info("Received invalide data,close the connection");
                        continue;
                    }
                    LOGGER.info("Received message {}",new String(buffer.array()));
                }
                keys.remove(key);
            }
        }

    }
}
