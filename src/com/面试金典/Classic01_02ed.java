package com.面试金典;

import java.util.Arrays;

/**
 * 面试题 01.02. 判定是否互为字符重排
 * 方法1思路：
 * 对字符数组进行排序，如果满足题意的话，那么排列的每一位肯定是一致的
 */
public class Classic01_02ed {
    public boolean CheckPermutation(String s1, String s2) {
        if (s1.length()!=s2.length()){
            return false;
        }
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        String tempStr1 = String.valueOf(chars1);
        String tempStr2 = String.valueOf(chars2);

        return tempStr1.equals(tempStr2);
    }
}
