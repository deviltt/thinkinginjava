package com.preparing.牛客网;

import java.util.Scanner;

/**
 * 字符串最后一个单词的长度
 */
public class Method5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();

        String[] strings=s.split(" ");
        System.out.println(strings[strings.length-1].length());
    }
}
