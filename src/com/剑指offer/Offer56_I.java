package com.剑指offer;

public class Offer56_I {
    public int[] singleNumbers(int[] nums) {
        //1. 把数组中的所有数异或
        int temp = 0;
        for (int num : nums) {
            temp ^= num;
        }

        //异或的结果就是两个不同的数的结果，其余相同的数异或结果都是0
        //2.在异或的结果中找到一个为1的位，这个位表示两个目标数的二进制
        //在这个位肯定是不一样的，假设a的二进制在这个位置是0，b的二进制在这个位置是1，那么
        //进行与运算的时候a的结果就是0，b的结果大于0，因此将a和b完美的分开，
        //而其余的数都是相同的，所以肯定都在一个组中
        int tempVar = 1;
        while ((tempVar & temp) == 0) {
            tempVar <<= 1;
        }

        int a = 0, b = 0;
        for (int num : nums) {
            if ((num & tempVar) == 0) {
                a ^= num;
            } else {
                b ^= num;
            }
        }
        return new int[]{a, b};
    }
}
