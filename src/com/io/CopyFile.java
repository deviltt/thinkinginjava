package com.io;

import java.io.*;

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
        int b = 0;//b用来记录读取的字节数目，如果读完了则返回-1即EOF
        //read(buf);读取到buf中去，write(buf);从buf中取数据写到文件中
        while ((b = in.read(bytes)) != -1) {
            out.write(bytes, 0, b);
            out.flush();
        }
        in.close();
        out.close();
    }

    public static void main(String[] args) throws IOException {
        File file1 = new File("F:\\apache\\code\\7\\exists.txt");
        File file2 = new File("F:\\apache\\code\\7\\exists1.txt");
        copyFile(file1, file2);
    }
}
