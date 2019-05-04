package com.io;

import java.io.UnsupportedEncodingException;


/**
 *  文本文件就是字节序列
 *  可以是任意编码的字节序列
 */
public class EncodeDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //默认是UTF-8编码，中文占用3个字节，英文占用一个字节
        String s = "火影忍者ABC";
        //把字符串转换为字节数组
        byte[] bytes = s.getBytes();
        for (byte b : bytes)
            System.out.print(Integer.toHexString(b & 0xff) + " ");
        System.out.println();
        //GBK编码格式，中文占用两个字节，英文占用一个字节
        byte[] bytes1 = s.getBytes("GBK");
        for (byte b : bytes1)
            System.out.print(Integer.toHexString(b & 0xff) + " ");
        System.out.println();
        byte[] bytes2 = s.getBytes("UTF-8");
        for (byte b : bytes2)
            System.out.print(Integer.toHexString(b & 0xff) + " ");
        System.out.println();
        //java是双字节编码utf-16be，中文和英文都占用两个字节
        byte[] bytes3=s.getBytes("utf-16be");
        for (byte b:bytes3)
            System.out.print(Integer.toHexString(b&0xff)+" ");
        System.out.println();

        String s1=new String(bytes3, "UTF-16be");
        System.out.println(s1);
    }
}
