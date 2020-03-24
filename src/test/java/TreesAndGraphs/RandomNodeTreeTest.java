package TreesAndGraphs;

import org.junit.jupiter.api.Test;

public class RandomNodeTreeTest {

    @Test
    void test1() {
        RandomNodeTree randomNodeTree = new RandomNodeTree(5);
        randomNodeTree.insertInOrder(3);
        randomNodeTree.insertInOrder(2);
        randomNodeTree.insertInOrder(1);
        randomNodeTree.insertInOrder(4);
        randomNodeTree.insertInOrder(8);
        randomNodeTree.insertInOrder(10);

        System.out.println(randomNodeTree.getRandomNode());
    }
}
