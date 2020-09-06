package com.剑指offer;

import java.util.HashMap;

/**
 * 剑指 Offer 50. 第一个只出现一次的字符
 */
public class Offer50 {
    public char firstUniqChar(String s) {
        if (s.length() == 0) {
            return ' ';
        }
        HashMap<Character, Boolean> map=new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char temp=s.charAt(i);
            if (!map.containsKey(temp)){
                map.put(temp, true);
            }else{
                map.put(temp, false);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            char temp=s.charAt(i);
            if (map.get(temp)){
                return temp;
            }
        }
        return ' ';
    }
}
