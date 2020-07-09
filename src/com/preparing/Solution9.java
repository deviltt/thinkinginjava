package com.preparing;

public class Solution9 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        char[] chars = String.valueOf(Math.abs(x)).toCharArray();

        int left = 0, right = chars.length - 1;

        while (left < right) {
            if (chars[left++]!=chars[right--]){
                return false;
            }
        }

        return true;
    }
}
