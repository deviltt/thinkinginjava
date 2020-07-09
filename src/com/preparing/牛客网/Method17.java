package com.preparing.牛客网;

import java.util.Scanner;

/**
 * 坐标移动
 */
public class Method17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();

            int[] arr = new int[]{0, 0};
            String[] strings = s.split(";");

            //检验是否合法
            for (String temp : strings) {
                if (canMove(temp)) {
                    char flag = temp.charAt(0);
                    int moveIndex = Integer.valueOf(temp.substring(1));
                    switch (flag) {
                        case 'A':
                            arr[0] -= moveIndex;
                            break;
                        case 'D':
                            arr[0] += moveIndex;
                            break;
                        case 'W':
                            arr[1] += moveIndex;
                            break;
                        case 'S':
                            arr[1] -= moveIndex;
                            break;
                        default:
                            break;
                    }
                }
            }
            System.out.println(arr[0]+","+arr[1]);
        }
    }

    private static boolean canMove(String s) {
        //三位
        //A D W S + 两位数字
        if (!(s.length()>=2&&s.length()<=3)) {
            return false;
        }

        char c = s.charAt(0);
        if (!(c == 'A' || c == 'D' || c == 'S' || c == 'W')) {
            return false;
        }

        String temp = s.substring(1);
        boolean flag = true;
        for (int i = 0; i < temp.length(); i++) {
            if (!(temp.charAt(i) >= '0' && temp.charAt(i) <= '9')) {
                flag = false;
                break;
            }
        }

        return flag;
    }
}
