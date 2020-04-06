package Solutions.Trees.PopulatingNextRightPointersInEachNode.java;

import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRightPointersInEachNode {

    /*
        We can solve this with the help of Q,
        by doing this we perform a sort of breadth first search,
        were we iterate through each level of the tree at the time.
        in every level we will get the nodes in order from left to right, so all we have to do is check that we are not in the last node of that level,
        if we are not we just point to the next one by peeking at the next in the queue.

        Time and space complexity would be O(N) as we iterate through each node once and we store each node once as well
     */
    public Node connect(Node root) {
        Queue<Node> q = new LinkedList<>();

        q.add(root);

        while (!q.isEmpty()) {

            int size = q.size();

            for (int i = 0; i < size; i++) {
                Node popped = q.poll();

                // need this check in order to prevent
                if (i < size - 1) {
                    popped.next = q.peek();
                }

                if (popped.left != null) q.add(popped.left);
                if (popped.right != null) q.add(popped.right);
            }
        }

        return root;
    }

    /*
    Here we make progress by linking each level with 2 while loops.
    we always need to keep track of the leftmost node in order to tie it and move to the next level.
    In the first round we tie the level below right node with the leftmost of the right node.
    then we move down to the level below and we tie those nodes.

    In this case the time complexity is O(N) as we only iterate through each node once.
    Space complexity is O(1) since we dont make use of any extra data strucutre for traversing the ndoes in a particular order.
     */
    public Node connect2(Node root) {
        if (root == null) return null;

        // start with the root node. there are no next pointers that need to be set at the first level

        Node leftMost = root;

        // once we've reached the final level - we are done
        while (leftMost.left != null) {

            // iterate the "linked list" starting from the head node and using the next pointers, establish the corresponding links for the next level
            Node head = leftMost;

            while (head != null) {
                // connection 1
                head.left.next = head.right;

                // connection 2
                if(head.next != null) {
                    head.right.next = head.next.left;
                }

                // progress along the list (nodes on the current level)
                head = head.next;
            }

            // move onto the next level
            leftMost = leftMost.left;
        }

        return root;
    }
}

