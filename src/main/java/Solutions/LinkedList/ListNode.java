package Solutions.LinkedList;

public class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public void print() {
        ListNode n = this;
        System.out.println("printing nodes");
        while (n.next != null) {
            System.out.print("ListNode: " + n.val + ", ");
            n = n.next;
        }
        System.out.print("ListNode: " + n.val + ", ");
    }
}
