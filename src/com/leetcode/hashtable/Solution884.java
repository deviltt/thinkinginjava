package com.leetcode.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 给定两个句子 A 和 B 。 （句子是一串由空格分隔的单词。每个单词仅由小写字母组成。）
 * 如果一个单词在其中一个句子中只出现一次，在另一个句子中却没有出现，那么这个单词就是不常见的。
 * 返回所有不常用单词的列表。
 * 您可以按任何顺序返回列表。
 */
public class Solution884 {
    public String[] uncommonFromSentences(String A, String B) {
        List<String> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        for (String s : A.split(" ")){
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for (String s : B.split(" ")){
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        //遍历map的key，将value = 1的key添加进list中去
        for (String s : map.keySet()){
            if (map.get(s) == 1){
                list.add(s);
            }
        }
        String[] strings = new String[list.size()];
        return list.toArray(strings);
    }
}
