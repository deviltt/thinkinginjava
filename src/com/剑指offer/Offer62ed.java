package com.剑指offer;

/**
 * 剑指 Offer 62. 圆圈中最后剩下的数字
 */
public class Offer62ed {
    public int lastRemaining(int n, int m) {
        //当只剩一个元素的时候，活下来的元素索引一定是0
        int pos = 0;
        for (int i = 2; i <= n; i++) {
            //一层层的往上递推，确定最后活下来的元素在每一层的位置
            //+m 的意思是向右移动m个单位
            //%i 的意思是循环移动时，当右移m个单位后，应该出现的位置
            //比如有三个元素1，2，3  以2为例，循环右移8个单位后，实际的索引位置为 (1+8)%3=0
            pos = (pos + m) % i;
        }
        return pos;
    }
}
