package com.leetcodespecialtopic.binarysearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        int length = Math.min(nums1.length, nums2.length);
        int[] result = new int[length];
        List<Integer> list=new ArrayList<>();
        int k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                list.add(nums1[i]);
                ++i;
                ++j;
            } else if (nums1[i] > nums2[j]) {
                ++j;
            } else {
                ++i;
            }
        }
        for (int index = 0; index < list.size(); index++) {
            result[index]=list.get(index);
        }
        return result;
    }
}
