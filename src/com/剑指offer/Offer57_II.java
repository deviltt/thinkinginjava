package com.剑指offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 滑动窗口
 */
public class Offer57_II {
    public static void main(String[] args) {
        System.out.println(findContinuousSequence(9));
    }

    public static int[][] findContinuousSequence(int target) {
        int prev = 1, next = 1;
        List<int[]> list = new ArrayList<>();
        int sum = 0;

//        tempList.add(next);
        while (prev <= target / 2) {
            if (sum > target) {
                sum -= prev;
                ++prev;
            } else if (sum < target) {
                sum += next;
                ++next;
            } else {
                int[] arr = new int[next - prev];
                for (int i = prev; i < next; i++) {
                    arr[i - prev] = i;
                }
                list.add(arr);
                sum -= prev;
                ++prev;
            }
        }
        return list.toArray(new int[0][]);
    }
}
