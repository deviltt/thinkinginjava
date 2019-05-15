package com.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 给定两个正整数 x 和 y，如果某一整数等于 x^i + y^j，其中整数 i >= 0 且 j >= 0，那么我们认为该整数是一个强整数。
 * 返回值小于或等于 bound 的所有强整数组成的列表。
 * 你可以按任何顺序返回答案。在你的回答中，每个值最多出现一次。
 * 输入：x = 2, y = 3, bound = 10
 * 输出：[2,3,4,5,7,9,10]
 * 解释：
 * 2 = 2^0 + 3^0
 * 3 = 2^1 + 3^0
 * 4 = 2^0 + 3^1
 * 5 = 2^1 + 3^1
 * 7 = 2^2 + 3^1
 * 9 = 2^3 + 3^0
 * 10 = 2^0 + 3^2
 * <p>
 * 两层循环就能解决，i=0,1,2,3...的同时，j=0,1,2,3...
 */
public class Solution970 {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        Set<Integer> set = new HashSet<>();
        int sumX, sumY;
        for (int i = 0; ; i++) {
            sumX = (int) Math.pow(x, i);
            if (sumX >= bound)
                break;
            for (int j = 0; ; j++) {
                sumY = (int) Math.pow(y, j);
                int sum = sumX + sumY;
                if (sum > bound)
                    break;
                set.add(sum);
                if (y==1)
                    break;
            }
            if (x==1)
                break;
        }
        return new ArrayList<>(set);
    }
}
