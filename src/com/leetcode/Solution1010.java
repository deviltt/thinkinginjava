package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 输入：[30,20,150,100,40]
 * 输出：3
 * 解释：这三对的总持续时间可被 60 整数：
 * (time[0] = 30, time[2] = 150): 总持续时间 180
 * (time[1] = 20, time[3] = 100): 总持续时间 120
 * (time[1] = 20, time[4] = 40): 总持续时间 60
 */
public class Solution1010 {
    public static int numPairsDivisibleBy60(int[] time) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
//        int[] dictionary = new int[61];
        for (int i : time) {
//            res += map.getOrDefault(i, 0)
            res += map.getOrDefault(60 - i % 60, 0);
            if (i % 60 == 0)
                map.put(60, map.getOrDefault(60, 0) + 1);
            else
                map.put(i % 60, map.getOrDefault(i % 60, 0) + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        int num = numPairsDivisibleBy60(new int[]{15, 63, 451, 213, 37, 209, 343, 319});
        System.out.print(num);
    }
}
