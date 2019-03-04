package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution136 {
    public int singleNumber(int[] nums) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i : nums) {
//            map.put(i, map.getOrDefault(i, 0) + 1);
//        }
//        for (int i : map.keySet()){
//            if (map.get(i) == 1)
//                return i;
//        }
//        return -1;
        int temp = nums[0];
        for(int i = 1; i < nums.length;i++)
            temp ^=  nums[i];
        return temp;
    }
}
