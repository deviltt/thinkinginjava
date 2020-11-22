package com.leetcode;

public class Solution242 {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] arrS = new int[26];
        int[] arrT = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arrS[s.charAt(i) - 'a']++;
            arrT[t.charAt(i) - 'a']++;
        }

        for (int i = 0; i < arrS.length; i++) {
            if (arrS[i] != arrT[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("nl", "cx"));
    }
}
