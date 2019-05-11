package com.io;

import java.io.File;

/**
 * 列出File的一些常用的操作，比如过滤、遍历等操作
 */
public class FileUtils {
    /**
     * 列出指定目录下（包括其子目录）的所有文件
     *
     * @param dir
     */
    public static void listDirectory(File dir) {
        //如果目录不存在
        if (!dir.exists()) {
            throw new IllegalArgumentException("目录" + dir + "不存在");
        }
        if (!dir.isDirectory()) {
            throw new IllegalArgumentException(dir + "不是目录");
        }

//        String[] fileName=dir.list();   //返回的是文件或者目录的名称，不包含子目录里面的内容
//        for (String s:fileName)
//            System.out.println(s);

        //遍历子目录下的内容就需要构造成File对象做递归操作，File提供了直接返回File对象的API
        File[] files = dir.listFiles();//返回的是 直接子目录（文件）的抽象
        if (files!=null&&files.length>0){
            for (File file:files){
                if (file.isDirectory()){
                    listDirectory(file);
                }else {
                    System.out.println(file);
                }
            }
        }
    }

    public static void main(String[] args) {
        listDirectory(new File("F:\\apache"));
    }
}
