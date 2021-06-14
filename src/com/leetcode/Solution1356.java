package com.leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class Solution1356 {
    public int[] sortByBits(int[] arr) {
        Integer[] integers = IntStream.of(arr).boxed().toArray(Integer[]::new);

        Arrays.sort(integers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int count1 = count(o1);
                int count2 = count(o2);
                return count1 == count2 ? o1 - o2 : count1 - count2;
            }
        });

        for (int i = 0; i < integers.length; i++) {
            arr[i] = integers[i];
        }

        return arr;
    }

    /**
     * 统计num转成二进制后1的个数
     *
     * @param num
     * @return
     */
    private int count(int num) {
        int count = 0;
        while (num != 0) {
            num &= num - 1;
            ++count;
        }
        return count;
    }
}
