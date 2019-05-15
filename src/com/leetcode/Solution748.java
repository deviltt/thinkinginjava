package com.leetcode;

/**
 * 最短完整词
 * 如果单词列表（words）中的一个单词包含牌照（licensePlate）中所有的字母，那么我们称之为完整词。在所有完整词中，最短的单词我们称之为最短完整词。
 * 单词在匹配牌照中的字母时不区分大小写，比如牌照中的 "P" 依然可以匹配单词中的 "p" 字母。
 * 我们保证一定存在一个最短完整词。当有多个单词都符合最短完整词的匹配条件时取单词列表中最靠前的一个。
 * 牌照中可能包含多个相同的字符，比如说：对于牌照 "PP"，单词 "pair" 无法匹配，但是 "supper" 可以匹配。
 * 输入：licensePlate = "1s3 456", words = ["looks", "pest", "stew", "show"]
 * 输出："pest"
 * 说明：存在 3 个包含字母 "s" 且有着最短长度的完整词，但我们返回最先出现的完整词。
 */
public class Solution748 {
    public static String shortestCompletingWord(String licensePlate, String[] words) {
        //先统计licensePlate中字母的个数
        int[] license = new int[26];
        for (char c : licensePlate.toCharArray()) {
            if (Character.isUpperCase(c)) {
                ++license[c - 'A'];
            } else if (Character.isLowerCase(c)) {
                ++license[c - 'a'];
            }
        }
        int min = Integer.MAX_VALUE;
        String result = "";
        //遍历words字符串数组，统计字母的个数，并与license比较
        for (String s : words) {
            if (s.length() < min) {
                int[] temp = new int[26];   //以空间换时间
                for (char c : s.toCharArray()) {
                    ++temp[c - 'a'];
                }
                boolean bool = true;
                for (int i = 0; i < 26; i++) {
                    if (license[i] > temp[i]) {
                        bool = false;
                        break;
                    }
                }
                if (bool) {
                    min = s.length();
                    result = s;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] words=new String[]{"step","steps","stripe","stepple"};
        System.out.println(shortestCompletingWord("1s3 PSt", words));
    }
}
