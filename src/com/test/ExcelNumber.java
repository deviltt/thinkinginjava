package com.test;

import java.util.Scanner;

/**
 * 功能：输入一个整数，转换成excel表头中的字母
 * 如aa, bbc等
 * 重要的是考虑z, aa, ... ,az, ba, 这几个关键点
 */
public class ExcelNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入整数:");
        int number = scanner.nextInt();
        System.out.println("转化的结果为:");
        System.out.println(transferExcel(number));
    }

    private static String transferExcel(int number) {
        StringBuilder stringBuilder = new StringBuilder();
        while (number != 0) {
            //考虑当能被26整除时，直接为Z
            if (number % 26 != 0){
                stringBuilder.append((char) ('A' + number % 26 - 1));
                number /= 26;
            }
            else{
                stringBuilder.append((char) ('A' + 25));
                number = number / 26 - 1;
            }
        }
        return stringBuilder.reverse().toString();
    }
}
