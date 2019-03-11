package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Solution804 {
    public int uniqueMorseRepresentations(String[] words) {
        String[] bucket = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();
        int count = 0;
        //遍历每个字符串
        for (String s : words){
            StringBuilder stringBuilder = new StringBuilder("");
            //将字符串变为字符数组遍历
            for (char c : s.toCharArray()){
                stringBuilder.append(bucket[c - 'a']);
            }
            if (set.add(stringBuilder.toString()))
                count++;
        }
        return count;
    }
}
