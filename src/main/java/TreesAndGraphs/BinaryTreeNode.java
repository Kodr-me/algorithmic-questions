package TreesAndGraphs;

public class BinaryTreeNode {
    public int data;
    public BinaryTreeNode left;
    public BinaryTreeNode right;
    public BinaryTreeNode parent;

    public BinaryTreeNode(int d) {
        this.data = d;
    }

    public static void insertNode(BinaryTreeNode node, int d) {
        if (d > node.data) {
            if (node.right == null) {
                BinaryTreeNode n = new BinaryTreeNode(d);
                n.parent = node;
                node.right = n;
            }
            else insertNode(node.right, d);
        }
        if (d < node.data) {
            if (node.left == null) {
                BinaryTreeNode n = new BinaryTreeNode(d);
                n.parent = node;
                node.left = n;
            }
            else insertNode(node.left, d);
        }
    }

    void printInOrderTraversal() {
        BinaryTreeNode n = this;
        printInOrderTraversal(n);
    }

    void printInOrderTraversal(BinaryTreeNode n) {
        if (n != null) {
            printInOrderTraversal(n.left);
            visit(n);
            printInOrderTraversal(n.right);
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
