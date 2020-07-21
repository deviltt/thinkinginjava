package com.剑指offer;

/**
 * 归并排序，在每一次移动的时候，计算逆序的个数
 * 利用归并排序合并区间的时候的性质，
 * 只要是 添加 右边区间的值的时候 ，这个值比所有
 * 左区间的值小，因此 左区间的大小 就是 逆序对的个数
 */
public class Offer51 {
    private int result;
    private int[] temp;

    public int reversePairs(int[] nums) {
        int len = nums.length;
        temp = new int[len];
        sort(nums, 0, len - 1);
        return result;
    }

    private void sort(int[] arr, int left, int right) {
        //left==right 说明只有一个节点，不需要再分了
        if (left < right) {
            int mid = (right - left) / 2 + left;
            sort(arr, left, mid);
            sort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private void merge(int[] arr, int left, int mid, int right) {
        int i = left, j = mid + 1;
        int t = 0;
        while (i <= mid && j <= right) {
            //小于等于表示 相等的情况下不算是 逆序对
            if (arr[i] <= arr[j]) {
                temp[t++] = arr[i++];
            } else {
                result += mid - i + 1;
                temp[t++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[t++] = arr[i++];
        }
        while (j <= right) {
            temp[t++] = arr[j++];
        }
        t = 0;
        while (left <= right) {
            arr[left++] = temp[t++];
        }
    }
}
