package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 350. 两个数组的交集 II
 * 双指针法
 */
public class Solution350ed {
    public int[] intersect(int[] nums1, int[] nums2) {
        //对两个数组排序
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int p1 = 0, p2 = 0;
        List<Integer> list = new ArrayList<>();
        while (p1 < nums1.length && p2 < nums2.length) {
            if (nums1[p1] == nums2[p2]) {
                list.add(nums1[p1]);
                ++p1;
                ++p2;
            } else if (nums1[p1] < nums2[p2]) {
                ++p1;
            } else {
                ++p2;
            }
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
