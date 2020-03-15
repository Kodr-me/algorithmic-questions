package TreesAndGraphs;

import org.junit.jupiter.api.Test;

import static TreesAndGraphs.BinaryTreeNode.insertNode;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidateBSTTest {
    ValidateBST validateBST = new ValidateBST();
    int [] ints = new int[]{1,2,3,4,5,6,7,8,9};
    MinimalTree mt = new MinimalTree();

    @Test
    void testSmallerThan() {
        BinaryTreeNode head = generateTree();
//        inOrderTraversal(head);
        assertTrue(validateBST.checkBST(head));
    }

    @Test
    void testSmallerThanFalse() {
        BinaryTreeNode head = new BinaryTreeNode(5);
        BinaryTreeNode n1 = new BinaryTreeNode(1);
        BinaryTreeNode n2 = new BinaryTreeNode(2);
        BinaryTreeNode n3 = new BinaryTreeNode(3);
        BinaryTreeNode n4 = new BinaryTreeNode(4);
        BinaryTreeNode n5 = new BinaryTreeNode(5);
        BinaryTreeNode n6 = new BinaryTreeNode(6);

        head.left = n3;
        n3.left = n2;
        n3.right = n4;
        n2.left = n6;
//        inOrderTraversal(head);
        assertFalse(validateBST.checkBST(head));
    }

    @Test
    void testBiggerThanFalse() {
        BinaryTreeNode head = new BinaryTreeNode(5);
        BinaryTreeNode n1 = new BinaryTreeNode(1);
        BinaryTreeNode n2 = new BinaryTreeNode(2);
        BinaryTreeNode n3 = new BinaryTreeNode(3);
        BinaryTreeNode n4 = new BinaryTreeNode(4);
        BinaryTreeNode n5 = new BinaryTreeNode(5);
        BinaryTreeNode n6 = new BinaryTreeNode(6);

        head.left = n3;
        n3.left = n2;
        n3.right = n1;
//        inOrderTraversal(head);
        assertFalse(validateBST.checkBST(head));
    }

    @Test
    void testSmallerThanFalse2() {
        BinaryTreeNode head = new BinaryTreeNode(5);
        BinaryTreeNode n1 = new BinaryTreeNode(1);
        BinaryTreeNode n2 = new BinaryTreeNode(2);
        BinaryTreeNode n3 = new BinaryTreeNode(3);
        BinaryTreeNode n4 = new BinaryTreeNode(4);
        BinaryTreeNode n6 = new BinaryTreeNode(6);

        head.left = n3;
        n3.left = n2;
        n3.right = n4;
        n2.left = n6;
        n6.left = n1;
        assertFalse(validateBST.checkBST(head));
    }

    @Test
    void testSmallerThanFalse3() {
        BinaryTreeNode head = new BinaryTreeNode(5);
        BinaryTreeNode n1 = new BinaryTreeNode(1);
        BinaryTreeNode n2 = new BinaryTreeNode(2);
        BinaryTreeNode n3 = new BinaryTreeNode(3);
        BinaryTreeNode n4 = new BinaryTreeNode(4);
        BinaryTreeNode n6 = new BinaryTreeNode(6);

        head.left = n3;
        n3.left = n6;
        n6.left = n1;
        assertFalse(validateBST.checkBST(head));
    }

    BinaryTreeNode generateTree() {
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

    BinaryTreeNode generateBadTree() {
        BinaryTreeNode head = new BinaryTreeNode(5);
        BinaryTreeNode n1 = new BinaryTreeNode(1);
        BinaryTreeNode n2 = new BinaryTreeNode(2);
        BinaryTreeNode n3 = new BinaryTreeNode(3);
        BinaryTreeNode n4 = new BinaryTreeNode(4);
        BinaryTreeNode n5 = new BinaryTreeNode(5);
        BinaryTreeNode n6 = new BinaryTreeNode(6);

        head.left = n3;
        n3.left = n2;
        n3.right = n4;
        n2.left = n6;

        return head;
    }
}
