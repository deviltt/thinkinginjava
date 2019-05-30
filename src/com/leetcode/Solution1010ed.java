package com.leetcode;

public class Solution1010ed {
    public int numPairsDivisibleBy60(int[] time) {
        int[] dic = new int[61];
        int res = 0;
        for (int temp : time) {
            //寻找这个数的补集
            res += dic[60 - temp % 60];
            if (temp % 60 == 0) {
                ++dic[60];
            } else {
                ++dic[temp % 60];
            }
        }
        return res;
    }
}
