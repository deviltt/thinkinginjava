package com.面试金典;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 面试题 01.02. 判定是否互为字符重排
 * 方法1思路：
 * 如果重新排列能变成另一个字符串，那么两个字符串的字符种类和个数一定是相同的
 */
public class Classic01_02 {
    public boolean CheckPermutation(String s1, String s2) {
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        //遍历字符数组
        for (char c : chars1) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : chars2) {
            if (map.get(c) == null) {
                return false;
            }
            map.put(c, map.get(c) - 1);
        }

        //遍历map
        Set<Map.Entry<Character, Integer>> set = map.entrySet();
        for (Map.Entry<Character, Integer> entry : set) {
            if (entry.getValue() != 0) {
                return false;
            }
        }

        return true;
    }
}
