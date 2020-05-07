package Solutions.Graphs;

import java.util.ArrayList;

public class GraphNode<T> {

    T value;
    ArrayList<GraphNode<T>> adjacent;

    public GraphNode(T value) {
        this.value = value;
        adjacent = new ArrayList<>();
    }

    public void printAdjacents() {
        System.out.println("printing adjacents of: " + value);
        for (GraphNode<T> tGraphNode : adjacent) {
            System.out.print(tGraphNode.value + ", ");
        }
    }
}
