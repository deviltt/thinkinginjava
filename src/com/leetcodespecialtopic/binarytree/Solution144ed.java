package com.leetcodespecialtopic.binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 144. 二叉树的前序遍历
 * 给定一个二叉树，返回它的 前序 遍历。
 * 示例:
 * 输入: [1,null,2,3]
 *    1
 *     \
 *      2
 *     /
 *    3
 *
 * 输出: [1,2,3]
 */
public class Solution144ed {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        //演进过程
        //1.node=node.left后需要再次判断node是否为空
//        if (node != null) {
//            list.add(node.val);
//            stack.push(node);
//            node = node.left;
//        }

        //2. 把if改为while
//        while (node != null) {
//            list.add(node.val);
//            stack.push(node);
//            node = node.left;
//        }

        //3. node也可能是空，当node为空时，应该从stack中弹出节点（前提是stack不为空）
//        while (node != null || !stack.isEmpty()) {
//            list.add(node.val);
//            stack.push(node);
//            node = node.left;
//        }

        //4. 在while里面就要判断node是否为空
        while (node != null || !stack.isEmpty()) {
            if (node != null) {
                list.add(node.val);
                stack.push(node);
                node = node.left;
            } else {
                node = stack.pop().right;
            }
        }
        return list;
    }
}
