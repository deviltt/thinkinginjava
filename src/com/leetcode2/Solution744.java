package com.leetcode2;

/**
 * 744. 寻找比目标字母大的最小字母
 * 给定一个只包含小写字母的有序数组letters 和一个目标字母 target，寻找有序数组里面比目标字母大的最小字母。
 * 数组里字母的顺序是循环的。举个例子，如果目标字母target = 'z' 并且有序数组为 letters = ['a', 'b']，则答案返回 'a'。
 * 输入:
 * letters = ["c", "f", "j"]
 * target = "a"
 * 输出: "c"
 */
public class Solution744 {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0, right = letters.length - 1;
        int mid;
        while (left < right) {
            mid = left + (right - left) / 2;
            if (letters[mid] > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        if (right == letters.length - 1 && letters[right]<target) {
            return letters[0];
        }
        return letters[left];
    }
}
