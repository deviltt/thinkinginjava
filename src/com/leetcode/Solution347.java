package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 347. 前 K 个高频元素
 * 桶排：出现的次数作为下标
 */
public class Solution347 {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] lists = new List[nums.length + 1];
        int[] res = new int[k];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1); //统计对应数字出现的次数
        }

        //遍历map，反过来统计次数对应的出现的数字，并保存到lists中
        for (int i : map.keySet()) {
            int value = map.get(i);
            if (lists[value] == null) {
                lists[value] = new ArrayList<>();
            }
            lists[value].add(i);
        }

        //反过来遍历lists，相当于按出现次数的由高到底查找对应的数字
        int count = 0;
        for (int i = lists.length - 1; i >= 0 && count < k; i--) {
            if (lists[i] != null) {
                for (int j = 0; j < lists[i].size(); j++) {
                    res[count++] = lists[i].get(j);
                }
            }
        }

        return res;
    }
}
