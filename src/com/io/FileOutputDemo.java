package com.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputDemo {
    public static void main(String[] args) throws IOException {
        //如果文件存在，则对其覆盖，如果第二个参数为true则追加内容，如果文件不存在，则直接创建
        FileOutputStream out=new FileOutputStream("F:\\apache\\code\\7\\exists.txt", true);
        out.write('A'); //写出了'A'的低八位
        int a=10;
        out.write(a>>>24);  //无符号右移24位，如果是>>，表示带符号右移，移完高位补1
        out.write(a>>>16);
        out.write(a>>>8);
        out.write(a);

        out.write(20);

        byte[] bytes="中国".getBytes("gbk");
        out.write(bytes);
        out.close();

        IoDemo.printHex("F:\\apache\\code\\7\\exists.txt");
    }
}
