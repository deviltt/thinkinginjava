package com.tt.chapter18.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Echo {
    public static void main(String[] args) throws IOException {
        //BufferedReader是字符流，而System.in是文件流，因此要将字节流转位字符流
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = stdin.readLine()) != null && s.length() != 0)
            System.out.println(s);
    }
}
