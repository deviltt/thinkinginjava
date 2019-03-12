package com.sort;

public class BubleSort {
    public static void bubleSort(int[] arr) {
        //外循环表示一共要进行多少次冒泡
        for (int i = 0; i < arr.length - 1; i++) {
            //外循环表示每一次冒泡循环要比较多少个数
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {8, 7, 4, 3, 0};
        bubleSort(arr);
        for (int i : arr)
            System.out.print(i + " ");
    }
}
