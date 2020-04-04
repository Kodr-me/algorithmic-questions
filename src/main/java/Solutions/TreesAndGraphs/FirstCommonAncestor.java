package Solutions.TreesAndGraphs;

//Design an algorithm and write code to find the first common ancestor of two nodes in a binary tree. Avoid storing additional nodes in a data structure.
//
//        NOTE: This is not necessarily a binary search tree.


public class FirstCommonAncestor {
    public BinaryTreeNode solution(BinaryTreeNode p, BinaryTreeNode q) {

        int difference = depth(p) - depth(q);
        BinaryTreeNode first = difference > 0 ? p : q;
        BinaryTreeNode second = difference < 0 ? p : q;
        first = moveUp(first, difference);


        while (first != second && first.parent != null & second.parent != null) {
            first = first.parent;
            second = second.parent;
        }

        return first == null || second == null ? null : first;
    }

    private BinaryTreeNode moveUp(BinaryTreeNode node, int difference) {
        while (difference != 0) {
            node = node.parent;
            difference--;
        }
        return node;
    }

    private int depth(BinaryTreeNode n) {
        int c = 0;
        while (n.parent != null)  {
            c++;
            n = n.parent;
        }
        return c;
    }


    public BinaryTreeNode noLinkToParentSolution(BinaryTreeNode root, BinaryTreeNode p, BinaryTreeNode q) {
        // check if node is not in the tree
        if (!covers(root, p) || !covers(root, q)) {
            return null;
        }

        return ancestorHelper(root, p, q);
    }

    private BinaryTreeNode ancestorHelper(BinaryTreeNode root, BinaryTreeNode p, BinaryTreeNode q) {
        if (root == null || p == null || q == null) return root;

        boolean pIsOnLeft = covers(root.left, p);
        boolean qIsOnLeft = covers(root.left, q);
        if (pIsOnLeft != qIsOnLeft) return root; // nodes are on different sides, so common ancestor must be this node

        BinaryTreeNode childSide = pIsOnLeft ? root.left : root.right;
        return ancestorHelper(childSide, p, q);
    }

    private boolean covers(BinaryTreeNode root, BinaryTreeNode n) {
        if (root == null) return false;
        if (root == n) return true;
        return covers(root.left, n) || covers(root.right, n);
    }
}
