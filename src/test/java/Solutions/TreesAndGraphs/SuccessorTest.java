package Solutions.TreesAndGraphs;

import org.junit.jupiter.api.Test;

import static Solutions.TreesAndGraphs.BSTUtils.generateTree;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SuccessorTest {

    Successor successor = new Successor();

    @Test
    void test1() {
        BinaryTreeNode head = generateTree();
        BinaryTreeNode n2 = head.left.left;
//        head.printInOrderTraversal();
//        System.out.println(n2.data + " parent: " + n2.parent.data);
        assertEquals(6, successor.getInOrderSuccessor(n2).data);
    }
}
