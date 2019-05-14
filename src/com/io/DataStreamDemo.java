package com.io;

import java.io.*;

/**
 * DataInputStream, DataOutputStream是对流功能的扩展，可以更加方便的读取
 * int, long, short, character等类型的数据
 */
public class DataStreamDemo {
    public static void main(String[] args) throws IOException {
        String file="demo/dat.txt";
        DataOutputStream out=new DataOutputStream(new FileOutputStream(file));
        out.writeInt(10);
        out.writeUTF("你好");
        out.writeUTF("你好a");
        out.close();
        DataInputStream in=new DataInputStream(new FileInputStream(file));
        System.out.println(in.readInt());
    }
}
