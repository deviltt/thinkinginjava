package com.preparing;

import java.util.Scanner;

public class P1271 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = scanner.nextInt();
        }

//        Arrays.sort(arr);
//        bubbleSort(arr);
        quickSort(arr, 0, arr.length-1);

        for (int i = 0; i < m; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /**
     * 核心思想：假设arr[low]为拐点，然后找拐点的位置，即将比拐点大的都移到右边，小的都移到左边
     * @param arr
     * @param low
     * @param high
     */
    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = arr[low];
            int initLow = low;
            int initHith = high;
            while (low < high) {
                while (low < high && arr[high] >= pivot) {
                    high--;
                }
                arr[low] = arr[high];   //把所有比pivot小的移到左边
                while (low < high && arr[low] <= pivot) {
                    low++;
                }
                arr[high] = arr[low];   //把所有比pivot大的移到右边
            }
            arr[low] = pivot;
            int pivotpos = low;
            quickSort(arr, initLow, low - 1);
            quickSort(arr, low + 1, initHith);
        }
    }
}
