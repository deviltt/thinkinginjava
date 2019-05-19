package com.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 特殊等价字符串组
 * 你将得到一个字符串数组 A。
 * 如果经过任意次数的移动，S == T，那么两个字符串 S 和 T 是特殊等价的。
 * 一次移动包括选择两个索引 i 和 j，且 i ％ 2 == j ％ 2，并且交换 S[j] 和 S [i]。
 * 现在规定，A 中的特殊等价字符串组是 A 的非空子集 S，
 * 这样不在 S 中的任何字符串与 S 中的任何字符串都不是特殊等价的。
 * 返回 A 中特殊等价字符串组的数量。
 * 输入：["abc","acb","bac","bca","cab","cba"]
 * 输出：3
 * 解释：3 组 ["abc","cba"]，["acb","bca"]，["bac","cab"]
 * 思路：这种统计数量的应该首先想到使用set集合来统计，set集合不记录重复的元素
 */
public class Solution893 {
    public int numSpecialEquivGroups(String[] A) {
        Set<String> set = new HashSet<>();
        for (String s : A) {
            int[] temp = new int[52];
            for (int i = 0; i < s.length(); i++) {
                /**
                 * 26相当于偏移量，分别统计奇数位置和偶数位置的字母数量
                 */
                ++temp[s.charAt(i) - 'a' + 26 * (i % 2)];
            }
            set.add(Arrays.toString(temp));
        }
        return set.size();
    }
}
