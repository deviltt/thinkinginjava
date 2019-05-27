package com.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 爱丽丝和鲍勃有不同大小的糖果棒：A[i] 是爱丽丝拥有的第 i 块糖的大小，B[j] 是鲍勃拥有的第 j 块糖的大小。
 * 因为他们是朋友，所以他们想交换一个糖果棒，这样交换后，他们都有相同的糖果总量。（一个人拥有的糖果总量是他们拥有的糖果棒大小的总和。）
 * 返回一个整数数组 ans，其中 ans[0] 是爱丽丝必须交换的糖果棒的大小，ans[1] 是 Bob 必须交换的糖果棒的大小。
 * 如果有多个答案，你可以返回其中任何一个。保证答案存在。
 * 输入：A = [1,2,5], B = [2,4]
 * 输出：[5,4]
 * 思路：两者交换后的糖果数量相等，可以推算出某种数学关系，这也是解题的一种思想
 * 两者满足y=x+(sumB-sumA)/2
 */
public class Solution888 {
    public int[] fairCandySwap(int[] A, int[] B) {
        Set<Integer> set = new HashSet<>();
        int sumA = 0, sumB = 0;
        for (int temp : A) {
            sumA += temp;
        }
        for (int temp : B) {
            sumB += temp;
        }
        int temp = (sumB - sumA) / 2;
        for (int i : B)
            set.add(i);
        for (int i : A) {
            if (set.contains(i + temp))
                return new int[]{i, i + temp};
        }
        return null;
    }
}
