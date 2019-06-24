package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个整数 n，生成所有由 1 ... n 为节点所组成的二叉搜索树。
 * 示例:
 * 输入: 3
 * 输出:
 * [
 *   [1,null,3,2],
 *   [3,2,null,1],
 *   [3,1,null,null,2],
 *   [2,1,3],
 *   [1,null,2,null,3]
 * ]
 * 解释:
 * 以上的输出对应以下 5 种不同结构的二叉搜索树：
 *
 *    1         3     3      2      1
 *     \       /     /      / \      \
 *      3     2     1      1   3      2
 *     /     /       \                 \
 *    2     1         2                 3
 */
public class Solution95 {
    public List<TreeNode> generateTrees(int n) {
        if (n==0){
            return new ArrayList<>();
        }
        return dfs(1, n);
    }

    private List<TreeNode> dfs(int start, int end) {
        List<TreeNode> list = new ArrayList<>();
        //最简单的情况
        if (start > end)
            list.add(null);
        //分别考虑以val为start到end的根节点
        for (int i = start; i <= end; i++) {
            List<TreeNode> left = dfs(start, i - 1);
            List<TreeNode> right = dfs(i + 1, end);
            for (int j = 0; j < left.size(); j++) {
                for (int k = 0; k < right.size(); k++) {
                    TreeNode root=new TreeNode(i);
                    root.left=left.get(j);
                    root.right=right.get(k);
                    list.add(root);
                }
            }
        }
        return list;
    }
}
