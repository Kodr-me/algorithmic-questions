package Solutions.Trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructBinaryTreeFromPreorderAndInorderTraversalTest {
    ConstructBinaryTreeFromPreorderAndInorderTraversal c = new ConstructBinaryTreeFromPreorderAndInorderTraversal();
    @Test
    void buildTree() {
        int[] preOrder = new int[]{3,9,20,15,7};
        int[] inorder = new int[]{9,3,15,20,7};

        TreeNode result = c.buildTree(inorder, preOrder);
        System.out.println("printing in order traversal");
        result.printInOrderTraversal();

        System.out.println("printing in pre traversal");
        result.printpreOrdertraversal();
    }
}