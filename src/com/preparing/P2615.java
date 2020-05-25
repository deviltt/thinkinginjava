package com.preparing;

import java.util.Scanner;

public class P2615 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int x = 0, y = (N - 1) / 2;
        int[][] arr = new int[N][N];

        //关键就是确定x 和 y 的位置，在右上或者正下方
        for (int i = 1; i <= N * N; i++) {
            arr[x][y] = i;
            if (arr[(x - 1 + N) % N][(y + 1) % N] == 0) {
                x = (x - 1 + N) % N;
                y = (y + 1) % N;
            } else {
                x = (x + 1) % N;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
