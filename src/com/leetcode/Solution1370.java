package com.leetcode;

public class Solution1370 {
    public String sortString(String s) {
        int[] buckets = new int[26];

        for (int i = 0; i < s.length(); i++) {
            ++buckets[s.charAt(i) - 'a'];
        }

        StringBuilder builder = new StringBuilder();

        while (builder.length() < s.length()) {
            for (int i = 0; i < buckets.length; i++) {
                if (buckets[i] > 0) {
                    builder.append((char) (i + 'a'));
                    --buckets[i];
                }
            }

            for (int i = buckets.length - 1; i >= 0; i--) {
                if (buckets[i] > 0) {
                    builder.append((char) (i + 'a'));
                    --buckets[i];
                }
            }
        }

        return builder.toString();
    }
}
