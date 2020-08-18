package com.剑指offer;

import java.util.HashMap;
import java.util.Map;

/**
 * 剑指 Offer 48. 最长不含重复字符的子字符串
 */
public class Offer48 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();    //记录已经出现过的字符的索引
        int max = 0;

        for (int i = 0, j = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                //更新已经出现过的字符的索引
                //j可能已经在重复字符索引的前面了，那么就不需要更新j
                j = Math.max(j, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - j + 1);
        }

        return max;
    }
}
