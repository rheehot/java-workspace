package com.example.demo.Algorithm.ProblemSolving.inflearnTop50.Graph;

import java.util.Stack;

/**
 * @author Geonguk Han
 * @since 2020-08-25
 */
public class A_MaxDepthOfBinaryTree_DFS {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(8);
        root.left.left.left = new TreeNode(7);
        System.out.println(solve(root));

    }

    // stack을 이용한 DFS 방식
    private static int solve(TreeNode root) {
        if (root == null) return 0;

        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> valueStack = new Stack<>();

        stack.push(root);
        valueStack.push(1);
        int max = 0;

        while (!stack.isEmpty()) {

            final TreeNode node = stack.pop();
            final Integer count = valueStack.pop();

            max = Math.max(count, max);
            if (node.left != null) {
                stack.push(node.left);
                valueStack.push(count + 1);
            }

            if (node.right != null) {
                stack.push(node.right);
                valueStack.push(count + 1);
            }
        }


        return max;
    }
}
