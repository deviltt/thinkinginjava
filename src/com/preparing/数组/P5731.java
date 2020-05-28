package com.preparing.数组;

import java.util.Scanner;

public class P5731 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n + 2][n + 2];
        int k = 1;
        int x = 1, y = 0;

        while (k <= n * n) {
            while (y < n && arr[x][y + 1] == 0) {   //两个条件
                arr[x][++y] = k++;
            }
            while (x < n && arr[x+1][y] == 0) {
                arr[++x][y] = k++;
            }
            while (y>1&&arr[x][y-1]==0){
                arr[x][--y]=k++;
            }
            while (x > 1 && arr[x - 1][y] == 0) {
                arr[--x][y]=k++;
            }
        }

        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=n;j++){
                System.out.printf("%3d",arr[i][j]);
            }
            System.out.println();
        }
    }
}
