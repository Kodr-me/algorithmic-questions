package TreesAndGraphs;

import org.junit.jupiter.api.Test;

import static TreesAndGraphs.BinaryTreeNode.insertNode;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsBalancedTest {
    MinimalTree mt = new MinimalTree();
    IsBalanced isBalanced = new IsBalanced();
    int [] ints = new int[]{1,2,3,4,5,6,7,8,9};



    @Test
    void test1() {
        BinaryTreeNode head = mt.createMinimalBST(ints);
        assertTrue(isBalanced.solution(head));
    }

    @Test
    void test2() {
        BinaryTreeNode head = new BinaryTreeNode(5);
        insertNode(head, 3);
        insertNode(head, 7);
        insertNode(head, 8);
        insertNode(head, 9);

        assertFalse(isBalanced.solution(head));
    }
}
