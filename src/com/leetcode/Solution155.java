package com.leetcode;

public class Solution155 {
    private static int[] arr;
    private static int top = -1;

    public Solution155() {
        arr = new int[100];
    }

    public static void push(int x) {
        arr[++top] = x;
    }

    public static void pop() {
        if (top >= 0) {
            --top;
        }
    }

    public static int top() {
        return arr[top];
    }

    public static int getMin() {
        int min=arr[top];
        for (int i = top; i >=0; i--) {
            min=Math.min(arr[i], min);
        }
        return min;
    }

    public static void main(String[] args) {
        Solution155 minStack = new Solution155();
        minStack.push(2);
        minStack.push(0);
        minStack.push(3);
        minStack.push(0);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
    }
}
