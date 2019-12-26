package com.leetcodespecialtopic.binarysearch;

/**
 * 153. 寻找旋转排序数组中的最小值
 * 假设按照升序排序的数组在预先未知的某个点上进行了旋转。
 * ( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
 * 请找出其中最小的元素。
 * 你可以假设数组中不存在重复元素。
 * 输入: [3,4,5,1,2]
 * 输出: 1
 */
public class Solution153 {
    public int findMin(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int left = 0, right = nums.length - 1;
        int mid;
        if (nums[left] < nums[right]) {
            return nums[0];
        }
        //用二分法找到中枢点 pivot
        while (left < right) {
            mid = left + (right - left) / 2;
            if (nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            } else {
                if (nums[mid] < nums[left]) {
                    right = mid - 1;
                } else {
                    /*
                     * 为什么不是left=mid; 因为由外层if得知 nums[mid]<=nums[mid+1]，
                     * 因此当前值可以直接舍弃，left = mid + 1;
                     */
                    left = mid + 1;
                }
            }
        }
        return nums[left + 1];
    }
}
