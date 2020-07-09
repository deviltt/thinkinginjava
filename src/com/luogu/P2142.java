package com.luogu;

import java.util.Scanner;

public class P2142 {
    public static void main(String[] args) {
        //先获得输入
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();


        boolean flag = false;
        //判断 a和b 的大小，如果 a<b 需要交换两个的位置
        if ((a.length() == b.length() && a.compareTo(b) < 0) || a.length() < b.length()) {
            String temp = a;
            a = b;
            b = temp;
            flag = true;
        }

        //按照最大的开数组，位数不够的都默认是0
        int[] arr1 = new int[a.length()];
        int[] arr2 = new int[a.length()];

        //把字符数组颠倒过来
        int aLength = a.length();
        int bLength = b.length();
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = a.charAt(aLength - i - 1) - '0';
        }
        for (int i = 0; i < bLength; i++) {
            arr2[i] = b.charAt(bLength - i - 1) - '0';
        }

        //index表示循环的次数
        int index = Math.max(a.length(), b.length());

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < index; i++) {
            if (arr1[i] < arr2[i]) {
                arr1[i] += 10;
                --arr1[i + 1];
            }
            stringBuilder.append(arr1[i] - arr2[i]);
        }

        String result = stringBuilder.reverse().toString();
        char c = result.charAt(0);
        int tempIndex = 0;
        while (c == '0') {
            if (tempIndex == result.length() - 1) {
                break;
            }
            ++tempIndex;
            c = result.charAt(tempIndex);
        }

        if (flag) {
            System.out.println("-" + result.substring(tempIndex));
        } else {
            System.out.println(result.substring(tempIndex));
        }
    }
}
