package TreesAndGraphs;

import org.junit.jupiter.api.Test;

public class RandomNodeTreeTest {

    @Test
    void test1() {
        BinaryTreeNode head = BSTUtils.generateTree();
        RandomNodeTree randomNodeTree = new RandomNodeTree(head);

        randomNodeTree.head.printInOrderTraversal();

        System.out.println(randomNodeTree.getRandomNode().data);
    }
}
