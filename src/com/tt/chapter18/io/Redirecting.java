package com.tt.chapter18.io;

import java.io.*;

public class Redirecting {
    public static void main(String[] args) throws IOException {
        PrintStream console=System.out;
        //创建标准输入要重定向的位置
        BufferedInputStream in=new BufferedInputStream(new FileInputStream("./src/com/tt/chapter18/io/Rediecting.java"));
        //创建标准输出要重定向的位置
        PrintStream out=new PrintStream(new BufferedOutputStream(new FileOutputStream("./demo/test.out")));
        System.setIn(in);
        System.setOut(out);
        System.setOut(out);
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s=reader.readLine())!=null)
            System.out.println(s);
        out.close();
        System.setOut(console);
    }
}
