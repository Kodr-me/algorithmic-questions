package TreesAndGraphs;

public class BinaryTreeNode {
    int data;
    BinaryTreeNode left;
    BinaryTreeNode right;

    public BinaryTreeNode(int d) {
        this.data = d;
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