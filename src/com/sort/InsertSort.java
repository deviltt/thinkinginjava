package com.sort;

/**
 * 插入排序
 */
public class InsertSort {
    public static void insertSort(int[] arr) {
        int preIndex, current;
        for (int i = 1; i < arr.length; i++) {
            preIndex = i - 1;
            current = arr[i];   //因为要不停的使用current进行比较，因此需要保留current的值
            //和current进行比较，只要是比current大的就往后移动一格
            while (preIndex >= 0 && arr[preIndex] > current) {
                arr[preIndex + 1] = arr[preIndex--];
            }
            //当遇到比current还小的，说明刚好可以插入，此时的指针已经到后面一格了，因此要 +1 后再赋值
            arr[preIndex + 1] = current;
        }
    }
}
