package com.leetcode.string;

import java.util.Arrays;

/**
 * 给你一份『词汇表』（字符串数组） words 和一张『字母表』（字符串） chars。
 * 假如你可以用 chars 中的『字母』（字符）拼写出 words 中的某个『单词』（字符串），那么我们就认为你掌握了这个单词。
 * 注意：每次拼写时，chars 中的每个字母都只能用一次。
 * 返回词汇表 words 中你掌握的所有单词的 长度之和。
 * 输入：words = ["cat","bt","hat","tree"], chars = "atach"
 * 输出：6
 * 解释：
 * 可以形成字符串 "cat" 和 "hat"，所以答案是 3 + 3 = 6。
 *
 * 思路：首先建立一个由字母映射到数组索引的表，表示字符出现的次数
 * 遍历单词表，因为字符只允许使用一次，因此遇到对应字符就需要减一，不够时表示
 * 无法拼接成该单词，标志位置为false
 * 遍历下一个单词时，需要还原单词表
 */
public class Solution1160 {
    public int countCharacters(String[] words, String chars) {
        int[] alpha = new int[26];
        for (char c : chars.toCharArray()) {
            alpha[c - 'a'] += 1;
        }
        int length = 0;
        boolean flag = true;
        for (String string : words) {
            //还原单词表
            int[] newAlpha= Arrays.copyOf(alpha, alpha.length);
            for (char c : string.toCharArray()) {
                if (newAlpha[c - 'a'] == 0) {
                    flag = false;
                }else {
                    --newAlpha[c-'a'];
                }
            }
            if (flag) {
                length += string.length();
            } else {
                flag = true;
            }
        }
        return length;
    }
}
