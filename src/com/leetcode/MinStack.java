package com.leetcode;

import java.util.ArrayList;
import java.util.Iterator;

public class MinStack {
    private static ArrayList<Integer> list;
    /** initialize your data structure here. */
    public MinStack() {
        list=new ArrayList<>();
    }

    public static void push(int x) {
        list.add(x);
    }

    public static void pop() {
        if (!list.isEmpty())
            list.remove(list.size()-1);
    }

    public static int top() {
        return list.get(list.size()-1);
    }

    public static int getMin() {
        int min=list.get(list.size()-1);
        Iterator<Integer> iterator=list.iterator();
        while (iterator.hasNext()){
            min=Math.min(iterator.next(), min);
        }
        return min;
    }

    public static void main(String[] args) {
        MinStack minStack=new MinStack();
        minStack.push(2);
        minStack.push(0);
        minStack.push(3);
        minStack.push(0);
        System.out.println(MinStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
    }
}
