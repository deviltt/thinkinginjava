package com.io;

import java.io.*;

/**
 * 字符流的过滤器
 * BufferedReader---->readLine一次读一行
 * BufferedWriter/PrintWriter---->一次写一行
 */
public class BufferedRWDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("F:\\apache\\code\\7\\exists.php")));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("F:\\apache\\code\\7\\exists4.txt")));
        PrintWriter pw=new PrintWriter("F:\\apache\\code\\7\\exists5.php");
        String line;
        while ((line=br.readLine())!=null){
            System.out.println(line);   //一次读一行，并不能识别换行
            bw.write(line); //因为不能识别换行，因此需要单独写换行
            bw.newLine();   //换行操作
            pw.println(line);
            bw.flush();
            pw.flush();
        }
        br.close();
        bw.close();
        pw.close();
    }
}
