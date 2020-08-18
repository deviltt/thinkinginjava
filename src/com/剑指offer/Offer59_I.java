package com.剑指offer;

import java.util.ArrayList;
import java.util.List;

/**
 * 剑指 Offer 59 - I. 滑动窗口的最大值
 * 如果上次窗口的最大值在本次窗口中，那么只需要比较一次就行
 * <p>
 * 如果不在本次窗口中，那么就需要遍历找出最大值
 */
public class Offer59_I {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length - k + 1;    //滑窗数
        if (nums.length == 0) {
            return new int[]{0};
        }
        int[] res = new int[n];
        int index = 0, max = Integer.MIN_VALUE;    //记录填入结果数组的索引

        int t = -1;   //记录当前窗口最大值的索引

        for (int i = 0; i < n; i++) {
            // t >= i 表示上个窗口的最大值索引在当前窗口中
            if (t >= i) {
                if (nums[i + k - 1] > max) {
                    t = i + k - 1;
                    max = nums[i + k - 1];
                }
            } else {  //遍历窗口找最大值
                max = nums[i];
                for (int j = i + 1; j < i + k; j++) {
                    if (nums[j] > max) {
                        t = j;
                        max = nums[j];
                    }
                }
            }
            res[index++] = max;
        }
        return res;
    }
}
