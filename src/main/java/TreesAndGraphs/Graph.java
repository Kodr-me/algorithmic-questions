package TreesAndGraphs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Graph<T> {
    private ArrayList<GraphNode<T>> nodes = new ArrayList<>();

    public void insertNode(GraphNode<T> node) {
        nodes.add(node);
    }

    public ArrayList<GraphNode<T>> getNodes() {
        return nodes;
    }

    void printAdjacentNodes() {
        for (GraphNode<T> node : nodes) {
            StringBuilder s = new StringBuilder();
            for (GraphNode adjacentNode : node.getAdjacentNodes()) {
                s.append(adjacentNode.data.toString());
                s.append(", ");
            }
            System.out.println(node.data + ": " + s.toString());
        }
    }

    // Given a directed graph, design an algorithm to find out whether there is a route between two nodes.
    public boolean routeBetweenTwoNodesDFS(GraphNode<T> n2) {
        HashSet<Integer> nodesVisited = new HashSet<>();
        GraphNode<T> n1 = this.getNodes().get(0);
        depthFirstSearch(n1, nodesVisited);

        return nodesVisited.contains(n2.hashCode());
    }

    private void  depthFirstSearch(GraphNode<T> n, HashSet<Integer> hashSet) {
        hashSet.add(n.hashCode());

        for (GraphNode<T> adjacentNode : n.getAdjacentNodes()) {
            if (!hashSet.contains(adjacentNode.hashCode())) depthFirstSearch(adjacentNode, hashSet);
        }
    }

    // implement breadth first search
    public boolean routeBetweenTwoNodesBFS(GraphNode n2) {
        HashSet<Integer> nodesVisited = new HashSet<>();
        GraphNode<T> n1 = this.getNodes().get(0);
        breadthFirstSearch(n1, nodesVisited);

        return nodesVisited.contains(n2.hashCode());
    }

    private void breadthFirstSearch(GraphNode<T> n1, HashSet<Integer> nodesVisited) {
        Queue<GraphNode> queue = new LinkedList<>();
        nodesVisited.add(n1.hashCode());
        queue.add(n1);
        while (!queue.isEmpty()) {
            GraphNode<T> c = queue.remove();
            nodesVisited.add(c.hashCode());

            for (GraphNode<T> adjacentNode : c.getAdjacentNodes()) {
                if (!nodesVisited.contains(adjacentNode.hashCode())) {
                    nodesVisited.add(adjacentNode.hashCode());
                    queue.add(c);
                }
            }
        }
    }
}
