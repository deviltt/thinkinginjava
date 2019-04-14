package com.introductiontoalgorithms.chapter2;

public class ChosenSort {
    public static void chosenSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int j = i;
            int min = arr[i];   //默认第i个数为最小数
            int minIndex = 0;   //用来记录最小值的索引
            while (j < arr.length) {
                if (arr[j] <= min) {
                    min = arr[j];
                    minIndex = j;
                }
                j++;
            }
            arr[minIndex] = arr[i];
            arr[i] = min;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 1, 3, 4, 0};
        chosenSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
