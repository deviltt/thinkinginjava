package com.preparing.排序;

public class BubbleSort {
    public static void main(String[] args) {

    }

    private static void bubbleSort(int[] arr) {
        //外循环表示一共要进行多少次冒泡
        for (int i = 0; i < arr.length - 1; i++) {
            //再确定一共要比较多少次
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
