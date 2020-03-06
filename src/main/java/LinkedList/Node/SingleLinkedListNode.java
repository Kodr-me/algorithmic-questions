package LinkedList.Node;

import java.util.HashSet;

public class SingleLinkedListNode {
    SingleLinkedListNode next = null;
    int data;

    public SingleLinkedListNode(int d) {
        data = d;
    }

    int length() {
        int counter = 1;
        SingleLinkedListNode n = this;
        while (n.next != null) {
            counter++;
            n = n.next;
        }
        return counter;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        SingleLinkedListNode n = this;
        while (n.next != null) {
            stringBuilder.append(n.data);
            stringBuilder.append(", ");
            n = n.next;
        }
        stringBuilder.append(n.data);
        stringBuilder.append(", ");
        return stringBuilder.toString();
    }

    void appendToTail(int d) {
        SingleLinkedListNode n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = new SingleLinkedListNode(d);
    }

    public static SingleLinkedListNode deleteNode(SingleLinkedListNode head, int d) {
        SingleLinkedListNode n = head;

        if(n.data == d) {
            return n.next;
        }

        while (n.next != null) {
            if (n.next.data == d) {
                n.next = n.next.next;
                return head;
            }
            n = n.next;
        }
        return head;
    }

    public static void removeDupplicates(SingleLinkedListNode head) {
        SingleLinkedListNode n = head;
        HashSet<Integer> a = new HashSet<>();

        while (n.next != null) {
            int i = n.data;
            if (!a.contains(i)) a.add(i);

            if(a.contains(n.next.data) && n.next.next != null) {
                n.next = n.next.next;
            }

            if(a.contains(n.next.data)) {
                n.next = null;
            } else {
                n = n.next;
            }
        }
    }

    /*
    Problem: Return Kth to Last: Implement an algorithm to find the kth to last element of a singly linked list.
    Hints:
    - What if you knew the linked list size? What is the difference between finding the Kth-to- last element and finding the Xth element?
    - If you don't know the linked list size, can you compute it? How does this impact the runtime?
    - Try implementing it recursively. If you could find the (K - l )th to last element, can you find the Kth element?
    - You might find it useful to return multiple values. Some languages don't directly support this, but there are workarounds in essentially any language. What are some of those workarounds?
    - Can you do it iteratively? Imagine if you had two pointers pointing to adjacent nodes and they were moving at the same speed through the linked list. When one hits the end of the linked list, where will the other be?
     */

    public static SingleLinkedListNode kThLastRough(SingleLinkedListNode head, int n) {
        SingleLinkedListNode quickRunner = head;
        SingleLinkedListNode slowRunner = head;
        int length = 0;
        int c = 0;

        while (quickRunner.next.next != null) {
            quickRunner = quickRunner.next.next;
            slowRunner = slowRunner.next;
            length++;
            length++;
            c++;
        }
        length++;

        while (length - c > n) {
            slowRunner = slowRunner.next;
            c++;
        }


        return slowRunner;
    }

    public static SingleLinkedListNode kThLastIteratively(SingleLinkedListNode head, int k) {
        SingleLinkedListNode p1 = head;
        SingleLinkedListNode p2 = head;
        for (int i = 0; i < k; i++) {
            if (p1.next == null) return null;
            p1 = p1.next;
        }

        while (p1.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }

        return p2;
    }

    public static int kthLastRecursively(SingleLinkedListNode head, int k) {
        if (head == null) {
            return 0;
        }
        int index = kthLastRecursively(head.next, k) + 1;
        if (index == k) {
            System.out.println(k + "th to last node is " + head.data);
        }
        return head.data;
    }

    public static void printRecursively(SingleLinkedListNode head) {
        if (head == null) {
            return;
        }
        printRecursively(head.next);
    }

    public static SingleLinkedListNode getNode(SingleLinkedListNode head, int d) {
        SingleLinkedListNode n = head;

        while (n.next != null) {
            if (n.data != d) {
                n = n.next;
            } else {
                return n;
            }
        };

        if (n.data == d) return n;
        return null;
    }

    /*
        In case of having a normal linked list, we need to perform a check to verify if is the last node
        Then we can just give the node provided the same information as the next node - making it seem like a replacement.
     */
    public static boolean deleteMiddleNode(SingleLinkedListNode singleLinkedListNode) {
        if (singleLinkedListNode == null || singleLinkedListNode.next == null) return false;
        SingleLinkedListNode next = singleLinkedListNode.next;
        singleLinkedListNode.data = next.data;
        singleLinkedListNode.next = next.next;
        return true;
    }

    /*
    Intersection: Given two (singly) linked lists, determine if the two lists intersect. Return the inter- secting node.
    Note that the intersection is defined based on reference, not value. That is, if the kth node of the first linked
    list is the exact same node (by reference) as the jth node of the second linked list, then they are intersecting.
     */
}
