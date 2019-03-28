package com.leetcode;

import java.util.HashMap;

/**
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 * 案例:
 * s = "leetcode"
 * 返回 0.
 * s = "loveleetcode",
 * 返回 2.
 * 思想：第一次遍历字符串，建立<Character, Integer>的哈希表
 * 第二次遍历字符串，返回第一个value=1的索引
 */
public class Solution387 {
    public int firstUniqChar(String s) {
//        HashMap<Character, Integer> map = new HashMap<>();
//        for (Character c : s.toCharArray()) {
//            map.put(c, map.getOrDefault(c, 0) + 1);
//        }
//        char[] c=s.toCharArray();
//        for (int i = 0; i < c.length; i++) {
//            if (map.get(c[i])==1)
//                return i;
//        }
//        return -1;

        //方法二：利用桶数组记录对应字母出现的次数
        int[] temp=new int[26];
        for (Character c:s.toCharArray())
            temp[c-'a']++;
        for (int i = 0; i < s.length(); i++) {
            if (temp[s.charAt(i)-'a']==1)
                return i;
        }
        return -1;
    }
}
