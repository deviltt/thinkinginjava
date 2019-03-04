package com.tt.chapter18.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedInputFile {
    public static String read(String filename) throws IOException {
        //打开一个文件用于字符输入
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String s;
        StringBuilder stringBuilder = new StringBuilder();
        while ((s = in.readLine()) != null){
            stringBuilder.append(s + "\n");
        }
        in.close();
        return stringBuilder.toString();
    }
    public static void main(String[] args) throws IOException {
        System.out.println(read("./src/com/tt/chapter18/io/BufferedInputFile.java"));
    }
}
