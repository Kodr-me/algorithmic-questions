package Solutions.TreesAndGraphs;

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

    public void insertNode(int d) {
        BinaryTreeNode node = this;
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

    public BinaryTreeNode find(int data) {
        BinaryTreeNode n = this;
        while (n != null) {
            if (data == n.data) return n;
            if (data < n.data) n = n.left;
            if (data > n.data) n = n.right;
        }
        return null;
    }

    public BinaryTreeNode delete(int data) {
        BinaryTreeNode n = this;
        BinaryTreeNode prev = this;
        while (n != null) {
            if (n.data == data) {
                prev.left = n.left;
                prev.right = n.right;
                n.left.parent = prev;
                n.right.parent = prev;
                return prev;
            }
            if (data < n.data) {
                prev = n;
                n = n.left;
            };
            if (data > n.data) {
                prev = n;
                n = n.right;
            };
        }
        return null;
    }
}
