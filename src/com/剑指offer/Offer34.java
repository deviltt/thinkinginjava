package com.剑指offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 剑指 Offer 34. 二叉树中和为某一值的路径
 */
public class Offer34 {
    private List<List<Integer>> res = new ArrayList<>();
    private LinkedList<Integer> innerList = new LinkedList<>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        dfs(root, sum);
        return res;
    }

    private void dfs(TreeNode treeNode, int remain) {
        if (treeNode == null) {
            return;
        }
        innerList.add(treeNode.val);
        remain -= treeNode.val;
        if (remain == 0&&treeNode.left==null&&treeNode.right==null) {
            //如果填innerList，实际上是innerList的引用，最后会变成 空链表数组
            //容易出错的点
            res.add(new LinkedList<>(innerList));   //注意这里要新建一个LinkedList,
        }
        if (remain<0){
            return;
        }
        dfs(treeNode.left, remain);
        dfs(treeNode.right, remain);
        innerList.removeLast(); //回溯，把最后一个元素去掉
    }
}
