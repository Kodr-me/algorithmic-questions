package TreesAndGraphs;

import com.sun.org.apache.xpath.internal.operations.String;

import java.util.ArrayList;
import java.util.List;

public class CheckSubtree {

    BinaryTreeNode t2Head;

    boolean solution(BinaryTreeNode t1, BinaryTreeNode t2) {

        BinaryTreeNode head = t1;
        getNode(head, t2);
        if (t2Head == null) return false;

        List<BinaryTreeNode> t2Values = new ArrayList();
        List<BinaryTreeNode> t2FoundValues = new ArrayList();

        addNodesToList(t2, t2Values);
        addNodesToList(t2Head, t2FoundValues);

        System.out.println(t2Values);
        for (int i = 0; i < t2Values.size(); i++) {
            if (t2Values.get(i) != t2FoundValues.get(i)) return false;
        }
        return true;
    }

    private void addNodesToList(BinaryTreeNode t2, List t2Values) {
        if (t2 != null) {
            t2Values.add(t2);
            addNodesToList(t2.left, t2Values);
            addNodesToList(t2.right, t2Values);
        }
    }

    private void getNode(BinaryTreeNode head, BinaryTreeNode t2) {
        if (head == t2) {
            t2Head = head;
        }
        if (head.left != null) getNode(head.left, t2);
        if (head.right != null) getNode(head.right, t2);
    }

    boolean containsTree(BinaryTreeNode t1, BinaryTreeNode t2) {
        StringBuilder s1Builder = new StringBuilder();
        StringBuilder s2Builder = new StringBuilder();

        getOrderString(t1, s1Builder);
        getOrderString(t2, s2Builder);

        // if s2 doesnt exist inside of s1
        return s1Builder.indexOf(s2Builder.toString()) != -1;
    }

    private void getOrderString(BinaryTreeNode node, StringBuilder sb) {
        if (node == null) {
            sb.append("X");
            return;
        }
        sb.append(node.data + " ");
        getOrderString(node.left, sb);
        getOrderString(node.right, sb);
    }

    boolean containsSubTree(BinaryTreeNode t1, BinaryTreeNode t2) {
        if (t2 == null) return true;
        return subTree(t1, t2);
    }

    private boolean subTree(BinaryTreeNode t1, BinaryTreeNode t2) {
        if (t1 == null) return false; // traversed the whole first tree and subtree not found
        else if (t1.data == t2.data && matchTree(t1, t2)) return true;
        return subTree(t1.left, t2) || subTree(t1.right, t2);
    }

    private boolean matchTree(BinaryTreeNode t1, BinaryTreeNode t2) {
        if (t1 == null && t2 == null) return true; // nothing left to compare
        else if (t1 == null || t2 == null) return false; // one of the trees is empty before the other- they dont match
        else if (t1.data != t2.data) return false; // they dont match
        else return matchTree(t1.left, t2.left) && matchTree(t1.right, t2.right);
    }
}
