package Solutions.LinkedList;

class RearrangeList {

    public static void reorder(ListNode head) {
        // reverse the second half
        ListNode preHead = new ListNode(0), p1 = preHead, p2 = preHead;
        preHead.next = head;
//        head.print();
//        System.out.println("");
//        System.out.println("--------");

        while (p2 != null && p2.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;
        }
//        System.out.println("p1: " + p1.val);
//        p1 = p1.next;
//        head.print();
//        System.out.println();
//        System.out.println("secondHalfReversed");
        ListNode secondHalfReversed = reverseList(p1.next); // even number is good
        p1.next = null;
//        head.print();
//        secondHalfReversed.print();

        mergeLists(head, secondHalfReversed);
//
//        System.out.println("");
//        System.out.println("printing head ");
//        head.print();

    }

    private static void mergeLists(ListNode head, ListNode secondHalfReversed) {
        ListNode runner = head, temp, temp2;
        while (runner != null && runner.next != null) {
            temp = secondHalfReversed.next;
            temp2 = runner.next;
            runner.next = secondHalfReversed;
            secondHalfReversed.next = temp2;
            secondHalfReversed = temp;
            runner = runner.next.next;
//            System.out.println("head: ");
//            head.print();
//            System.out.println();
//            System.out.println("reversed: ");
//            secondHalfReversed.print();
        }
        if (secondHalfReversed != null) runner.next = secondHalfReversed;
    }

    private static ListNode reverseList(ListNode head) {
        ListNode preHead = new ListNode(0);
        preHead.next = head;
        while (head.next != null) {
            // switch head and next
            ListNode initialHead = preHead.next;
            ListNode next = head.next;
            ListNode nextNext = next.next; // could be null

            preHead.next = next;
            next.next = initialHead;
            head.next = nextNext;
        }
        return preHead.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        head.next = new ListNode(4);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(8);
        head.next.next.next.next = new ListNode(10);
        head.next.next.next.next.next = new ListNode(12);
        RearrangeList.reorder(head);
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}
