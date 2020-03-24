package TreesAndGraphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNodeTree {
    private int data;
    public RandomNodeTree left;
    public RandomNodeTree right;
    private int size;

    public RandomNodeTree(int data) {
        this.data = data;
        this.size = 1;
    }

    public RandomNodeTree getRandomNode() {
        int leftSize = left == null ? 0 : left.size;
        System.out.println(leftSize);
        Random random = new Random();
        int index = random.nextInt(leftSize);

        if (index < leftSize) return left.getRandomNode();
        else if (index == leftSize) return this;
        else return right.getRandomNode();
    }

    public void insertInOrder(int d) {
        if (d <= data) {
            if (left == null) left = new RandomNodeTree(d);
            else left.insertInOrder(d);
        } else {
            if (right == null) right = new RandomNodeTree(d);
            else right.insertInOrder(d);
        }
        size++;
    }

    public RandomNodeTree find(int d) {
        if (d == data) return this;
        else if (d < data) return left != null ? left.find(d) : null;
        else if (d > data) return right != null ? right.find(d) : null;
        return null;
    }
}
