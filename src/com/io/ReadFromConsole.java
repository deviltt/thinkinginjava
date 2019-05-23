package com.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFromConsole {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        char c;
        String s;
        System.out.println("输入字符，按下'q'键退出");
//        do {
//            c= (char) bufferedReader.read();
//            System.out.println(c);
//        }while (c!='q');
        do {
            s=bufferedReader.readLine();
            System.out.println(s);
        }while (!s.equals(""));
    }
}
