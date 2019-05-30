package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 输入：[0,1,1]
 * 输出：[true,false,false]
 * 解释：
 * 输入数字为 0, 01, 011；也就是十进制中的 0, 1, 3 。只有第一个数可以被 5 整除，因此 answer[0] 为真。
 * 1 <= A.length <= 30000
 */
public class Solution1018 {
    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> list = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            //这种方法肯定会超出范围的
//            for (int j = 0; j <= i; j++) {
//                sum += (A[j] << (i - j));
//            }
//            list.add((sum % 5 == 0));
//            sum = 0;

            sum = (sum << 1) % 5 + (A[i] == 1 ? 1 : 0);
            list.add(sum % 5 == 0);
        }
        return list;
    }
}
