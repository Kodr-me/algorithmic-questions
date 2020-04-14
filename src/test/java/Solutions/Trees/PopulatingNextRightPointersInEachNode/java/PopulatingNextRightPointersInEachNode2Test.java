package Solutions.Trees.PopulatingNextRightPointersInEachNode.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PopulatingNextRightPointersInEachNode2Test {
    PopulatingNextRightPointersInEachNode2 populatingNextRightPointersInEachNode = new PopulatingNextRightPointersInEachNode2();

    @Test
    void test1() {
        Node head = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);

        head.left = n2;
        n2.left = n4;
        n2.right = n5;

        head.right = n3;
        n3.right = n7;


        Node result = populatingNextRightPointersInEachNode.connect(head);
//        result.printInOrderTraversal();

        // assert 2 equals 3
        assertEquals(result.left.next.val, n3.val);

        // assert 4 is 5
        assertEquals(result.left.left.next.val, n5.val);

        // assert 5 is 7
        assertEquals(result.left.right.next.val, n7.val);
    }

}