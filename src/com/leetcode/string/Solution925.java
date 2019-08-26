package com.leetcode.string;

public class Solution925 {
    public static boolean isLongPressedName(String name, String typed) {
        int i = 0, j = 0;
        char[] names = name.toCharArray();
        char[] types = typed.toCharArray();
        if (names[0] != types[0]) {
            return false;
        }
        while (i < name.length() && j < typed.length()) {
            if (names[i] == types[j]) {
                ++i;
                ++j;
            } else if (names[i - 1] == types[j]) {
                ++j;
            } else {
                return false;
            }
        }
        //"pyplrz" "ppyypllr"解决这种情况
        if (i < names.length) {
            return false;
        }
        //"alex", "aaleexxyxx" 解决这种情况
        while (j < types.length) {
            if (types[j++] != names[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
