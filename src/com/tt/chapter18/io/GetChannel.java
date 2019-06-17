package com.tt.chapter18.io;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class GetChannel {
    private static final int BSIZE=1024;

    public static void main(String[] args) throws IOException {
        FileChannel fileChannel=new FileOutputStream("data.txt").getChannel();
        fileChannel.write(ByteBuffer.wrap("Some text ".getBytes()));    //wrap()方法将已存在的字节数组包装到ByteBuffer中
        fileChannel.close();

        fileChannel=new RandomAccessFile("data.txt", "rw").getChannel();
        fileChannel.position(fileChannel.size());
        fileChannel.write(ByteBuffer.wrap("Some more".getBytes()));
        fileChannel.close();

        fileChannel=new FileInputStream("data.txt").getChannel();
        ByteBuffer byteBuffer=ByteBuffer.allocate(BSIZE);   //ByteBuffer是唯一直接与通道交互的缓冲器
        fileChannel.read(byteBuffer);   //通道读取的内容存放打byteBuffer中去
        byteBuffer.flip();  //从缓冲器中读取内容时就必须调用flip，让其做好被别人读的准备
        while (byteBuffer.hasRemaining())
            System.out.print((char)byteBuffer.get());
    }
}
