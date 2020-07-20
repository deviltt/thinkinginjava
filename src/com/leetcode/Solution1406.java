package com.leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

//使用优先队列
public class Solution1406 {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(stones.length, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int i : stones) {
            priorityQueue.add(i);
        }
        while (priorityQueue.size() > 1) {
            int tail1 = priorityQueue.poll();
            int tail2 = priorityQueue.poll();
            priorityQueue.offer(tail1 - tail2);
        }
        return priorityQueue.poll();
    }
}
