package TreesAndGraphs;

import java.util.ArrayList;

/*
Implement a function to check if a binary tree is balanced.
For the purposes of this question,
a balanced tree is defined to be a tree such that the heights of the two subtrees of any node never differ by more than one.
 */
public class IsBalanced {
    boolean solution(BinaryTreeNode root) {
        return checkHeight(root ) != Integer.MIN_VALUE;
    }

    private int checkHeight(BinaryTreeNode n) {
        if (n == null) return -1;

        int leftHeight = checkHeight(n.left);
        if (leftHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE;

        int rightHeight = checkHeight(n.right);
        if (rightHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE;

        int heightDiff = leftHeight - rightHeight;

        if (Math.abs(heightDiff) > 1) return Integer.MIN_VALUE;
        else return Math.max(checkHeight(n.left), checkHeight(n.right)) + 1;

    }
}
