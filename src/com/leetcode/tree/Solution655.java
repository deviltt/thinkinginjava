package com.leetcode.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution655 {
    public List<List<String>> printTree(TreeNode root) {
        int height = countTreeHeight(root);
        String[][] res = new String[height][1 << height - 1];

        for (String[] arr : res)
            Arrays.fill(arr, "");

        List<List<String>> ans = new ArrayList<>();

        fill(res, root, 0, 0, res[0].length);
        for (String[] arr : res)
            ans.add(Arrays.asList(arr));
        return ans;
    }

    /**
     * @param res   待填的二维数组
     * @param root  根元素
     * @param i     第几层树（从0开始）
     * @param left
     * @param right
     */
    private void fill(String[][] res, TreeNode root, int i, int left, int right) {
        if (root == null)
            return;
        res[i][(left + right) / 2] = "" + root.val;
        fill(res, root.left, i + 1, left, (left + right) / 2);
        fill(res, root.right, i + 1, (left + right) / 2, right);
    }

    //计算树的高度
    private int countTreeHeight(TreeNode root) {
        if (root == null)
            return 0;
        int leftHeight = countTreeHeight(root.left) + 1;
        int rightHeight = countTreeHeight(root.right) + 1;
        return Math.max(leftHeight, rightHeight);
    }
}
