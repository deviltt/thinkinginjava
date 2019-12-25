package com.leetcode2.doublepointer;

import java.util.ArrayList;
import java.util.List;

public class Solutuion763 {
    public List<Integer> partitionLabels(String S) {
        int[] temp = new int[26];
        //记录每个字符在字符串中的索引
        for (int i = 0; i < S.length(); i++) {
            temp[S.charAt(i) - 'a'] = i;
        }
        List<Integer> result = new ArrayList<>();
        int start = 0, end = 0;
        for (int i = 0; i < S.length(); i++) {
            //动态的滑动区间
            end = Math.max(end, temp[S.charAt(i) - 'a']);
            if (i == end) {
                result.add(end - start + 1);
                start = i + 1;
            }
        }
        return result;
    }
}
