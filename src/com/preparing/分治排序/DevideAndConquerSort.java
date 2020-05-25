package com.preparing.分治排序;

public class DevideAndConquerSort {
    public static void main(String[] args) {

        int arr[] = {7, 2, 6, 4, 8, 3, 5};

        divide(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void divide(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (right - left) / 2 + left;
            divide(arr, left, mid);
            divide(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int k = 0;
        int[] temp = new int[right - left + 1];

        while (i <= mid && j <= right) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (int l = 0; l < temp.length; l++) {
            arr[l + left] = temp[l];
        }
    }
}
