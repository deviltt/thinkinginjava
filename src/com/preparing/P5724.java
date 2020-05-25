package com.preparing;

import java.util.Scanner;

public class P5724 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int N=scanner.nextInt();
        int[] arr=new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=scanner.nextInt();
        }

        int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;

        for (int num : arr) {
            if (num>max){
                max=num;
            }
            if (num<min){
                min=num;
            }
        }
        System.out.println(max-min);
    }
}
