package Solutions.Trees.PopulatingNextRightPointersInEachNode.java;

import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRightPointersInEachNode2 {

    public Node connect(Node head) {
        if (head == null) return null;

        Node leftMost = head;
        Node n = head;

        while (leftMost != null) {



            // make children pointing
            leftMost.left.next = leftMost.right;
            leftMost = leftMost.left;

            n = leftMost.next;

            System.out.println("----");
            System.out.println("leftmost: " + leftMost.val);
            System.out.println("n: " + n.val);



            if (n.left != null) leftMost.right.next = n.left;
            if (n.right != null) {
                System.out.println("setting leftmost right next to: " + n.right);
                leftMost.right.next = n.right;
            };


        }

        return head;

    }

    public Node connect2(Node head) {
        Queue<Node> q = new LinkedList<>();

        q.add(head);

        while (!q.isEmpty()) {
            // can iterate through the nodes per level

            // we want to add the kids whilst adding all the nodes but the last
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Node popped = q.poll();

                if (i != size - 1) {
                    popped.next = q.peek();
                }

                if (popped.left != null) q.add(popped.left);
                if (popped.right != null) q.add(popped.right);
            }

        }

        return head;

    }
}
