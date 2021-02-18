package com.designpattern.strategy;

public class InsertSort implements ISort {
    @Override
    public void sort(int[] arr) {
        // 从第二个开始往前插
        for (int i = 1; i < arr.length; i++) {
            int currentNum = arr[i];
            int j = i - 1;
            while (j >= 0 && currentNum < arr[j]) {
                arr[j + 1] = arr[j];
                --j;
            }
            // 跳出循环的时候
            arr[j + 1] = currentNum;
        }
    }
}
