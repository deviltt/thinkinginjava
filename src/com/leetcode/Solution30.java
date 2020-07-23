package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 30. 串联所有单词的子串（方法1）
 * 暴力枚举法
 */
public class Solution30 {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> list = new ArrayList<>();
        if (s.length()==0||words.length==0){
            return list;
        }
        Map<String, Integer> targetMap = new HashMap<>(); //用来计数words里面的单词个数
        Map<String, Integer> sourceMap = new HashMap<>();  //用来遍历s数组，保存里面的单词
        //遍历给定单词数组，保存每个单词的数目
        for (String temp : words) {
            targetMap.put(temp, targetMap.getOrDefault(temp, 0) + 1);
        }
        int wordLen = words[0].length();
        int stringLen = wordLen * words.length;
        //每次截取一段stringLen长度的单词，然后按wordLen长度均分，统计每个单词出现的次数
        for (int i = 0; i <= s.length() - stringLen; i++) {
            sourceMap = new HashMap<>();
            String subString = s.substring(i, i+stringLen);
            for (int j = 0; j < stringLen / wordLen; j++) {
                String tempString = subString.substring(j * wordLen, (j + 1) * wordLen);
                sourceMap.put(tempString, sourceMap.getOrDefault(tempString, 0) + 1);
            }
            //如果两个map的key单词都相同且value对应出现的次数也相同则表示匹配
            if (targetMap.equals(sourceMap)) {
                list.add(i);
            }
        }
        return list;
    }
}
