package Solutions.LinkedList;

public class LinkedListLength {
    public static int findCycleLength(ListNode head) {
        ListNode p1 = head;
        ListNode p2 = head;

        while (p2 != null && p2.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;
            if (p1 == p2) {
                return getLength(p1);
            }
        }
        return 0;
    }

    private static int getLength(ListNode slowPointer) {
        int c = 0;
        ListNode runner = slowPointer;
        do {
            c++;
            runner = runner.next;
        } while (runner != slowPointer);

        return c;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = head.next.next; // cycle at 3
        System.out.println("LinkedList cycle length: " + findCycleLength(head));

        head.next.next.next.next.next.next = head.next.next.next;
        System.out.println("LinkedList cycle length: " + findCycleLength(head));
    }
}
