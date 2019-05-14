package com.io;

import java.io.*;

/**
 * BufferInputStream, BufferOutputStream
 * 这两个流类为IO提供了带缓冲区的操作，一般打开文件进行写入
 * 或读取操作时，都会加上缓冲，这种流模式提高了IO的性能
 * 从应用程序中把输入放入文件，相当于将一缸水倒入到另一个缸中
 * FileOutputStream---->write()方法相当于一滴滴的把水移出去
 * DataOutputStream---->writeXxx()方法相当于一瓢瓢把水转移出去
 * BufferedOutputStream---->write方法更方便，相当于一瓢瓢水先放入桶中，再从桶中倒入到另一个缸中，从而提高性能
 */
public class CopyFile {
    private static void copyFile(File srcFile, File descFile) throws IOException {
        //如果源文件不存在
        if (!srcFile.exists()) {
            throw new IllegalArgumentException("源文件不存在");
        }
        if (!srcFile.isFile()) {
            throw new IllegalArgumentException(srcFile + "不是文件");
        }
        FileInputStream in = new FileInputStream(srcFile);
        FileOutputStream out = new FileOutputStream(descFile);
        //先读取源文件的内容
        byte[] bytes = new byte[8 * 1024];//暂存的大小为8kb
        int b;//b用来记录读取的字节数目，如果读完了则返回-1即EOF
        //read(buf);读取到buf中去，write(buf);从buf中取数据写到文件中
        while ((b = in.read(bytes)) != -1) {
            out.write(bytes, 0, b);
            out.flush();
        }
        in.close();
        out.close();
    }

    /**
     * 使用缓冲输入输出流的方法来拷贝文件
     *
     * @param srcFile
     * @param descFile
     */
    private static void copyFileByBuffer(File srcFile, File descFile) throws IOException {
        //判断是否为文件以及源文件是否存在
        if (!srcFile.exists()) {
            throw new IllegalArgumentException("源文件不存在");
        }
        if (!srcFile.isFile()) {
            throw new IllegalArgumentException(srcFile + "不是文件");
        }
        //构造缓冲输入输出流
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(descFile));
        int num;
        while ((num = in.read()) != -1) {
            out.write(num);
            out.flush();//刷新缓冲区，否则写入不到文件中去
        }
        in.close();
        out.close();
    }

    private static void copyFileByByte(File srcFile, File destFile) throws IOException {
        //判断是否为文件以及源文件是否存在
        if (!srcFile.exists()) {
            throw new IllegalArgumentException("源文件不存在");
        }
        if (!srcFile.isFile()) {
            throw new IllegalArgumentException(srcFile + "不是文件");
        }
        FileInputStream in = new FileInputStream(srcFile);
        FileOutputStream out = new FileOutputStream(destFile);
        int c;
        while ((c = in.read()) != -1) {
            out.write(c);
            out.flush();
        }
        in.close();
        out.close();
    }

    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        File file1 = new File("F:\\interface00.bmp");
        File file2 = new File("F:\\interface01.bmp");
//        copyFile(file1, file2); //32  字节数组的方式
//        copyFileByBuffer(file1,file2);  //4336    缓冲区的方式
        copyFileByByte(file1, file2);   //7950  一个字节一个字节的方式
        long end = System.currentTimeMillis();
        System.out.println("所用的时间：" + (end - start));
    }
}
