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

//    // try to finish this problem
//    public static void partition(SingleLinkedListNode head, int partition) {
//        SingleLinkedListNode temp = head;
//        SingleLinkedListNode left = null;
//        SingleLinkedListNode lastBeforeLeft = null;
//        SingleLinkedListNode right = null;
//        SingleLinkedListNode lastBeforeRight = null;
//
//        while (temp != null) {
//            if (temp.data >= partition) {
//                System.out.println("Right: value " + temp.data);
//                if (right == null) {
//                    right = temp;
//
////                    right = temp;
//                } else {
//                    getLastNode(right).next = new SingleLinkedListNode(temp.data);
//                }
//            }
//            if (temp.data < partition) {
//                System.out.println("left: value " + temp.data);
//                if (left == null) {
//                    left = new SingleLinkedListNode(temp.data);
//                } else {
//                    getLastNode(left).next = new SingleLinkedListNode(temp.data);
//                }
//            }
//            temp = temp.next;
//        }
//
//        System.out.println("right: " + right.toString());
//        System.out.println("left: " + left.toString());
//    }

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

}
