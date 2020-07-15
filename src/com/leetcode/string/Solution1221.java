package com.leetcode.string;

/**
 * 1221. 分割平衡字符串
 * 在一个「平衡字符串」中，'L' 和 'R' 字符的数量是相同的。
 * 给出一个平衡字符串 s，请你将它分割成尽可能多的平衡字符串。
 * 返回可以通过分割得到的平衡字符串的最大数量。
 * 输入：s = "RLRRLLRLRL"
 * 输出：4
 * 解释：s 可以分割为 "RL", "RRLL", "RL", "RL", 每个子字符串中都包含相同数量的 'L' 和 'R'。
 */
public class Solution1221 {
    public int balancedStringSplit(String s) {
        //只要找到一个就计数，确保分割得到平衡字符串的最大数量
        if (s == null || "".equals(s)) {
            return 0;
        }
        int count = 0, result = 0;
        for (char c : s.toCharArray()) {
            if (c == 'R') {
                ++count;
            } else {
                --count;
            }
            if (count == 0) {
                ++result;
            }
        }
        return result;
    }
}
