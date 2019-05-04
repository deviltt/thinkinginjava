package com.io;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File file=new File("F:\\happy");
        if (!file.exists()){
            file.mkdir();   //创建目录，也可以创建多级目录file.mkdirs();
        }

        //是否是一个目录，如果是目录返回true，如果不是或者目录不存在则返回false
        System.out.println(file.isDirectory());
        //是否是一个文件
        System.out.println(file.isFile());

        File file1=new File("F:\\happy\\日记1.txt");
        if (!file1.exists()){
            file1.createNewFile();
        }

        //常用的File对象的API
        System.out.println(file);
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getName());
        System.out.println(file1.getName());
        System.out.println(file.getParent());
        System.out.println(file1.getParent());
    }
}
