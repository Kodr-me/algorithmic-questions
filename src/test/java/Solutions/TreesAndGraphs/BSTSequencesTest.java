package Solutions.TreesAndGraphs;

import org.junit.jupiter.api.Test;

public class BSTSequencesTest {
    BSTSequences bstSequences = new BSTSequences();

    @Test
    void testingWithSmallTree() {
        BinaryTreeNode head = new BinaryTreeNode(2);
        BinaryTreeNode n1 = new BinaryTreeNode(1);
        BinaryTreeNode n3 = new BinaryTreeNode(3);
        head.left = n1;
        head.right = n3;

        bstSequences.solution(head);
    }

    @Test
    void testingWithMediumTree() {
        BinaryTreeNode head = new BinaryTreeNode(2);
        BinaryTreeNode n1 = new BinaryTreeNode(1);
        BinaryTreeNode n3 = new BinaryTreeNode(3);
        BinaryTreeNode n4 = new BinaryTreeNode(4);
        head.left = n1;
        head.right = n3;
        n3.right = n4;

        bstSequences.solution(head);
    }
}
