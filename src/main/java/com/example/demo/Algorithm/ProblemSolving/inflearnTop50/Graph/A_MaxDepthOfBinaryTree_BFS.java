package com.example.demo.Algorithm.ProblemSolving.inflearnTop50.Graph;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Geonguk Han
 * @since 2020-08-25
 */
public class A_MaxDepthOfBinaryTree_BFS {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(8);
        root.left.left.left = new TreeNode(7);
        System.out.println(solve(root));
    }

    private static int solve(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        if (root == null) return 0;

        int count = 0;
        while (!queue.isEmpty()) {
            final int size = queue.size();
            for (int i = 0; i < size; i++) {
                final TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            count++;
        }

        return count;
    }
}
