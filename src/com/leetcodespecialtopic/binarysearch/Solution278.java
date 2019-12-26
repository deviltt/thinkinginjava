package com.leetcodespecialtopic.binarysearch;

/**
 * 278. 第一个错误的版本
 * 给定 n = 5，并且 version = 4 是第一个错误的版本。
 * 调用 isBadVersion(3) -> false
 * 调用 isBadVersion(5) -> true
 * 调用 isBadVersion(4) -> true
 * 所以，4 是第一个错误的版本。 
 */
public class Solution278 {
    public int firstBadVersion(int n) {
        int left = 1, right = n;
        int mid;
        while (left < right) {
            mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    private boolean isBadVersion(int version) {
        return true;
    }
}
