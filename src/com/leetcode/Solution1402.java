package com.leetcode;

import java.util.*;

/**
 * 1402. 做菜顺序
 */
public class Solution1402 {
    public int maxSatisfaction(int[] satisfaction) {
        int sum = 0, result = 0;
        Arrays.sort(satisfaction);
        for (int i = satisfaction.length - 1; i >= 0; i--) {
            //排序后计算sum，sum>=0表示做这道菜肯定是亏的，因此停止遍历
            sum += satisfaction[i];
            if (sum < 0) {
                break;
            }
            result += sum;
        }
        return result;
    }
}
