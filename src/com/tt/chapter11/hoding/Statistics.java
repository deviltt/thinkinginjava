package com.tt.chapter11.hoding;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * 统计产生随机数的个数
 */
public class Statistics {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        Random random = new Random(47);
        for (int i = 0; i < 1000; i++) {
            int r = random.nextInt(20);
            map.put(r, map.getOrDefault(r, 1) + 1);
        }
        System.out.println(map);
    }
}
