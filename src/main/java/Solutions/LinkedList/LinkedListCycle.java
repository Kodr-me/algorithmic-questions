package Solutions.LinkedList;

public class LinkedListCycle {

    public static boolean hasCycle(ListNode head) {
        ListNode p1 = head;
        ListNode p2 = head;

        while(p2.next != null) {
            System.out.println("p1: " + p1.val + " p2 " + p2.val);
            p1 = p1.next;
            if (p2.next == null || p2.next.next == null) return false;
            p2 = p2.next.next;
            if (p1 == p2) return true;
        }
        return false;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        // no cycle
//        System.out.println("LinkedList has cycle: " + LinkedListCycle.hasCycle(head));

        // cycle at 3
//        head.next.next.next.next.next.next = head.next.next;
//        System.out.println("LinkedList has cycle: " + LinkedListCycle.hasCycle(head));

        // cycle at 4
        head.next.next.next.next.next.next = head.next.next.next;
        System.out.println("LinkedList has cycle: " + LinkedListCycle.hasCycle(head));
    }
}
