package com.剑指offer;

/**
 * 调整数组顺序使奇数位于偶数前面
 * 双向指针法
 */
public class Offer21ed {
    public int[] exchange(int[] nums) {
        int l = 0, r = nums.length - 1;

        while (l < r) {
            //左指针遇到偶数停止移动
            if ((nums[l] & 1) == 1) {
                ++l;
                continue;
            }
            if ((nums[r] & 1) == 0) {
                --r;
                continue;
            }
            //左指针遇到偶数，右指针遇到奇数，交换
            int temp = nums[l];
            nums[l++] = nums[r];
            nums[r--] = temp;
        }
        return nums;
    }
}
