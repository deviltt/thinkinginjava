package com.剑指offer;

/**
 * 摩尔投票法
 */
public class Offer39 {
    public int majorityElement(int[] nums) {
        int votes = 0, x = 0;
        for (int i : nums) {
            if (votes == 0) {
                x = i;
            }
            if (i == x) {
                ++votes;
            } else {
                --votes;
            }
        }
        return x;
    }
}
