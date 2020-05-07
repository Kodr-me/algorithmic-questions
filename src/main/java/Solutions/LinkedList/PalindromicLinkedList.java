package Solutions.LinkedList;

class PalindromicLinkedList {

    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        int length = 1;
        ListNode p1 = head, p2 = head;

        while (p1.next != null) {
            length++;
            p1 = p1.next;
        }

        p1 = head;
        int stepsForward = length-1;
//        System.out.println("steps forward: " + stepsForward);

        for (int i = 0; i < length / 2; i++) {
            // move p2
            for (int j = 0; j < stepsForward; j++) p2 = p2.next;
            if (p1.val != p2.val) return false;
            p2 = head;
            p1 = p1.next;
            stepsForward--;
        }

        return true;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        head.next = new ListNode(4);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(2);
        System.out.println("Is palindrome: " + PalindromicLinkedList.isPalindrome(head));

        head.next.next.next.next.next = new ListNode(2);
        System.out.println("Is palindrome: " + PalindromicLinkedList.isPalindrome(head));
    }
}
