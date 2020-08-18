package com.剑指offer;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 剑指 Offer 59 - II. 队列的最大值
 * 用辅助队列来记录当前队列的最大值
 * 即每次更新队列的时候去维护辅助队列
 */
public class Offer59_II {
    private Queue<Integer> queue;
    private Deque<Integer> deque;

    public Offer59_II() {
        queue = new LinkedList<>();
        deque = new LinkedList<>();
    }

    public int max_value() {
        if (deque.isEmpty()) {
            return -1;
        }
        return deque.getFirst();
    }

    public void push_back(int value) {
        queue.add(value);
        //如果比最后一个数小则直接添加
        while (!deque.isEmpty() && deque.getLast() < value) {
            deque.removeLast();
        }
        deque.addLast(value);
    }

    public int pop_front() {
        //更新双端队列
        if (queue.isEmpty()) {
            return -1;
        } else {
            if (queue.peek().equals(deque.getFirst())) {
                deque.removeFirst();
            }
            return queue.poll();
        }
    }
}
