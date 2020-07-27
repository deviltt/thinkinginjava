package com.剑指offer;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 剑指 Offer 41. 数据流中的中位数
 */
public class Offer41 {
    Queue<Integer> topHeap, smallHeap;

    /**
     * initialize your data structure here.
     */
    public Offer41() {
        smallHeap = new PriorityQueue<>();
        topHeap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
    }

    public void addNum(int num) {
        if (topHeap.size() != smallHeap.size()) {
            topHeap.add(num);
            smallHeap.add(topHeap.poll());
        } else {
            smallHeap.add(num);
            topHeap.add(smallHeap.poll());
        }
    }

    public double findMedian() {
        return topHeap.size()==smallHeap.size()? (topHeap.peek() + smallHeap.peek()) / 2.0 : topHeap.peek();
    }
}
