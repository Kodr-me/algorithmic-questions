package Solutions.LinkedList;

import java.util.ArrayList;

public class ReversedLinkedList {

    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode prev = head;
        ListNode current = head.next;
        while (current != null) {
            prev.next = current.next;
            current.next = head;

            head = current;
            current = prev.next;
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        head.next = new ListNode(4);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(8);
        head.next.next.next.next = new ListNode(10);

        ListNode result = reverseList(head);
        System.out.print("Nodes of the reversed LinkedList are: ");
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
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
