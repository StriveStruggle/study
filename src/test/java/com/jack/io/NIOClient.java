package com.jack.io;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.channels.FileChannel;
import java.nio.channels.SocketChannel;

/**
 * @author geqiang on 2018/1/5
 */
public class NIOClient {
    public static void main(String[] args) throws IOException,InterruptedException{
        SocketChannel socketChannel=SocketChannel.open();
        InetSocketAddress address=new InetSocketAddress(1234);
        socketChannel.connect(address);
        RandomAccessFile file=new RandomAccessFile(NIOClient.class.getClassLoader().getResource("text.txt").getFile(),"rw");
        FileChannel channel=file.getChannel();
        channel.transferTo(0,channel.size(),socketChannel);
        channel.close();
        file.close();
        socketChannel.close();
    }
}
