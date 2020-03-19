package TreesAndGraphs;

import java.util.ArrayList;

public class GraphNode<T> {
    T data;
    private ArrayList<GraphNode<T>> adjacentNodes = new ArrayList<>();

    public GraphNode(T t) {
        this.data = t;
    }

    public T getData() {
        return this.data;
    }

    public ArrayList<GraphNode<T>> getAdjacentNodes() {
        return adjacentNodes;
    }

    public void insertAdjacent(GraphNode<T> adjacentNode) {
        this.adjacentNodes.add(adjacentNode);
    }
}
