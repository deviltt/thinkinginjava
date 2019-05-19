package com.leetcode;

/**
 *  * canConstruct("a", "b") -> false
 *  * canConstruct("aa", "ab") -> false
 *  * canConstruct("aa", "aab") -> true
 */
public class Solution383ed {
    public boolean canConstruct(String ransomNote, String magazine) {
        //使用桶的思想，a~z的字母减去偏移量'a'，正好对应数组的下标
        int[] arr1=new int[26];
        int[] arr2=new int[26];
        for (char c:ransomNote.toCharArray()){
            ++arr1[c-'a'];
        }
        for (char c:magazine.toCharArray()){
            ++arr2[c-'a'];
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i]>arr2[i])
                return false;
        }
        return true;
    }
}
