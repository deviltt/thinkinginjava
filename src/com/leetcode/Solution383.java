package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 赎金信
 * 给定一个赎金信 (ransom) 字符串和一个杂志(magazine)string，判断第一个字符串
 * ransom能不能由第二个字符串magazines里面的字符构成。如果可以构成，返回 true ；否则返回 false。
 * (题目说明：为了不暴露赎金信字迹，要从杂志上搜索各个需要的字母，组成单词来表达意思。)
 * 你可以假设两个字符串均只含有小写字母。
 * canConstruct("a", "b") -> false
 * canConstruct("aa", "ab") -> false
 * canConstruct("aa", "aab") -> true
 * <p>
 * 思路：分别用两个map来保存字符和个数，再次遍历，观察键对应的值是否相等
 */
public class Solution383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (char c : ransomNote.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        for (char c : magazine.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if (map2.get(ransomNote.charAt(i)) == null || map1.get(ransomNote.charAt(i)).compareTo(map2.get(ransomNote.charAt(i))) > 0)
                return false;
        }
        return true;
    }
}
