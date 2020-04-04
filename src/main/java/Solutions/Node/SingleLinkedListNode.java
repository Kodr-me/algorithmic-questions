package Solutions.Node;

import java.util.HashSet;
import java.util.Stack;

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

    public static void removeDuplicates(SingleLinkedListNode head) {
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
        if (head == null) return 0;
        int index = kthLastRecursively(head.next, k) + 1;

        if (index == k) System.out.println(k + "th to last node is " + head.data);
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

    public static boolean deleteMiddleNode(SingleLinkedListNode singleLinkedListNode) {
        if (singleLinkedListNode == null || singleLinkedListNode.next == null) return false;
        SingleLinkedListNode next = singleLinkedListNode.next;
        singleLinkedListNode.data = next.data;
        singleLinkedListNode.next = next.next;
        return true;
    }

    public static SingleLinkedListNode sumList(SingleLinkedListNode list1, SingleLinkedListNode list2) {
        String list1Values = getListNumbersInReverse(list1);
        String list2Values = getListNumbersInReverse(list2);
        int sum = Integer.parseInt(list1Values) + Integer.parseInt(list2Values);

        String stringedResult = Integer.toString(sum);

        char c = stringedResult.charAt(stringedResult.length() - 1);
        int data = c - '0';

        SingleLinkedListNode result = new SingleLinkedListNode(data);

        for (int i = stringedResult.length() - 2; i >= 0; i--) {
            c = stringedResult.charAt(i);
            data = c - '0';
            result.appendToTail(data);
        }

        return result;
    }

    private static String getListNumbersInReverse(SingleLinkedListNode singleLinkedListNode) {
        StringBuilder listNumbers = new StringBuilder();
        SingleLinkedListNode n = singleLinkedListNode;

        while (n.next != null) {
            listNumbers.append(n.data);
            n = n.next;
        }
        listNumbers.append(n.data);
        listNumbers.reverse();
        return listNumbers.toString();
    }

    public static SingleLinkedListNode sumListFollowUp(SingleLinkedListNode list1, SingleLinkedListNode list2) {
        String list1Values = getListNumbers(list1);
        String list2Values = getListNumbers(list2);
        int sum = Integer.parseInt(list1Values) + Integer.parseInt(list2Values);

        String stringedResult = Integer.toString(sum);
        System.out.println(stringedResult);

        char c = stringedResult.charAt(0);
        int data = c - '0';

        SingleLinkedListNode result = new SingleLinkedListNode(data);

        for (int i = 1; i < stringedResult.length(); i++) {
            c = stringedResult.charAt(i);
            data = c - '0';
            result.appendToTail(data);
        }

        return result;
    }

    private static String getListNumbers(SingleLinkedListNode singleLinkedListNode) {
        StringBuilder listNumbers = new StringBuilder();
        SingleLinkedListNode n = singleLinkedListNode;

        while (n.next != null) {
            listNumbers.append(n.data);
            n = n.next;
        }
        listNumbers.append(n.data);
        return listNumbers.toString();
    }

    public static boolean linkedListPalindromeReverseAndCompare(SingleLinkedListNode node) {
           SingleLinkedListNode reversed = reverseList(node);
            return compareLists(node, reversed);
    }

    private static boolean compareLists(SingleLinkedListNode n1, SingleLinkedListNode n2) {
        while (n1 != null) {
            if (n1.data != n2.data) return false;
            n1 = n1.next;
            n2 = n2.next;
        }
        return true;
    }

    private static SingleLinkedListNode reverseList(SingleLinkedListNode node) {
        SingleLinkedListNode prev = new SingleLinkedListNode(node.data);
        SingleLinkedListNode holder = null;
        while (node.next != null) {
            node = node.next;
            holder = new SingleLinkedListNode(node.data);
            holder.next = prev;
            prev = holder;

        }
        return holder;
    }

    public static boolean isLinkedListPalindromeIteratively(SingleLinkedListNode head) {
        Stack<Integer> stack = new Stack<>();
        SingleLinkedListNode slow = head;
        SingleLinkedListNode fast = head;

        while (fast != null && fast.next != null) {
            stack.push(slow.data);
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast.next != null) {
            slow = slow.next;
        }

        while (slow.next != null) {
            int top = stack.pop().intValue();
            if (top != slow.data) return false;
            slow = slow.next;
        }
        return true;
    }

    public SingleLinkedListNode partition(int pivot) {
        SingleLinkedListNode left = null;
        SingleLinkedListNode right = null;
        SingleLinkedListNode node = this;
        SingleLinkedListNode n = null;

        while (node.next != null) {
            n = new SingleLinkedListNode(node.data);
            if (n.data >= pivot) {
                right = appendToStart(right, n);
            } else {
                left = appendToStart(left, n);
            }
            node = node.next;
        }
        n = new SingleLinkedListNode(node.data);
        if (node.data >= pivot) {
            right = appendToStart(right, n);
        } else {
            left = appendToStart(left, n);
        }

        node = left;
        while (node.next != null) {
            node = node.next;
        }
        node.next = right;
        return left;
    }

    private SingleLinkedListNode appendToStart(SingleLinkedListNode list, SingleLinkedListNode newNode) {
        if (list == null) list = newNode;
        else {
            newNode.next = list;
            list = newNode;
        }
        return list;
    }

    public static SingleLinkedListNode partitionSimple(SingleLinkedListNode node, int x) {
        SingleLinkedListNode head = node;
        SingleLinkedListNode tail = node;
        while (node.next != null) {
            SingleLinkedListNode next = node.next;
            // insert node at head
            if (node.data < x) {
                node.next = head;
                head = node;
            // insert node at tail
            } else {
                tail.next = node;
                tail = node;
            }
            node = node.next;
        }
        tail.next = null;

        return head;
    }


    public static SingleLinkedListNode linkedListIntersectionHashMap(SingleLinkedListNode node1, SingleLinkedListNode node2) {
        HashSet<Integer> hash = new HashSet<>();

        while (node1.next != null) {
            hash.add(node1.hashCode());
            node1 = node1.next;
        }

        while (node2.next != null) {
            if (hash.contains(node2.hashCode())) return node2;
            node2 = node2.next;
        }

        return null;
    }

    private static SingleLinkedListNode getLastNode(SingleLinkedListNode head) {
        if (head.next == null) {
            return head;
        }
        return getLastNode(head.next);
    }

    public static SingleLinkedListNode linkedListIntersectionTailCheck(SingleLinkedListNode node1, SingleLinkedListNode node2) {

        SingleLinkedListNode lastNode1 = getLastNode(node1);
        SingleLinkedListNode lastNode2 = getLastNode(node2);
        if (lastNode1.hashCode() != lastNode2.hashCode()) return null;

        int n1Length = node1.length();
        int n2Length = node2.length();

        if (n1Length > n2Length) {
            for (int i = 0; i < n1Length - n2Length; i++) {
                node1 = node1.next;
            }
        } else {
            for (int i = 0; i < n2Length -  n1Length; i++) {
                node2 = node2.next;
            }
        }

        while (node1.next != null && node2.next != null) {
            if (node1.hashCode() == node2.hashCode()) return node1;
            node1 = node1.next;
            node2 = node2.next;
        }
        return  null;
    }

    public static SingleLinkedListNode loopDetectionHashMap(SingleLinkedListNode head) {
        HashSet<Integer> map = new HashSet<>();

        while (head.next != null) {
            if (map.contains(head.hashCode())) break;
            map.add(head.hashCode());
            head = head.next;
        }
        return head.next != null ? head : null;
    }

    public static SingleLinkedListNode loopDetection(SingleLinkedListNode head) {
        SingleLinkedListNode fast = head.next.next;
        SingleLinkedListNode slow = head.next;

        while (fast.next!= null && fast.next.next != null) {
            if (fast.hashCode() == slow.hashCode()) {
                return slow;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return null;
    }

    public void appendNodeToTail(SingleLinkedListNode node) {
        SingleLinkedListNode n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = node;
    }
}
