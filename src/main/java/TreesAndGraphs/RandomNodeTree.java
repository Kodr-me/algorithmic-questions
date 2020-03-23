package TreesAndGraphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNodeTree {
    BinaryTreeNode head;

    public RandomNodeTree(BinaryTreeNode head) {
        this.head = head;
    }

    public void insert(int data) {
        head.insertNode(data);
    }

    public BinaryTreeNode search(int data) {
        return head.find(data);
    }

    public BinaryTreeNode delete(int data) {
        return head.delete(data);
    }

    public BinaryTreeNode getRandomNode() {
        List<BinaryTreeNode> nodes = new ArrayList();

        getRandomNode(head, nodes);
        int randomN = generateRandomNumber(0, nodes.size());
        return nodes.get(randomN);
    }


    private void getRandomNode(BinaryTreeNode n, List<BinaryTreeNode> nodes) {
        if (n == null) return;
        nodes.add(n);
        getRandomNode(n.left, nodes);
        getRandomNode(n.right, nodes);
    }

    private int generateRandomNumber(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) - 1) + min;
    }


}
