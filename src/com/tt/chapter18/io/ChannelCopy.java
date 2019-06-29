package com.tt.chapter18.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelCopy {
    private static final int BSIZE=1024;

    public static void main(String[] args) throws FileNotFoundException {
        //1.获取通道
        FileChannel in=new FileInputStream("data.txt").getChannel(),
                out=new FileOutputStream("data1.txt").getChannel();
        //为缓冲器分配空间
        ByteBuffer buffer=ByteBuffer.allocate(BSIZE);
        try {
            //从读通道读取内容放到缓冲器中
            while (in.read(buffer)!=-1){
                buffer.flip();  //要从缓冲器取数据之前做准备
                out.write(buffer);
                buffer.clear(); //清空缓冲器中的内容
            }
            System.out.println("复制成功");
        } catch (IOException e) {
            System.out.println("复制失败");
        }
    }
}
