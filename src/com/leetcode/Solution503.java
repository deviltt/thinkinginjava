package com.leetcode;

import java.util.Stack;

public class Solution503 {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[nums.length];

        for (int i = 0; i < 2; i++) {
            for (int j = nums.length - 1; j >= 0; j--) {
                while (!stack.isEmpty() && nums[j] >= nums[stack.peek()]) {
                    stack.pop();
                }
                if (stack.isEmpty()) {
                    result[j] = -1;
                } else {
                    result[j] = nums[stack.peek()];
                }
                stack.add(j);
            }
        }
        return result;
    }
}
