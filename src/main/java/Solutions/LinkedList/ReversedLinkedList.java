package Solutions.LinkedList;

import java.util.ArrayList;

public class ReversedLinkedList {

    public ListNode reverseList(ListNode head) {

        if (head == null) return null;
        if (head.next == null) return head;

        ListNode prev = null;
        ListNode traverser = head;

        // do it in a single pass
        while (traverser != null) {

            ListNode next = traverser.next; // need to cache the next
            traverser.next = prev; // makes the traversing node next the prev
            prev = traverser; // need to keep track of previous

            traverser = next;
        }

//        printNodes(prev);

        return prev;
    }

    public ListNode reverseListRecursively(ListNode head) {
        if (head == null) return null;
        return reverseListRecursively(head, null);
    }

    public ListNode reverseListRecursively(ListNode current, ListNode prev) {
        ListNode next = current.next;
        current.next = prev;
        if (next == null) return current;
        return reverseListRecursively(next, current);
    }

    static void printNodes(ListNode n) {
        System.out.println("printing listNode");
        while (n != null) {
            System.out.println(n.val);
            n = n.next;
        };
        System.out.println("end printing listNode");
    }

    public static void printList(ArrayList<ListNode> list) {
        System.out.println("printing list");
        for (ListNode listNode : list) {
            System.out.println(listNode.val);
        }
        System.out.println("printing ended");
    }
}
