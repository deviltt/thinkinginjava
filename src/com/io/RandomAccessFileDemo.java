package com.io;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/**
 * RandomAccessFile是对文件内容的访问，既可以读文件，又可以写文件
 * RandomAccessFile支持随机访问文件，可以访问文件的任意位置
 *  （1）java文件模型
 *      在硬盘上的文件是以字节的形式存储的，是数据的集合
 *  （2）打开文件
 *      有两种模式 rw：读写 r:只读
 *      RandomAccessFile raf = new RandomAccessFile(file, "rw");
 *      文件指针，打开文件时指针在开头pointer=0
 *  （3）写方法
 *      raf.write(int)---->只写一个字节（后8位），同时指针指向下一个位置，准备再次写入
 *  （4）读方法
 *      int b = raf.read()---->读一个字节
 *  （5）文件读写完成后一定要关闭（Oracle官方说明）
 */
public class RandomAccessFileDemo {
    public static void main(String[] args) throws IOException {
        File file=new File("demo");
        if (!file.exists()){
            file.mkdir();
        }
        File file1=new File("demo/demo.txt");
        if (!file1.exists()){
            file1.createNewFile();
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(file1, "rw");
        System.out.println(randomAccessFile.getFilePointer());

        randomAccessFile.write('A');
        System.out.println(randomAccessFile.getFilePointer());

        String string="中";
        byte[] gbk=string.getBytes("gbk");
        randomAccessFile.write(gbk);
        System.out.println(randomAccessFile.getFilePointer());

        randomAccessFile.seek(0);
        byte[] bytes=new byte[(int) randomAccessFile.length()];
        randomAccessFile.read(bytes);
        System.out.println(Arrays.toString(bytes)); //把数组变为字符串

        //把字节数组变为字符串
        String s1=new String(bytes, "gbk");
        System.out.println(s1);

        randomAccessFile.close();
    }
}
