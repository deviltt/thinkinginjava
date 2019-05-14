package com.io;

import java.io.*;

/**
 * 使用FileReader和FileWriter实现文件的复制
 * 划重点：这种方式不能改变项目的编码方式和文件的编码方式不一致的问题
 * 这个时候只能使用InputStreamReader和OutputStreamWriter来进行转换
 */
public class FileReaderWriterDemo {
    public static void main(String[] args) throws IOException {
        FileReader reader=new FileReader("F:\\apache\\code\\7\\exists.txt");
        FileWriter writer=new FileWriter("F:\\apache\\code\\7\\exists2.txt");
        char[] buffer=new char[8*1024];
        int c;
        while ((c=reader.read(buffer,0,buffer.length))!=-1){
            writer.write(buffer);
            writer.flush();
        }
        reader.close();
        writer.close();
    }
}
