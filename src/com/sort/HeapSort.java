package com.sort;

import java.util.Collections;

/**
 * 1.建立最大堆(上浮)
 * 2.首位交换，长度缩 1
 * 3.维持最大堆
 */
public class HeapSort {
    public static void heapSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        int len = arr.length;
        //先构建初始的最大堆
        buildMaxHeap(arr, len);
        //每次构建完最大堆后，首尾元素交换，并且数组长度减一，即最后一个元素已经是最大的元素，保持不动
        for (int i = len - 1; i > 0; i--) {
            swap(arr, 0, i);
            len--;
            heapify(arr, 0, len);   //维持下沉后的最大堆结构
        }
    }

    private static void buildMaxHeap(int[] arr, int len) {
        for (int i = (int) (Math.floor(len / 2) - 1); i >= 0; i--) {
            heapify(arr, i, len);
        }
    }

    private static void heapify(int[] arr, int i, int len) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largeIndex = i;
        //两个if逻辑块的作用是 确定这个子树的最大元素的索引
        if (left < len && arr[left] > arr[largeIndex]) {
            largeIndex = left;
        }
        if (right < len && arr[right] > arr[largeIndex]) {
            largeIndex = right;
        }
        //如果最大元素有变化，则进行交换，并且需要维护交换后的子树的最大堆性质
        if (largeIndex != i) {
            swap(arr, i, largeIndex);
            heapify(arr, largeIndex, len); //维护下面的大堆平衡
        }
    }

    /**
     * 交换数组中的两个元素
     *
     * @param arr
     * @param i
     * @param j
     */
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
