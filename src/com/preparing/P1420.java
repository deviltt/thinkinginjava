package com.preparing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P1420 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                j = Math.max(j, map.get(arr[i]) + 1);       //滑动窗口，遇到重复的就更新j的值，滑到下一个没有重复元素的点
            }
            if (i >= 1 && arr[i] - arr[i - 1] != 1) {
                j = i;                                      //不是连号的时候
            }
            map.put(arr[i], i);
            result = Math.max(result, i - j + 1);
        }
        System.out.println(result);
    }
}
