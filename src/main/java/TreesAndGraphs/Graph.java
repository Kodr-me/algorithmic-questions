package TreesAndGraphs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    private ArrayList<GraphNode> nodes = new ArrayList<>();

    public void insertNode(GraphNode node) {
        nodes.add(node);
    }

    public ArrayList<GraphNode> getNodes() {
        return nodes;
    }

    void printAdjacentNodes() {
        for (GraphNode node : nodes) {
            StringBuilder s = new StringBuilder();
            for (GraphNode adjacentNode : node.getAdjacentNodes()) {
                s.append(adjacentNode.data);
                s.append(", ");
            }
            System.out.println(node.data + ": " + s.toString());
        }
    }

    // Given a directed graph, design an algorithm to find out whether there is a route between two nodes.
    public static boolean routeBetweenTwoNodesDFS(GraphNode node1, GraphNode node2) {
        HashSet<Integer> nodesVisited = new HashSet<>();
        depthFirstSearch(node1, nodesVisited);

        return nodesVisited.contains(node2.data);
    }

    private static void  depthFirstSearch(GraphNode n, HashSet<Integer> hashSet) {
        hashSet.add(n.data);
        for (GraphNode adjacentNode : n.getAdjacentNodes()) {
            if (!hashSet.contains(adjacentNode.data)) depthFirstSearch(adjacentNode, hashSet);
        }
    }

    // implement breadth first search

    public static boolean routeBetweenTwoNodesBFS(GraphNode n1, GraphNode n2) {
        HashSet<Integer> nodesVisited = new HashSet<>();
        breadthFirstSearch(n1, nodesVisited);

        return nodesVisited.contains(n2.data);
    }

    private static void breadthFirstSearch(GraphNode n1, HashSet<Integer> nodesVisited) {
        Queue<GraphNode> queue = new LinkedList<>();
        nodesVisited.add(n1.data);
        queue.add(n1);
        while (!queue.isEmpty()) {
            GraphNode c = queue.remove();
            nodesVisited.add(c.data);
            for (GraphNode adjacentNode : c.getAdjacentNodes()) {
                if (!nodesVisited.contains(adjacentNode.data)) {
                    nodesVisited.add(adjacentNode.data);
                    queue.add(c);
                }
            }
        }
    }
}
