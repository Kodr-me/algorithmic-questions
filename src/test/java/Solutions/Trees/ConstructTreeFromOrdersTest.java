package Solutions.Trees;

import org.junit.jupiter.api.Test;

class ConstructTreeFromOrdersTest {

    ConstructBinaryTreeFromInorderAndPostorderTraversal constructBinaryTreeFromInorderAndPostorderTraversal = new ConstructBinaryTreeFromInorderAndPostorderTraversal();

    @Test
    void buildTree() {
        int[] inorder = new int[]{9,3,15,20,7};
        int[] postOrder = new int[]{9,15,7,20,3};

        TreeNode result = constructBinaryTreeFromInorderAndPostorderTraversal.solution(inorder, postOrder);
        System.out.println("printing in order traversal");
        result.printInOrderTraversal();
    }
}