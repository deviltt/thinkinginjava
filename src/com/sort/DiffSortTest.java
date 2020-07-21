package com.sort;

import java.util.Arrays;

public class DiffSortTest {
    public static void main(String[] args) {
        int[] arr = new int[]{8, 7, 6, 3, 5};
//        HeapSort.heapSort(arr);
        InsertSort.insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
