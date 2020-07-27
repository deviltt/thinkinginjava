package com.剑指offer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 剑指 Offer 37. 序列化二叉树
 * 层序遍历
 */
public class Offer37 {
    //层序遍历
    public String serialize(TreeNode root) {
        if (root == null) {
            return "[]";
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>() {{
            add(root);
        }};
        StringBuilder stringBuilder = new StringBuilder("[");

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node==null){
                stringBuilder.append("null,");
            }else{
                stringBuilder.append(node.val);
                stringBuilder.append(",");
                queue.add(node.left);
                queue.add(node.right);
            }
        }
        stringBuilder.deleteCharAt(stringBuilder.length()-1);   //删除最后一个逗号
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public TreeNode deserialize(String data) {
        if ("[]".equals(data)) {
            return null;
        }
        String[] strings = data.substring(1, data.length() - 1).split(",");
        TreeNode root = new TreeNode(Integer.parseInt(strings[0]));
        Queue<TreeNode> queue = new LinkedList<TreeNode>() {{
            add(root);
        }};
        int i = 1;
        //这样的话队列最多只会有两个元素，分别表示当前节点的左右非空子节点
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            //如果不为null，则添加到左子树，并添加到队列中
            if (!"null".equals(strings[i])) {
                node.left = new TreeNode(Integer.parseInt(strings[i]));
                queue.add(node.left);
            }
            ++i;
            if (!"null".equals(strings[i])) {
                node.right = new TreeNode(Integer.parseInt(strings[i]));
                queue.add(node.right);
            }
            ++i;
        }
        return root;
    }
}
