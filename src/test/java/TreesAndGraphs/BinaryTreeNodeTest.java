package TreesAndGraphs;

import org.junit.jupiter.api.Test;

import static TreesAndGraphs.BinaryTreeNode.inOrderTraversal;
import static TreesAndGraphs.BinaryTreeNode.insertNode;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreeNodeTest {

    @Test
    void test1() {
        BinaryTreeNode head = new BinaryTreeNode(5);

        insertNode(head, 3);
        insertNode(head, 7);
        insertNode(head, 8);
        insertNode(head, 6);
        insertNode(head, 2);
        insertNode(head, 4);
        insertNode(head, 1);

        inOrderTraversal(head);

//        assertEquals(2, head.left.left.data);
//        assertEquals(3, head.left.data);
//        assertEquals(4, head.left.right.data);
//        assertEquals(8, head.right.data);
//        assertEquals(8, head.right.left.data);
    }
}
