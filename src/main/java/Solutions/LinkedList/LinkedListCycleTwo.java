package Solutions.LinkedList;

public class LinkedListCycleTwo {
    public static ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;

        ListNode p1 = head;
        ListNode p2 = head;

        int length = 0;
        // get length
        while (p2 != null && p2.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;
            if (p1 == p2) {
                length = getLength(p1);
                break;
            }
            if (p2 == null || p2.next == null) return null;
        }

        p1 = head;
        p2 = head;

//        System.out.println(length);
        while (length > 0) { // move p2 a few positions so they will match with p1
            p2 = p2.next;
            length--;
        }
//        System.out.println(p2.val);

        while (p1 != p2) {
            p1 = p1.next;
            p2 = p2.next;
        }


        // get length
        return p1;
    }

    private static int getLength(ListNode node) {
        int c = 0;
        ListNode runner = node;
        do {
            c++;
            runner = runner.next;
        } while (node != runner);
        return c;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

//        head.next.next.next.next.next.next = head.next.next; // cycle at 3, length should be 3?
//        System.out.println("LinkedList cycle start: " + detectCycle(head).val);

//        head.next.next.next.next.next.next = head.next.next.next;
//        System.out.println("LinkedList cycle start: " + detectCycle(head).val);
//
//        head.next.next.next.next.next.next = head;
//        System.out.println("LinkedList cycle start: " + detectCycle(head).val);

        System.out.println("LinkedList cycle start: " + detectCycle(new ListNode(1)).val);
    }
}
