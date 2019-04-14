package com.introductiontoalgorithms.chapter2;

/**
 * 简单插入排序(降序)
 */
public class DownInsertionSort {
    public static void downInsertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            //什么情况下需要右移数组元素
            while (j >= 0 && arr[j] < temp) {
                arr[j + 1] = arr[j];
                --j;
            }
            arr[j + 1] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 1, 6, 4, 1};
        downInsertionSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
