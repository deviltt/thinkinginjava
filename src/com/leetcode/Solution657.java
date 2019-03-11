package com.leetcode;

/**
 * 输入: "LL"
 * 输出: false
 * 解释：机器人向左移动两次。它最终位于原点的左侧，距原点有两次 “移动” 的距离。我们返回 false，因为它在移动结束时没有返回原点。
 */
public class Solution657 {
    public boolean judgeCircle(String moves) {
        int count1 = 0, count2 = 0;
        for (char c : moves.toCharArray()) {
            switch (c) {
                case 'R':
                    ++count1;
                    break;
                case 'U':
                    ++count2;
                    break;
                case 'L':
                    --count1;
                    break;
                case 'D':
                    --count2;
                    break;
            }
        }
        return count1 == 0 && count2 == 0;
    }
}
