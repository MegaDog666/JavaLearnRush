package com.javarush.Algorithms;

import java.util.*;

public class TreeNode {

    public int val;
    public TreeNode left;
    public TreeNode right;

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        List<TreeNode> stack = new ArrayList<>();
        stack.add(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.remove(stack.size() - 1);
            result.add(node.val);

            // Добавляем правого ребенка в стек первым, чтобы левый обрабатывался первым
            if (node.right != null) {
                stack.add(node.right);
            }
            if (node.left != null) {
                stack.add(node.left);
            }
        }

        return result;
    }
    public static void main(String[] args) {

        TreeNode treeNode = new TreeNode();

        treeNode.preorderTraversal(treeNode);
    }
}
