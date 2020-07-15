package com.leetcode2.string;

/**
 * 无重复字符的最长子串
 * 滑动窗口
 */
public class Solution3ed {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), result = 0;
        int[] index = new int[128];
        for (int i = 0, j = 0; j < n; j++) {
            i = Math.max(i, index[s.charAt(j)]);
            result = Math.max(result, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        return result;
    }
}
