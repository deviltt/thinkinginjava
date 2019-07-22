package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 输入：words = ["abc","deq","mee","aqq","dkd","ccc"], pattern = "abb"
 * 输出：["mee","aqq"]
 * 解释：
 * "mee" 与模式匹配，因为存在排列 {a -> m, b -> e, ...}。
 * "ccc" 与模式不匹配，因为 {a -> c, b -> c, ...} 不是排列。
 * 因为 a 和 b 映射到同一个字母。
 * 首先建立映射规则，后面遍历到这个字符时检查是否满足映射规则，如果不满足则直接退出
 */
class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list=new ArrayList<>();
        Map<Character, Character> map;  //保存映射规则
        boolean isPattern=true;
        for (int i = 0; i < words.length; i++) {
            map=new HashMap<>();
//            map2=new HashMap<>();
            //如果长度都不相等，则直接返回
            if (words[i].length()!=pattern.length())
                continue;
            for (int j = 0; j < words[i].length(); j++) {
                if (!map.containsKey(pattern.charAt(j))){
                    map.put(pattern.charAt(j), words[i].charAt(j));
                }
                if (!map.containsKey(words[i].charAt(j))){
                    map.put(words[i].charAt(j), pattern.charAt(i));
                }
                //如果映射关系已经存在，则观察当前words遍历的字符串是否满足映射关系
                if (map.get(pattern.charAt(j))!=words[i].charAt(j)||map.get(words[i].charAt(j))!=pattern.charAt(j)){
                    isPattern=false;
                    break;
                }

            }
            if (isPattern)
                list.add(words[i]);
            isPattern=true;
        }
        return list;
    }
}
