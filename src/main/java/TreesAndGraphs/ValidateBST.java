package TreesAndGraphs;

public class ValidateBST {
    public boolean checkBST(BinaryTreeNode head) {
        if (head == null) return true;
        boolean checkLeft = true;
        boolean checkRight = true;

        if (head.left != null) checkLeft = (head.data > head.left.data) && checkBST(head.left);

        if (head.right != null) checkRight = (head.data < head.right.data) && checkBST(head.right);
        return checkLeft && checkRight;
    }
}
