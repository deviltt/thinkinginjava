package com.leetcode2.doublepointer;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Solution977 {
    public int[] sortedSquares(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = (int) Math.pow(A[i], 2);
        }
        Arrays.sort(A);
        return A;
    }

    /**
     * 降序排列
     */
//    class MyComparator implements Comparator<Integer> {
//        @Override
//        public int compare(Integer o1, Integer o2) {
//            if (o1 < o2) {
//                return 1;
//            } else if (o1 > o2) {
//                return -1;
//            } else {
//                return 0;
//            }
//        }
//    }

}
