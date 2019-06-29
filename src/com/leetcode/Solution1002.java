package com.leetcode;

import java.util.*;

/**
 * 查找常用字符
 * 给定仅有小写字母组成的字符串数组 A，返回列表中的每个字符串中都显示的全部字符
 * （包括重复字符）组成的列表。例如，如果一个字符在每个字符串中出现 3 次，
 * 但不是 4 次，则需要在最终答案中包含该字符 3 次。
 * 你可以按任意顺序返回答案。
 * 输入：["bella","label","roller"]
 * 输出：["e","l","l"]
 */
public class Solution1002 {
    public List<String> commonChars(String[] A) {
        List<String> list = new ArrayList<>();
        //遍历字符串，统计每一个字符的个数，如果某一个字符在字符串中不存在，则要剔除
        //可以先把第一个字符串数组添加进map中去
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer>[] maps=new Map[A.length];
        for (int i=0;i<maps.length;i++){
            for (Character character:A[i].toCharArray()){
                maps[i].put(character, maps[i].getOrDefault(character, 0)+1);
            }
        }
        for (int i=0;i<A.length;i++) {
            for (Character character : A[i].toCharArray()) {
                if (map.containsKey(character)){
                    map.put(character, map.getOrDefault(character, 0) + 1);
                }else {

                }
            }
        }
        //遍历hash表
        Set<Map.Entry<Character, Integer>> entry = map.entrySet();
        Iterator<Map.Entry<Character, Integer>> iterator = entry.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Character, Integer> mapEntry = iterator.next();
            for (int i = mapEntry.getValue() / A.length; i > 0; i--) {
                list.add(String.valueOf(mapEntry.getKey()));
            }
        }
        return list;
    }
}
