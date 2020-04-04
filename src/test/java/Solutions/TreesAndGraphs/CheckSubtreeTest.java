package Solutions.TreesAndGraphs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckSubtreeTest {

    CheckSubtree checkSubtree = new CheckSubtree();

    @Test
    void testTrue() {
        BinaryTreeNode t2 = new BinaryTreeNode(100);
        t2.insertNode(50);
        t2.insertNode(25);
        t2.insertNode(150);
        t2.insertNode(125);
        t2.insertNode(200);

        BinaryTreeNode t1 = new BinaryTreeNode(1000);
        t1.insertNode(500);
        t1.insertNode(1500);
        t1.insertNode(2000);
        t1.insertNode(250);
        t1.insertNode(750);
        t1.left.left.left = t2;

        assertTrue(checkSubtree.solution(t1, t2));
        assertTrue(checkSubtree.containsTree(t1, t2));
        assertTrue(checkSubtree.containsSubTree(t1, t2));
    }

    @Test
    void testFalse() {
        BinaryTreeNode t2 = new BinaryTreeNode(100);


        BinaryTreeNode t1 = new BinaryTreeNode(1000);
        t1.insertNode(500);
        t1.insertNode(1500);
        t1.insertNode(2000);
        t1.insertNode(250);
        t1.insertNode(750);

        assertFalse(checkSubtree.solution(t1, t2));
        assertFalse(checkSubtree.containsTree(t1, t2));
        assertFalse(checkSubtree.containsSubTree(t1, t2));
    }

}
