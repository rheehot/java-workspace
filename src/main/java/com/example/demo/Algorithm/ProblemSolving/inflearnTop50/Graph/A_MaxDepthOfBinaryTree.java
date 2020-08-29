package com.example.demo.Algorithm.ProblemSolving.inflearnTop50.Graph;


/**
 * @author Geonguk Han
 * @since 2020-08-25
 */


class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int x) {
        this.val = x;
    }
}

public class A_MaxDepthOfBinaryTree {

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
        return maxDepth(root);
    }

    // recursive 한 방법
    private static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftMax = maxDepth(root.left);
        int rightMax = maxDepth(root.right);

        return Math.max(leftMax, rightMax) + 1;
    }
}
