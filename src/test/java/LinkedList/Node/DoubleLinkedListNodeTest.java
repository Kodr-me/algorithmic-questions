package LinkedList.Node;

import org.junit.jupiter.api.Test;

import static LinkedList.Node.DoubleLinkedListNode.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class DoubleLinkedListNodeTest {

    @Test
    void DLLAppendToTailTest1() {
        DoubleLinkedListNode n = new DoubleLinkedListNode(0);
        n.appendToTail(1);
        assertEquals(1, n.next.data);
    }

    @Test
    void DLLAppendToTailTest2() {
        DoubleLinkedListNode n = new DoubleLinkedListNode(0);
        n.appendToTail(1);
        n.appendToTail(2);
        assertEquals(2, n.next.next.data);
    }

    @Test
    void DLLAppendToTailTest3() {
        DoubleLinkedListNode n = new DoubleLinkedListNode(0);
        n.appendToTail(1);
        n.appendToTail(2);
        n.appendToTail(3);
        assertEquals(2, n.next.next.next.prev.data);
        assertEquals(4, n.length());
    }

    @Test
    void DLLDeleteNodeTest1() {
        DoubleLinkedListNode head = generateList();
        DoubleLinkedListNode deleted = deleteNode(head, 3);
        assertEquals(5, head.length());
        assertEquals(3, deleted.data);
    }

    @Test
    void DLLremoveDuplicatesTests() {
        DoubleLinkedListNode head = generateList();
        head.appendToTail(1);
        head.appendToTail(2);
        head.appendToTail(6);
        removeDuplicates(head);
        System.out.println(head.toString());
        assertEquals(7, head.length());
    }

    @Test
    void getNodeTest() {
        DoubleLinkedListNode head = generateList();
        DoubleLinkedListNode n = getNode(head, 3);
        assertEquals(3, n.data);
    }

    @Test
    void getNodeTes1() {
        DoubleLinkedListNode head = generateList();
        DoubleLinkedListNode n = getNode(head, 0);
        assertEquals(0, n.data);
    }

    @Test
    void getNodeTes3() {
        DoubleLinkedListNode head = generateList();
        DoubleLinkedListNode n = getNode(head, 5);
        assertEquals(5, n.data);
    }

    @Test
    void getNodeTes4() {
        DoubleLinkedListNode head = generateList();
        DoubleLinkedListNode n = getNode(head, 100);
        assertNull(getNode(head, 100));
    }

    @Test
    void removeMiddleNodeTest1() {
        DoubleLinkedListNode head = generateList();
        DoubleLinkedListNode n = getNode(head, 3);
        System.out.println(head.length());
        removeMiddleNode(n);
        assertEquals(5, head.length());
    }

    DoubleLinkedListNode generateList() {
        DoubleLinkedListNode n = new DoubleLinkedListNode(0);
        n.appendToTail(1);
        n.appendToTail(2);
        n.appendToTail(3);
        n.appendToTail(4);
        n.appendToTail(5);
        return n;
    }

}
