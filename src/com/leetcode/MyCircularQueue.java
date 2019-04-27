package com.leetcode;

/**
 * 创建循环队列三个重要的式子：
 * 1. 入队 tail=(tail+1)%size;
 * 2. 出队 head=(head+1)%size;
 * 3. 判断队列是否满 (tail+1)%size==head;
 */
public class MyCircularQueue {
    private int tail, head, size;
    private int[] data;

    /**
     * Initialize your data structure here. Set the size of the queue to be k.
     */
    public MyCircularQueue(int k) {
        data = new int[k];
        size = k;
        tail = -1;
        head = -1;
    }

    /**
     * Insert an element into the circular queue. Return true if the operation is successful.
     */
    public boolean enQueue(int value) {
        if (isFull())
            return false;
        if (isEmpty())
            head = 0;
        tail = (tail + 1) % size;
        data[tail] = value;
        return true;
    }

    /**
     * Delete an element from the circular queue. Return true if the operation is successful.
     */
    public boolean deQueue() {
        if (isEmpty())
            return false;
        //这种情况属于队列中没有元素了，就将head和tail归位为原来的地方
        if (head == tail) {
            head = -1;
            tail = -1;
            return true;
        }
        head = (head + 1) % size;
        return true;
    }

    /**
     * Get the front item from the queue.
     */
    public int Front() {
        if (isEmpty())
            return -1;
        return data[head];
    }

    /**
     * Get the last item from the queue.
     */
    public int Rear() {
        if (isEmpty())
            return -1;
        return data[tail];
    }

    /**
     * Checks whether the circular queue is empty or not.
     */
    public boolean isEmpty() {
        return head == -1;
    }

    /**
     * Checks whether the circular queue is full or not.
     */
    public boolean isFull() {
        return (tail + 1) % size == head;
    }
}
