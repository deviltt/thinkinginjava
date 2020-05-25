package com.preparing;

import java.util.Scanner;

public class P1923 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

//        quickSort(arr, 0, arr.length - 1);
        divide(arr, 0, arr.length - 1);

        System.out.print(arr[k]);
    }

    private static void quickSort(int[] arr, int l, int r) {
        if (l < r) {
            int pivot = arr[l];
            int ll = l;
            int rr = r;
            while (l < r) {
                while (l < r && arr[r] >= pivot) {
                    --r;
                }
                arr[l] = arr[r];
                while (l < r && arr[l] <= pivot) {
                    ++l;
                }
                arr[r] = arr[l];
            }
            arr[l] = pivot;

            quickSort(arr, ll, l - 1);
            quickSort(arr, l + 1, rr);
        }
    }

    private static void divide(int[] arr, int l, int r) {
        if (l < r) {
            int mid = (r - l) / 2 + l;
            divide(arr, l, mid);
            divide(arr, mid + 1, r);

            merge(arr, l, mid, r);
        }
    }

    private static void merge(int[] arr, int l, int mid, int r) {
        int[] temp = new int[r - l + 1];

        int i = l;//左起始位置
        int j = mid + 1;//右起始位置
        int k = 0;    //temp起始位置

        while (i <= mid && j <= r) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        //还有剩余的元素在数组中
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= r) {
            temp[k++] = arr[j++];
        }

        for (int m = 0; m < temp.length; m++) {
            arr[m + l] = temp[m];
        }
    }
}
