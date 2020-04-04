package Solutions.TreesAndGraphs;

import java.util.ArrayList;

public class BSTSequences {
    public void solution(BinaryTreeNode head) {
        // have to print pre order traversal
        ArrayList<BinaryTreeNode> inOrderList = inOrderTraversal(head, new ArrayList<BinaryTreeNode>());
        ArrayList<BinaryTreeNode> postOrderList = postOrderTraversal(head, new ArrayList<BinaryTreeNode>());

        for (BinaryTreeNode binaryTreeNode : inOrderList) {
            System.out.print(binaryTreeNode.data + ", ");
        }
        System.out.println("----");
        for (BinaryTreeNode binaryTreeNode : postOrderList) {
            System.out.print(binaryTreeNode.data + ", ");
        }
    }

    private ArrayList<BinaryTreeNode> postOrderTraversal(BinaryTreeNode head, ArrayList<BinaryTreeNode> binaryTreeNodes) {
        if (head != null) {
            binaryTreeNodes.add(head);
            postOrderTraversal(head.right, binaryTreeNodes);
            postOrderTraversal(head.left, binaryTreeNodes);
        }
        return binaryTreeNodes;
    }

    private ArrayList<BinaryTreeNode> inOrderTraversal(BinaryTreeNode head, ArrayList<BinaryTreeNode> binaryTreeNodes) {
//        System.out.println("traversin head " + head.data);
        if (head != null) {
            binaryTreeNodes.add(head);
            inOrderTraversal(head.left, binaryTreeNodes);
            inOrderTraversal(head.right, binaryTreeNodes);
        }
        return binaryTreeNodes;
    }

}
