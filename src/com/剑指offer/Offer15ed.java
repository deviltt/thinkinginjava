package com.剑指offer;

/**
 * 剑指 Offer 15. 二进制中1的个数
 * 巧用 n & (n-1)
 * n & (n-1) 的结果是 当前1右边与的结果都是0，左边所有的1个数和位置都保持不变
 */
public class Offer15ed {
    public int hammingWeight(int n) {
        int result = 0;
        while (n != 0) {
            ++result;
            n&=(n-1);
        }
        return result;
    }
}
