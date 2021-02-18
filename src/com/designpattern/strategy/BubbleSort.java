package com.designpattern.strategy;

public class BubbleSort implements ISort {
    @Override
    public void sort(int[] arr) {
        // 循环的次数
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j + 1] += arr[j];
                    arr[j] = arr[j + 1] - arr[j];
                    arr[j + 1] -= arr[j];
                }
            }
        }
    }
}
