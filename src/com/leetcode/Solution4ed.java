package com.leetcode;

/**
 * 4. 寻找两个正序数组的中位数
 * 折半删除法
 * 如果两个数组长度是奇数，那么中位数索引 为 length / 2，它是 第 (length/2)+1 个最小数
 * 如果两个数组长度是偶数，那么中位数索引 为 length / 2 - 1 和 length / 2，分别是 第 length / 2 和 length / 2 + 1 个最小数
 * 因为数组下标是从0开始的
 */
public class Solution4ed {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int length1 = nums1.length, length2 = nums2.length;
        int totalLength = length1 + length2;
        double result = 0;
        if (totalLength % 2 == 1) {
            int midIndex = totalLength / 2;
            result = getKthElement(nums1, nums2, midIndex + 1);
        } else {
            int middleIndex1 = totalLength / 2 - 1, middleIndex2 = totalLength / 2;
            result = (getKthElement(nums1, nums2, middleIndex1 + 1) + getKthElement(nums1, nums2, middleIndex2 + 1)) / 2.0;
        }

        return result;
    }

    /**
     * 如找第9个最小数，折半为 9 / 2 - 1，减 1 表示对应的数组下标
     * @param arr1
     * @param arr2
     * @param k 表示第 k 个最小数
     * @return
     */
    private int getKthElement(int[] arr1, int[] arr2, int k) {
        int length1 = arr1.length, length2 = arr2.length;
        int index1 = 0, index2 = 0;

        while (true) {
            //边界情况
            if (index1 == length1) {
                return arr2[index2 + k - 1];
            }
            if (index2 == length2) {
                return arr1[index1 + k - 1];
            }
            if (k == 1) {
                return Math.min(arr1[index1], arr2[index2]);
            }

            int half = k / 2;
            int newIndex1 = Math.min(length1, index1 + half) - 1;
            int newIndex2 = Math.min(length2, index2 + half) - 1;
            int pivot1 = arr1[newIndex1];
            int pivot2 = arr2[newIndex2];
            if (pivot1 <= pivot2) {
                k -= (newIndex1 - index1 + 1);
                index1 = newIndex1 + 1;
            } else {
                k -= (newIndex2 - index2 + 1);
                index2 = newIndex2 + 1;
            }
        }
    }
}
