package Solutions.TreesAndGraphs;

import static Solutions.TreesAndGraphs.BinaryTreeNode.insertNode;

public class BSTUtils {
    public static BinaryTreeNode generateTree() {
        BinaryTreeNode head = new BinaryTreeNode(5);
        insertNode(head, 3);
        insertNode(head, 2);
        insertNode(head, 4);
        insertNode(head, 1);
        insertNode(head, 7);
        insertNode(head, 6);
        insertNode(head, 8);
        insertNode(head, 9);

        return head;
    }
}
