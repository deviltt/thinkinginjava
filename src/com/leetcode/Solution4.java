package com.leetcode;

/**
 * 4. 寻找两个正序数组的中位数
 * 思路：
 * 先分别用归并排序把两个数组顺序都排好
 * 然后合并两个有序数组
 * 最后在新数组中寻找中位数
 */
public class Solution4 {
    private int[] target;

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int numsLen1 = nums1.length, numsLen2 = nums2.length;
        target = new int[numsLen1 + numsLen2];
        //分别对两个数组进行分支排序
        mergeSort(nums1, 0, numsLen1 - 1);
        mergeSort(nums2, 0, numsLen2 - 1);
        //经过上面几步，nums1和nums2都变成了有序数组
        //合并这两个数组
        int l1 = 0, r1 = nums1.length - 1, l2 = 0, r2 = nums2.length - 1;
        //合并两个经过分治排序后的数组
        mergeTwoArr(nums1, l1, r1, nums2, l2, r2);

        int right = target.length - 1;
        int mid = right / 2;

        if (mid == 0) {
            return target[mid];
        } else {
            return (target[mid] + target[mid + 1]) / 2;
        }
    }

    /**
     * 分
     * @param arr
     * @param left
     * @param right
     */
    private void mergeSort(int[] arr, int left, int right) {
        if (arr.length == 0) {
            return;
        }
        int mid = (right - left) / 2 + left;
        if (left < right) {
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    /**
     * 工具函数，用来合并arr1和arr2两个数组，用第三个数组target保存合并结果
     * @param arr1
     * @param l1
     * @param r1
     * @param arr2
     * @param l2
     * @param r2
     */
    private void mergeTwoArr(int[] arr1, int l1, int r1, int[] arr2, int l2, int r2) {
        int index = 0;
        while (l1 <= r1 && l2 <= r2) {
            if (arr1[l1] < arr2[l2]) {
                target[index++] = arr1[l1++];
            } else {
                target[index++] = arr2[l2++];
            }
        }
        while (l1 <= r1) {
            target[index++] = arr1[l1++];
        }
        while (l2 <= r2) {
            target[index++] = arr2[l2++];
        }
    }

    /**
     * 治
     * @param arr
     * @param left
     * @param mid
     * @param right
     */
    private void merge(int[] arr, int left, int mid, int right) {
        int i = left, j = mid + 1, index = 0;

        mergeTwoArr(arr, i, mid, arr, j, right);

        while (left <= right) {
            arr[left++] = target[index++];
        }
    }
}
