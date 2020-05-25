package com.preparing;

import java.util.Scanner;

public class P1307 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        boolean flag = false;
        if (N < 0) {
            flag = true;
        }
        int temp = Math.abs(N);
        StringBuilder stringBuilder = new StringBuilder("" + temp);
        int result= Integer.valueOf(stringBuilder.reverse().toString()) ;

        if (flag){
            System.out.println(-result);
        }else{
            System.out.println(result);
        }
    }
}
