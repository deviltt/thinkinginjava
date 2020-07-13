package com.leetcode;

import java.util.*;

/**
 * 350. 两个数组的交集 II
 */
public class Solution350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        //1.遍历其中一个数组，用map记录数字对应的个数
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums1) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        //2.创建List，动态添加交集数字
        List<Integer> list = new ArrayList<>();

        for (int i : nums2) {
            if (map.containsKey(i)) {
                if (map.get(i) != 0) {
                    list.add(i);
                    map.put(i, map.get(i) - 1);
                }
            }
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
