package TreesAndGraphs;

import org.junit.jupiter.api.Test;

import static TreesAndGraphs.BinaryTreeNode.inOrderTraversal;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimalTreeTest {

    @Test
    void test1() {
        int [] ints = new int[]{1,2,3,4,5,6,7,8,9};

        MinimalTree mt = new MinimalTree();
        BinaryTreeNode n = mt.createMinimalBST(ints);
        inOrderTraversal(n);
        assertEquals(1, n.left.left.data);
        assertEquals(9, n.right.right.right.data);
    }
}
