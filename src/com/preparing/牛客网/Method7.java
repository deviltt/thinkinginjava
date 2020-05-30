package com.preparing.牛客网;

import java.util.Scanner;

public class Method7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        dealStr(str1);
        dealStr(str2);
    }

    private static void dealStr(String str) {
        //计算循环输出的次数
        int length = str.length() - 1;
        int count = length / 8;
        int toAddNum = (length + 1) % 8;

        for (int i = 0; i <= count; i++) {
            if (i == count) {
                //当刚好为8个的时候模为0，如果不赋值8，那么输出全是0，因此要赋值8
                if (toAddNum == 0) {
                    toAddNum = 8;
                }
                StringBuilder stringBuilder = new StringBuilder(str.substring(i * 8, i * 8 + toAddNum));
                for (int j = 0; j < 8 - toAddNum; j++) {
                    stringBuilder.append(0);
                }
                System.out.println(stringBuilder.toString());
            } else {
                System.out.println(str.substring(i * 8, (i + 1) * 8));
            }
        }
    }
}
