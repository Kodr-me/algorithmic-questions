package TreesAndGraphs;

public class BinaryTreeNode {
    int data;
    public BinaryTreeNode left;
    public BinaryTreeNode right;

    public BinaryTreeNode(int d) {
        this.data = d;
    }

    public static void insertNode(BinaryTreeNode node, int d) {
        if (d > node.data) {
            if (node.right == null) node.right = new BinaryTreeNode(d);
            else insertNode(node.right, d);
        }
        if (d < node.data) {
            if (node.left == null) node.left = new BinaryTreeNode(d);
            else insertNode(node.left, d);
        }
    }

    public static void inOrderTraversal(BinaryTreeNode node) {
           if (node != null) {
               inOrderTraversal(node.left);
               visit(node);
               inOrderTraversal(node.right);
           }
    }

    public static void preOrderTraversal(BinaryTreeNode node) {
        if (node != null) {
            visit(node);
            inOrderTraversal(node.left);
            inOrderTraversal(node.right);
        }
    }

    public static void postOrderTraversal(BinaryTreeNode node) {
        if (node != null) {
            inOrderTraversal(node.left);
            inOrderTraversal(node.right);
            visit(node);
        }
    }

    private static void visit(BinaryTreeNode node) {
        System.out.println("visiting node: " + node.data);
    }
}
