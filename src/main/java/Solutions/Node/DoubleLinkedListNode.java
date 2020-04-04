package Solutions.Node;

import java.util.HashSet;

public class DoubleLinkedListNode {
    int data;
    public DoubleLinkedListNode next = null;
    public DoubleLinkedListNode prev = null;

    public DoubleLinkedListNode(int n) {
        data = n;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Printing double linked list: ");
        DoubleLinkedListNode n = this;
        while(n != null) {
            sb.append(n.data + ", ");
            n = n.next;
        }
        return sb.toString();
    }

    public int length() {
        int c = 0;
        DoubleLinkedListNode n = this;
        while(n != null) {
            c++;
            n = n.next;
        }
        return c;
    }

    void appendToTail(int d) {
        DoubleLinkedListNode newNode = new DoubleLinkedListNode(d);
        DoubleLinkedListNode n = this;

        while(n.next != null) {
            n = n.next;
        }
        n.next = newNode;
        newNode.prev = n;
    }

    public static DoubleLinkedListNode getNode(DoubleLinkedListNode head, int d) {
        DoubleLinkedListNode n = head;
        while (n.next != null) {
            if (n.data != d) {
                n = n.next;
            } else {
                return n;
            }
        };

        if (n.data == d) return n;
        return null;
    }

    public static DoubleLinkedListNode deleteNode(DoubleLinkedListNode head, int d) {
        DoubleLinkedListNode n = head;

        while (n.next != null ) {
            n = n.next;
            if (n.data == d) {
                n.prev.next = n.next;
                n.next.prev = n.prev;
                return n;
            }
        }
        return n;
    }

    public static void removeDuplicates(DoubleLinkedListNode head) {
        HashSet<Integer> hashSet = new HashSet<>();
        DoubleLinkedListNode n = head;

        while (n.next != null ) {
            if (!hashSet.contains(n.data)) {
                hashSet.add(n.data);
            } else {
                n.prev.next = n.next;
                n.next.prev = n.prev;
            }
            n = n.next;
        }
    }

    /*
    Picture the list 1- >5- >9 - >12.Removing 9 would make it look like 1- >5- >12.
    You only have access to the 9 node. Can you make it look like the correct answer?
     */
    public static void removeMiddleNode(DoubleLinkedListNode midNode) {
        if (midNode.next == null) return;
        if (midNode.prev == null) return;

        midNode.prev.next = midNode.next;
        midNode.next.prev = midNode.prev;
    }
}
