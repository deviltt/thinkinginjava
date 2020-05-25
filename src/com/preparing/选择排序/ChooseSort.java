package com.preparing.选择排序;

public class ChooseSort {
    public static void main(String[] args) {
        int arr[] = {7, 2, 6, 4, 8, 3, 5};

        chooseSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void chooseSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            //找最小值
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
