package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 输入流基本方法
 * int b = in.read();读取一个字节无符号填充到int低八位。-1代表EOF，到达文件的结尾
 * in.read(byte[] buf);读取数据填充到字节数组buf中去
 * in.read(byte[] buf, int start, int size);读取数据到字节数组buf，从buf的start位置开始，存放size长度的数据
 * 输出流基本方法
 * out.write(int b);写入一个byte到流，b的低8位
 * out.write(byte[] buf);将buf字节数组都写入到流
 * out.write(byte[] buf, int start, int size);字节数组buf从start位置开始写size长度的字节到输出流中
 * <p>
 * FileInputStream---->具体实现了在文件上读取数据
 **/
public class IoDemo {
    /**
     * 读取指定文件内容，按照16进制输出到控制台
     * 并且每输出10个byte换行
     *
     * @param fileName
     */
    public static void printHex(String fileName) throws IOException {
        //把文件作为字节流进行读操作
        FileInputStream in = new FileInputStream(fileName);
        int b;
        int i = 1;//换行使用
        while ((b = in.read()) != -1) {
            System.out.print(Integer.toHexString(b) + " ");
            if (i++ % 10 == 0) {
                System.out.println();
            }
        }
        in.close();
    }

    /**
     * 将输入流中的内容暂时存放在字节数组中
     * @param fileName
     * @throws IOException
     */
    private static void printHexByByteArray(String fileName) throws IOException {
        FileInputStream in = new FileInputStream(fileName);
        //开辟一个字节数组用存放从输入流中读取的数据
        byte[] bytes = new byte[10 * 1024];
        int bytesNums = in.read(bytes, 0, bytes.length);    //返回的是读到的字节的个数
        int j = 1;
        for (int i = 0; i < bytesNums; i++) {
            if (bytes[i] <= 0xf)
                System.out.print("0");
            System.out.print(Integer.toHexString(bytes[i]) + " ");
            if (j++ % 10 == 0)
                System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {
        printHexByByteArray("F:\\apache\\code\\7\\exists.php");
    }
}
