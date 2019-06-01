package com.leetcode;

/**
 * 在一排座位（ seats）中，1 代表有人坐在座位上，0 代表座位上是空的。
 * 至少有一个空座位，且至少有一人坐在座位上。
 * 亚历克斯希望坐在一个能够使他与离他最近的人之间的距离达到最大化的座位上。
 * 返回他到离他最近的人的最大距离。
 * 输入：[1,0,0,0,1,0,1]
 * 输出：2
 * 解释：
 * 如果亚历克斯坐在第二个空位（seats[2]）上，他到离他最近的人的距离为 2 。
 * 如果亚历克斯坐在其它任何一个空位上，他到离他最近的人的距离为 1 。
 * 因此，他到离他最近的人的最大距离是 2 。
 */
public class Solution849 {
    public int maxDistToClosest(int[] seats) {
        int temp = 0, sum = 0, max = Integer.MIN_VALUE;
        //如果左边第一个数为0，则最大值不需要除以2
        if (seats[0] == 0) {
            int index = 0;
            while (seats[index++] == 0) {
                ++temp;
            }
            max = temp;
        }
        temp = 0;
        //如果右边最后一个数为0，则最大值不需要除以2
        if (seats[seats.length - 1] == 0) {
            int i = seats.length - 1;
            while (seats[i--] == 0) {
                ++temp;
            }
            max = Math.max(temp, max);
        }
        temp = 0;
        int num = 0;
        //如果0夹在两个1之间，则最大值除以2
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 0)
                ++temp;
            else
                temp = 0;
            num = Math.max(num, temp);
        }
        if (num % 2 == 0)
            max = Math.max(num / 2, max);
        else
            max = Math.max((num + 1) / 2, max);
        return max;
    }
}
