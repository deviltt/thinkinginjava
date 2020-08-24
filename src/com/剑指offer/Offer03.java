package com.剑指offer;

import java.util.*;

/**
 * 剑指 Offer 03. 数组中重复的数字
 * 使用Set
 */
public class Offer03 {
    public int findRepeatNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 0);
            }else{
                return num;
            }
        }
        return -1;
    }
}
