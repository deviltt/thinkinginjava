package com.sort;

public class MergeSort {
    public static void mergeSort(int[] arr){
        //temp数组的目的就是用来保存合并的数
        int[] temp = new int[arr.length];
        sort(arr, 0, arr.length - 1, temp);
    }

    private static void sort(int[] arr, int low, int high, int[] temp) {
        if (low < high){
            int mid = (low + high) / 2;
            //分
            sort(arr, low, mid, temp);
            sort(arr, mid + 1, high, temp);
            //并
            merge(arr, low, mid, high, temp);
        }
    }

    private static void merge(int[] arr, int low, int mid, int high, int[] temp) {
        //1.先借用temp的数组空间将arr指定边界的元素进行合并
        //为什么要用i、j来临时保存low和high，是因为要操作arr，如果把low和high覆盖了
        //那么操作arr就是错误的
        int i = low, j = mid + 1, t = 0;
        while (i <= mid && j <= high){
            if (arr[i] < arr[j])
                temp[t++] = arr[i++];
            else
                temp[t++] = arr[j++];
        }
        //将边界中剩余的元素合并到temp数组中，而这些数肯定是排序好的可直接添加
        while (i <= mid)
            temp[t++] = arr[i++];
        while (j <= high)
            temp[t++] = arr[j++];

        //将temp中排序好的数保存到arr数组中去
        t = 0;
        while (low <= high)
            arr[low++] = temp[t++];
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 5, 2, 8};
        mergeSort(arr);
        for (int temp : arr)
            System.out.print(temp + " ");
    }
}
