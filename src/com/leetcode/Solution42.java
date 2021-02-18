package com.leetcode;

import java.util.Stack;

public class Solution42 {
    public int trap(int[] height) {
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        Stack<Integer> stack = new Stack<>();
        int sum = 0;

        for (int i = 0; i < height.length; i++) {
            buildStack(height, stack, left, i);
        }
        stack.clear();
        for (int i = height.length - 1; i >= 0; i--) {
            buildStack(height, stack, right, i);
        }
        for (int i = 0; i < height.length; i++) {
            if (left[i] == -1 || right[i] == -1) {
                sum += 0;
            } else {
                sum += Math.min(height[left[i]] - height[i], height[right[i]] - height[i]);
            }
        }
        return sum;
    }

    private void buildStack(int[] height, Stack<Integer> stack, int[] dirArr, int i) {
        while (!stack.isEmpty() && height[stack.peek()] <= height[i]) {
            stack.pop();
        }
        if (stack.isEmpty()) {
            dirArr[i] = -1;
            stack.add(i);
        } else {
            dirArr[i] = stack.peek();
        }
    }

//    public static void main(String[] args) {
//        trap(new int[]{3, 2, 1, 2, 3});
//    }
}
