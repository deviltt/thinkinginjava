package com.bytedance;
/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串的长度。
 * abcdaabb
 */

import java.util.HashMap;
import java.util.Map;

public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();    //Integer用于存放对应Character在字符串中的位置
        int result = 0;
        for (int i = 0, j = 0; i < s.length(); i++) {
            //如果遇到重复的字符，需要确定窗口最左边的位置
            if (map.containsKey(s.charAt(i))) {
                j = Math.max(j, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);    //更新重复元素在map中保留的位置
            result = Math.max(result, i - j + 1);
        }
        return result;
    }
}
