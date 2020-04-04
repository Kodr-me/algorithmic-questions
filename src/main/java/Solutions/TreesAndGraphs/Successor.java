package Solutions.TreesAndGraphs;

// Write an algorithm to find the "next" node (i.e., in-order successor) of a given node in a binary search tree.
// You may assume that each node has a link to its parent.

/*
> Think about how an in-order traversal works and try to "reverse engineer" it.

> Here's one step of the logic: The successor of a specific node is the leftmost node of the right subtree. What if there is no right subtree, though?
 */
public class Successor {
    public BinaryTreeNode getInOrderSuccessor(BinaryTreeNode n) {
        if (n == null) return null;

        // found the right children, return the leftmost node of the right subtree
        if (n.right != null) {
            return leftMostChild(n.right);
        } else {
            BinaryTreeNode q = n;
            BinaryTreeNode x = q.parent;
            // we want to go up until we are on the left instead of the right
            while (x != null && x.left != q) {
                q = x;
                x = x.parent;
            }
            return x;
        }
    }

    private BinaryTreeNode leftMostChild(BinaryTreeNode n) {
        if (n == null) return null;
        while (n.left != null) n = n.left;
        return n;
    }
}
