package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 字符流
 * 1)编码问题
 * 2)文本与文本文件
 * java的文本char是16位无符号整数，是字符的unicode编码（双字节编码）
 * 文件是byte byte byte ...的数据序列
 * 文本文件是文本(char)序列按照某种编码方案(utf-8,utf-16be,gbk)序列化为byte的存储文件
 * 3)字符流(Reader Writer)---->操作的是文本文件
 * 字符的处理，一次处理一个字符
 * 字符的底层仍然是基本的字节序列
 * 字符流的基本实现
 * InputStreamReader 完成byte流解析为char流，按照编码解析
 * 即从文件读入到应用程序，字节流转换为字符流
 * OutputStreamWriter 提供char流到byte流，按照编码处理
 * 即从应用程序写入文件，字符流转换为字节流
 */
public class IsrOswDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(new FileInputStream("F:\\apache\\code\\7\\exists.txt"), "gbk");
        int c;
        //直接用c保存读到的字符
//        while ((c=in.read())!=-1){
//            System.out.print((char)c);
//        }
        char[] buffer = new char[8 * 1024];
        //是一次性读到buffer里面去的，批量读取，放入buffer字符数组中，从第0位置开始放，最多放buffer.length个
        while ((c = in.read(buffer, 0, buffer.length)) != -1) {
            String s = new String(buffer, 0, c);
            System.out.print(s);
        }
    }
}
