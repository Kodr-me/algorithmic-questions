package Solutions.LinkedList;

class ReverseSubList {

    public static ListNode reverse(ListNode head, int m, int n) {
        if (head == null || head.next == null) return head;

        int c = 1;
        ListNode originalHead = head;
        ListNode prev = head;
        ListNode current = head.next;



        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode result = ReverseSubList.reverse(head, 2, 4);
        System.out.print("Nodes of the reversed LinkedList are: ");
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
