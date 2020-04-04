package Solutions.Trees;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode parent;

    public TreeNode(int d) {
        this.val = d;
    }

    public static void insertNode(TreeNode node, int d) {
        if (d > node.val) {
            if (node.right == null) {
                TreeNode n = new TreeNode(d);
                n.parent = node;
                node.right = n;
            }
            else insertNode(node.right, d);
        }
        if (d < node.val) {
            if (node.left == null) {
                TreeNode n = new TreeNode(d);
                n.parent = node;
                node.left = n;
            }
            else insertNode(node.left, d);
        }
    }

    public void insertNode(int d) {
        TreeNode node = this;
        if (d > node.val) {
            if (node.right == null) {
                TreeNode n = new TreeNode(d);
                n.parent = node;
                node.right = n;
            }
            else insertNode(node.right, d);
        }
        if (d < node.val) {
            if (node.left == null) {
                TreeNode n = new TreeNode(d);
                n.parent = node;
                node.left = n;
            }
            else insertNode(node.left, d);
        }
    }

    void printInOrderTraversal() {
        TreeNode n = this;
        printInOrderTraversal(n);
    }

    void printInOrderTraversal(TreeNode n) {
        if (n != null) {
            printInOrderTraversal(n.left);
            visit(n);
            printInOrderTraversal(n.right);
        }
    }

    public static void inOrderTraversal(TreeNode node) {
        if (node != null) {
            inOrderTraversal(node.left);
            visit(node);
            inOrderTraversal(node.right);
        }
    }

    public static void preOrderTraversal(TreeNode node) {
        if (node != null) {
            visit(node);
            inOrderTraversal(node.left);
            inOrderTraversal(node.right);
        }
    }

    public static void postOrderTraversal(TreeNode node) {
        if (node != null) {
            inOrderTraversal(node.left);
            inOrderTraversal(node.right);
            visit(node);
        }
    }

    private static void visit(TreeNode node) {
        System.out.println("visiting node: " + node.val);
    }

    public TreeNode find(int data) {
        TreeNode n = this;
        while (n != null) {
            if (data == n.val) return n;
            if (data < n.val) n = n.left;
            if (data > n.val) n = n.right;
        }
        return null;
    }

    public TreeNode delete(int data) {
        TreeNode n = this;
        TreeNode prev = this;
        while (n != null) {
            if (n.val == data) {
                prev.left = n.left;
                prev.right = n.right;
                n.left.parent = prev;
                n.right.parent = prev;
                return prev;
            }
            if (data < n.val) {
                prev = n;
                n = n.left;
            };
            if (data > n.val) {
                prev = n;
                n = n.right;
            };
        }
        return null;
    }
}
