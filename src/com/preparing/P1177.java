package com.preparing;

import java.util.Scanner;

public class P1177 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = scanner.nextInt();
        }

        quickSort(arr, 0, arr.length - 1);

        for (int i = 0; i < m; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (high <= low) {
            return;
        }

        int pivotPosition = (high - low) / 2 + low;

        swap(arr, pivotPosition, high);

        pivotPosition = PartitionArr(arr, low, high);


        quickSort(arr, low, pivotPosition - 1);
        quickSort(arr, pivotPosition + 1, high);
    }

    private static int PartitionArr(int[] arr, int low, int high) {
        int temp = arr[low];


        while (low != high) {
            while (low < high && arr[high] >= temp) {
                high--;
            }
            if (low < high) {
                arr[low++] = arr[high];
            }
            while (low < high && arr[low] <= temp) {
                low++;
            }
            if (low < high) {
                arr[high--] = arr[low];
            }
        }
        arr[low] = temp;

        return low;

    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
