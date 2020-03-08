package LinkedList.Node;

import org.junit.jupiter.api.Test;

import static LinkedList.Node.SingleLinkedListNode.*;
import static org.junit.jupiter.api.Assertions.*;

public class SingleLinkedListNodeTest {
    @Test
    void lengthTest1() {
        SingleLinkedListNode head = generateList();
        assertTrue(head.length() == 6);
    }

    @Test
    void appendToTail() {
        SingleLinkedListNode head = new SingleLinkedListNode(0);
        head.appendToTail(1);
        assertTrue(head.next.data == 1);
    }

    @Test
    void appendToTail2() {
        SingleLinkedListNode head = new SingleLinkedListNode(0);
        head.appendToTail(1);
        head.appendToTail(2);
        head.appendToTail(3);
        assertTrue(head.next.next.next.data == 3);
    }

    @Test
    void deleteNodeTest1() {
        SingleLinkedListNode n = generateList();
        deleteNode(n, 1);
        assertTrue(n.next.data == 2);
    }

    @Test
    void deleteNodeTest2() {
        SingleLinkedListNode n = generateList();
        SingleLinkedListNode result = deleteNode(n, 10);
        assertTrue(result.data == 0);
    }

    @Test
    void deleteNodeTest3() {
        SingleLinkedListNode n = generateList();
        SingleLinkedListNode result = deleteNode(n, 0);
        assertTrue(result.data == 1);
    }

    @Test
    void removeDuplicateNodeTest1() {
        SingleLinkedListNode n = generateList();
        n.appendToTail(5);
        n.appendToTail(6);
        n.appendToTail(2);
        removeDuplicates(n);

        int length = n.length();

        assertTrue(length == 7);
    }

    @Test
    void kthLastTest3() {
        SingleLinkedListNode head = generateLongerList();
        SingleLinkedListNode n = kThLastIteratively(head, 3);
        assertEquals(6, n.data);
    }

    @Test
    void kthLastTest4() {
        SingleLinkedListNode head = generateList();
        SingleLinkedListNode n = kThLastIteratively(head, 2);
        assertEquals(3, n.data);
    }

    @Test
    void getNodeTest() {
        SingleLinkedListNode head = generateList();
        SingleLinkedListNode n = getNode(head, 3);
        assertEquals(3, n.data);
    }

    @Test
    void getNodeTes1() {
        SingleLinkedListNode head = generateList();
        SingleLinkedListNode n = getNode(head, 0);
        assertEquals(0, n.data);
    }

    @Test
    void getNodeTes3() {
        SingleLinkedListNode head = generateList();
        SingleLinkedListNode n = getNode(head, 5);
        assertEquals(5, n.data);
    }

    @Test
    void getNodeTes4() {
        SingleLinkedListNode head = generateList();
        assertNull(getNode(head, 100));
    }

    @Test
    void deleteMiddleNodeTest1() {
        SingleLinkedListNode head = generateList();
        SingleLinkedListNode n = getNode(head, 3);
        boolean result = deleteMiddleNode(n);
        assertTrue(result);
        assertEquals(5, head.length());
    }

    @Test
    void partitionTest1() {
        SingleLinkedListNode head = new SingleLinkedListNode(3);
        head.appendToTail(5);
        head.appendToTail(8);
        head.appendToTail(5);
        head.appendToTail(10);
        head.appendToTail(2);
        head.appendToTail(1);
        SingleLinkedListNode partitioned = head.partition(5);
        assertEquals(partitioned.data, 1);
        assertEquals(partitioned.next.data, 2);
        assertEquals(partitioned.next.next.data, 3);
    }

    @Test
    void sumListTest1() {
        SingleLinkedListNode list1 = new SingleLinkedListNode(7);
        list1.appendToTail(1);
        list1.appendToTail(6);

        SingleLinkedListNode list2 = new SingleLinkedListNode(5);
        list2.appendToTail(9);
        list2.appendToTail(2);

        SingleLinkedListNode result = sumList(list1, list2);
        assertEquals(2, result.data);
        assertEquals(1, result.next.data);
        assertEquals(9, result.next.next.data);
    }

    @Test
    void sumListFollowUpTest1() {
        SingleLinkedListNode list1 = new SingleLinkedListNode(6);
        list1.appendToTail(1);
        list1.appendToTail(7);

        SingleLinkedListNode list2 = new SingleLinkedListNode(2);
        list2.appendToTail(9);
        list2.appendToTail(5);

        SingleLinkedListNode result = sumListFollowUp(list1, list2);
        assertEquals(9, result.data);
        assertEquals(1, result.next.data);
        assertEquals(2, result.next.next.data);
    }

    @Test
    void palindromeTest1() {
        SingleLinkedListNode head = new SingleLinkedListNode(1);
        head.appendToTail(2);
        head.appendToTail(3);
        head.appendToTail(3);
        head.appendToTail(2);
        head.appendToTail(1);

        assertTrue(linkedListPalindromeReverseAndCompare(head));
    }

    @Test
    void intersectionTest1() {
        SingleLinkedListNode head = generateList();
        SingleLinkedListNode intersected = getNode(head, 3);
        SingleLinkedListNode list2 = new SingleLinkedListNode(10);
        list2.appendToTail(11);
        list2.appendToTail(12);
        getNode(list2, 12).next = intersected;

        assertTrue(linkedListIntersection(head, list2));
    }

    @Test
    void palindromeTest2() {
        SingleLinkedListNode head = new SingleLinkedListNode(1);
        head.appendToTail(2);
        head.appendToTail(3);
        head.appendToTail(3);
        head.appendToTail(2);
        head.appendToTail(2);

        assertFalse(linkedListPalindromeReverseAndCompare(head));
    }

    SingleLinkedListNode generateList() {
        SingleLinkedListNode head = new SingleLinkedListNode(0);
        head.appendToTail(1);
        head.appendToTail(2);
        head.appendToTail(3);
        head.appendToTail(4);
        head.appendToTail(5);
        return head;
    }

    SingleLinkedListNode generateLongerList() {
        SingleLinkedListNode head = new SingleLinkedListNode(0);
        head.appendToTail(1);
        head.appendToTail(2);
        head.appendToTail(3);
        head.appendToTail(4);
        head.appendToTail(5);
        head.appendToTail(6); // 3
        head.appendToTail(7); // 2
        head.appendToTail(8); // 1
        head.appendToTail(9); // 0
        return head;
    }
}
