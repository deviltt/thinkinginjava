package com.leetcode;

import java.util.TreeMap;

public class Solution1438 {
    public int longestSubarray(int[] nums, int limit) {
        TreeMap<Integer, Integer> map = new TreeMap<>();

        int result = 0;
        int left = 0;
        int right = 0;

        while (right < nums.length) {
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            while (map.lastKey() - map.firstKey() > limit) {
                map.put(nums[left], map.get(nums[left]) - 1);
                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }
                ++left;
            }
            result = Math.max(result, right - left + 1);
            ++right;
        }
        return result;
    }
}
