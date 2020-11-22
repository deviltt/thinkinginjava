package com.面试金典;

/**
 * 面试题 01.01. 判定字符是否唯一
 * 位运算
 */
public class Classic01_01 {
    public boolean isUnique(String astr) {
        int x = 0;  //开始每一位都是0
        for (int i = 0; i < astr.length(); i++) {
            int temp = 1 << (astr.charAt(i) - 'a');
            //如果已经出现过某个字符，那么与运算结果就不可能是0，对应为与运算结果肯定是1
            if ((x & temp) != 0) {
                return false;
            } else {
                x|=temp;
            }
        }
        return true;
    }
}
