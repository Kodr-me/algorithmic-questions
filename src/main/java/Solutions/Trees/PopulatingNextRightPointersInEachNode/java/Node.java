package Solutions.Trees.PopulatingNextRightPointersInEachNode.java;

public class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
        next = null;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }

    public void printInOrderTraversal() {
        Node n = this;
        System.out.println("printing in order traversal");
        printInOrderTraversal(n);
    }

    private void printInOrderTraversal(Node n) {
        if (n != null) {
            printInOrderTraversal(n.left);
            System.out.println("value: " + n.val);
//            if (n.next != null) System.out.println("next: " + n.next.val);
            System.out.println("--------");
            printInOrderTraversal(n.right);
        }
    }

    public void printPreOrder() {
        Node n = this;
        System.out.println("printing in pre order order traversal");
        printPreOrder(n);
    }

    private void printPreOrder(Node n) {
        if (n != null) {
            System.out.println("value: " + n.val);
            if (n.next != null) System.out.println("next: " + n.next.val);
            System.out.println("--------");
            printInOrderTraversal(n.left);
            printInOrderTraversal(n.right);
        }
    }

    public void printPostOrder() {
        Node n = this;
        System.out.println("printing in post order order traversal");
        printPostOrder(n);
    }

    private void printPostOrder(Node n) {
        if (n != null) {
            printInOrderTraversal(n.left);
            printInOrderTraversal(n.right);
            System.out.println("value: " + n.val);
            if (n.next != null) System.out.println("next: " + n.next.val);
            System.out.println("--------");
        }
    }
}
