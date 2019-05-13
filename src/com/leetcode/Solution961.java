package com.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 在大小为 2N 的数组 A 中有 N+1 个不同的元素，其中有一个元素重复了 N 次。
 * 返回重复了 N 次的那个元素。
 * 输入：[5,1,5,2,5,3,5,4]
 * 输出：5
 */
public class Solution961 {
    public int repeatedNTimes(int[] A) {
        Set<Integer> set=new HashSet<>();
        int result=-1;
        for (int i = 0; i < A.length; i++) {
            if (!set.add(A[i]))
                result=i;
        }
        return A[result];
    }
}
