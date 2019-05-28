package com.leetcode;

/**
 * 思路：遇到0就加一遇到1就加二
 */
public class Solution717 {
    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        for (; i < bits.length - 1; ) {
            if (bits[i] == 0)
                i++;
            if (bits[i] == 1)
                i += 2;
        }
        return i != bits.length;
    }
}
