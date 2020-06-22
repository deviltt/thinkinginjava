package com.剑指offer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution56_II {
    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<Integer, Integer> entry=iterator.next();
            if (entry.getValue()==1){
                return entry.getKey();
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        singleNumber(new int[]{3,4,3,3});
    }
}
