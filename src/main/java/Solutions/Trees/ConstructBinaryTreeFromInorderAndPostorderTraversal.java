package Solutions.Trees;

import java.util.HashMap;

public class ConstructBinaryTreeFromInorderAndPostorderTraversal {
    int post_idx;
    int[] postOrder;
    int[] inOrder;
    HashMap<Integer, Integer> idx_map = new HashMap<>();

    public TreeNode solution(int[] io, int[] po) {
        this.postOrder = po;
        this.inOrder = io;

        // start from the last port order element
        post_idx = postOrder.length - 1;

        // build hashmap value of its index
        int idx = 0;
        for (int val : inOrder) {
                idx_map.put(val, idx++);
        }
        return helper(0, inOrder.length - 1);
    }

    private TreeNode helper(int indexLeft, int indexRight) {
        // base case: if there are no elements to construct subtrees
        if (indexLeft > indexRight) return null;

        // pick up post idx element as root
        int rootVal = postOrder[post_idx];
        TreeNode root = new TreeNode(rootVal);

        // root splits inorder list into left and right subtrees
        int index = idx_map.get(rootVal);
        post_idx--;

        // build right subtree
        root.right = helper(index + 1, indexRight);
        // build left
        root.left = helper(indexLeft, index - 1);

        return root;
    }

}
