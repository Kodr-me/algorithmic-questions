package TreesAndGraphs;

import java.util.ArrayList;
import java.util.List;

// Given a binary tree, design an algorithm which creates a linked list of all the nodes at each depth (e.g., if you have a tree with depth D, you'll have D linked lists).
public class ListOfDepths {
     List<List<Integer>> solution(BinaryTreeNode head) {
         int counter = 0;
         List<List<Integer>> listOfLists = new ArrayList<>();
         traverseAndAppend(listOfLists, head, counter);
         return listOfLists;
     }

     private void traverseAndAppend(List<List<Integer>> list, BinaryTreeNode node, int counter) {
         if (node != null) {
             addToList(list, counter, node.data);
             traverseAndAppend(list, node.left, counter + 1);
             traverseAndAppend(list, node.right, counter + 1);
         }
     }

     private void addToList(List<List<Integer>> list, int counter, int value) {
         try {
             list.get(counter).add(value);
         } catch (IndexOutOfBoundsException error) {
             list.add(counter, new ArrayList<>());
             list.get(counter).add(value);
         }
     }
}
