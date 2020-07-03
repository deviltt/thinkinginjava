package com.剑指offer;

import java.util.Stack;

public class Offer30 {
    Stack<Integer> A, B;

    /**
     * initialize your data structure here.
     */
    public Offer30() {
        A = new Stack<>();
        B = new Stack<>();
    }

    public void push(int x) {
        A.add(x);
        if (B.isEmpty() || B.peek() >= x) { //注意为什么是等号
            B.add(x);
        }
    }

    public void pop() {
        if (A.pop().equals(B.peek())) {
            B.pop();
        }
    }

    public int top() {
        return A.peek();
    }

    public int min() {
        return B.peek();
    }
}
