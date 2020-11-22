package com.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * 347. 前 K 个高频元素
 * 堆的思想:维护小顶堆
 */
public class Solution347ed {
    public static int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        //构建一个最小堆
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>((a, b) -> map.get(a) - map.get(b));

        //往堆中添加元素，如果
        for (int key : map.keySet()) {
            int value = map.get(key);   //当前数字出现的次数
            if (priorityQueue.size() < k) {
                priorityQueue.add(key);
            } else if (map.get(priorityQueue.peek()) < value) {
                priorityQueue.remove();
                priorityQueue.add(key);
            }
        }

        //错误的原因是priorityQueue在移除一个元素后，size会发生变化的，所以不适用于foreach的场景
//        for (int i = 0; i < priorityQueue.size(); i++) {
//            res[i]=priorityQueue.remove();
//        }

        while (!priorityQueue.isEmpty()) {
            res[k--] = priorityQueue.remove();
        }

        return res;
    }

    public static void main(String[] args) {
        topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2);
    }
}
