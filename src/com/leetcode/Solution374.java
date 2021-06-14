package com.leetcode;

public class Solution374 {
    private static int pick = 4;

    public static int guessNumber(int n) {
        int l = 1;
        int r = n;
        int mid;
        int guessResult;
        while (l != r) {
            mid = (r - l) / 2 + l;
            guessResult = guess(mid);
            if (guessResult == 0) {
                return mid;
            } else if (guessResult == 1) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }

    private static int guess(int num) {
        return num > pick ? -1 : num < pick ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(guessNumber(20));
    }
}
