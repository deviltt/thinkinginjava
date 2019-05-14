package com.io;

import java.io.*;

public class IsrOswCharsetDemo {
    public static void main(String[] args) throws IOException {

        InputStreamReader reader=new InputStreamReader(new FileInputStream("F:\\apache\\code\\7\\exists.txt"), "gbk");
        OutputStreamWriter writer=new OutputStreamWriter(new FileOutputStream("F:\\apache\\code\\7\\exists3.txt"), "gbk");
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
