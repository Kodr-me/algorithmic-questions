package Solutions.TreesAndGraphs;

/*
Minimal Tree: Given a sorted (increasing order) array with unique integer elements,
write an algorithm to create a binary search tree with minimal height.
 */
public class MinimalTree {

    BinaryTreeNode createMinimalBST(int[] array) {
        return createMinimalBST(array, 0, array.length - 1);
    }

    BinaryTreeNode createMinimalBST(int[] array, int start, int end) {
        if (end  < start) return null;

        int mid = (start + end) / 2;
        BinaryTreeNode n = new BinaryTreeNode(array[mid]);
        n.left = createMinimalBST(array, start, mid - 1);
        n.right = createMinimalBST(array, mid + 1, end);
        return n;
    }
}
