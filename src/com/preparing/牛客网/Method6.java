package com.preparing.牛客网;

import java.util.Scanner;

/**
 * 计算字符个数
 */
public class Method6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String str1=scanner.nextLine().toUpperCase();
        String str2=scanner.nextLine().toUpperCase();

        int count=0;

        for (int i = 0; i < str1.length(); i++) {
            if (str2.charAt(0) == (str1.charAt(i))){
                ++count;
            }
        }

        System.out.println(count);
    }
}
