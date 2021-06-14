package com.leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // 优先队列排列
        PriorityQueue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] != o2[0] ? o2[0] - o1[0] : o1[1] - o2[1];
            }
        });

        // 把元素存入优先队列
        for (int i = 0; i < k; i++) {
            queue.offer(new int[]{nums[i], i});
        }

        // 结果数组
        int[] result = new int[nums.length - k + 1];
        result[0] = queue.peek()[0];

        // 每次循环从优先队列取顶元素
        for (int i = k; i < nums.length; i++) {
            queue.offer(new int[]{nums[i], i});
            while (queue.peek()[1] <= i - k) {
                // 如果优先队列顶端元素的索引小于 左边界，那么就要从优先队列中去除
                queue.poll();
            }
            result[i - k + 1] = queue.peek()[0];
        }

        return result;
    }
}
