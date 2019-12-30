package com.leetcodespecialtopic.binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class Solution144 {
    private List<Integer> list=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        preorder(root);
        return list;
    }

    private void preorder(TreeNode root) {
        if (root==null){
            return;
        }
        list.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }
}
