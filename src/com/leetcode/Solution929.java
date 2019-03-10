package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Solution929 {
    public static int numUniqueEmails(String[] emails) {
        int count = 0;
        Set<String> set = new HashSet<>();
        for (String s : emails){
            String[] strings = s.split("@");
            String[] sub1 = strings[0].split("[+]");
            String[] sub2 = sub1[0].split("[.]");
            StringBuilder stringBuilder = new StringBuilder("");
            for (String s1 : sub2){
                stringBuilder.append(s1);
            }
            stringBuilder.append("@");
            stringBuilder.append(strings[1]);
            //Set集合添加成功返回true
            if (set.add(stringBuilder.toString()))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numUniqueEmails(new String[]{"testemail@leetcode.com","testemail1@leetcode.com","testemail+david@lee.tcode.com"}));
    }
}
