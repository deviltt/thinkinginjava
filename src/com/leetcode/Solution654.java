package com.leetcode;

/**
 * 给定一个不含重复元素的整数数组。一个以此数组构建的最大二叉树定义如下：
 * 二叉树的根是数组中的最大元素。
 * 左子树是通过数组中最大值左边部分构造出的最大二叉树。
 * 右子树是通过数组中最大值右边部分构造出的最大二叉树。
 * 通过给定的数组构建最大二叉树，并且输出这个树的根节点。
 * 输入: [3,2,1,6,0,5]
 * 输入: 返回下面这棵树的根节点：
 * 6
 * /   \
 * 3     5
 * \    /
 * 2  0
 * \
 * 1
 */
public class Solution654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructMaximumBinaryTree(nums, 0, nums.length - 1);
    }

    private TreeNode constructMaximumBinaryTree(int[] nums, int start, int end) {
        //找出最大值的索引位置
        int index = start;
        for (int i = start; i <= end; i++) {
            if (nums[i] > nums[index]) {
                index = i;
            }
        }
        TreeNode root = new TreeNode(nums[index]);
        if (index > start)
            root.left = constructMaximumBinaryTree(nums, start, index - 1);
        if (index < end)
            root.right = constructMaximumBinaryTree(nums, index + 1, end);
        return root;
    }
}
