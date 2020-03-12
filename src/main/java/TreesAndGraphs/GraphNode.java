package TreesAndGraphs;

import java.util.ArrayList;

public class GraphNode {
    int data;
    private ArrayList<GraphNode> adjacentNodes = new ArrayList<>();

    public GraphNode(int d) {
        this.data = d;
    }

    public ArrayList<GraphNode> getAdjacentNodes() {
        return adjacentNodes;
    }

    public void insertAdjacent(GraphNode adjacentNode) {
        this.adjacentNodes.add(adjacentNode);
    }
}
