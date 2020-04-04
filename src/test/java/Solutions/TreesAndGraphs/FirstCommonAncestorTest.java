package Solutions.TreesAndGraphs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstCommonAncestorTest {

    FirstCommonAncestor firstCommonAncestor = new FirstCommonAncestor();

    @Test
    void smallTreeAncestorIsHead() {
        BinaryTreeNode head = new BinaryTreeNode(5);
        BinaryTreeNode n3 = new BinaryTreeNode(3);
        BinaryTreeNode n6 = new BinaryTreeNode(6);

        head.left = n3;
        n3.parent = head;
        head.right = n6;
        n6.parent = head;

        head.printInOrderTraversal();

        assertEquals(head.data, firstCommonAncestor.solution(n3, n6).data);
    }

    @Test
    void largerTreeAncestorIsHead() {
        BinaryTreeNode head = new BinaryTreeNode(5);
        BinaryTreeNode n3 = new BinaryTreeNode(3);
        BinaryTreeNode n2 = new BinaryTreeNode(2);
        BinaryTreeNode n1 = new BinaryTreeNode(1);
        BinaryTreeNode n6 = new BinaryTreeNode(6);

        head.left = n3;
        n3.parent = head;
        head.right = n6;
        n6.parent = head;
        n3.parent = head;
        n3.left = n2;
        n2.parent = n3;
        n2.left = n1;
        n1.parent = n2;

        head.printInOrderTraversal();

        assertEquals(head, firstCommonAncestor.solution(n2, n6));
        assertEquals(head, firstCommonAncestor.solution(n2, n6));
    }

    @Test
    void largerTreeAncestorIsNotHead() {
        BinaryTreeNode head = new BinaryTreeNode(5);
        BinaryTreeNode n1 = new BinaryTreeNode(1);
        BinaryTreeNode n2 = new BinaryTreeNode(2);
        BinaryTreeNode n3 = new BinaryTreeNode(3);
        BinaryTreeNode n4 = new BinaryTreeNode(4);
        BinaryTreeNode n6 = new BinaryTreeNode(6);
        BinaryTreeNode n7 = new BinaryTreeNode(7);

        head.left = n3;
        n3.parent = head;
        n3.left = n2;
        n2.parent = n3;
        n2.left = n1;
        n1.parent = n2;
        n3.right = n4;
        n4.parent = n3;
        head.right = n6;
        n6.parent = head;
        n6.right = n7;
        n7.parent = n6;

        head.printInOrderTraversal();

        assertEquals(n3, firstCommonAncestor.solution(n1, n4));
        assertEquals(n3, firstCommonAncestor.noLinkToParentSolution(head, n1, n4));
    }
}
