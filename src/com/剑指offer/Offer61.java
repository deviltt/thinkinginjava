package com.剑指offer;

import java.util.HashSet;
import java.util.Set;

/**
 * 剑指 Offer 61. 扑克牌中的顺子
 * 不排序，记录最大值和最小值，遇到0则跳过
 */
public class Offer61 {
    public boolean isStraight(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int max = 0, min = 14;
        for (int num : nums) {
            if (num == 0) {
                continue;
            }
            if (set.contains(num)) {
                return false;
            }
            set.add(num);
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min <= 4;
    }
}
