package com.leetcode2.string;

public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        if ("".equals(s) || s == null) {
            return 0;
        }
        int result = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                if (!s.substring(i, j).contains("" + s.charAt(j))) {
                    result = Math.max(result, s.substring(i, j).length() + 1);
                } else {
                    break;
                }
            }
        }
        return result;
    }
}
