package com.leetcode.hashtable;

import java.util.*;

/**
 * 给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
 * 示例:
 * 输入: ["eat", "tea", "tan", "ate", "nat", "bat"],
 * 输出:
 * [
 *   ["ate","eat","tea"],
 *   ["nat","tan"],
 *   ["bat"]
 * ]
 * 思路：把排序后的那个字符串当作key，满足条件的添加到value的list集合中去
 */
public class Solution49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs){
            char[] transfer = s.toCharArray();
            Arrays.sort(transfer);
            String temp = String.valueOf(transfer);
            if (!map.containsKey(temp)){
                map.put(temp, new ArrayList<>());
            }
            map.get(temp).add(s);
        }
        //List集合可以在构造函数中直接添加List
        return new ArrayList<>(map.values());
    }
}
