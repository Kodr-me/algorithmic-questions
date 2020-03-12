package TreesAndGraphs;

public class GraphsUtils {
    public static Graph generateGraph() {
        Graph graph = new Graph();

        GraphNode n0 = new GraphNode(0);
        GraphNode n1 = new GraphNode(1);
        GraphNode n2 = new GraphNode(2);
        GraphNode n3 = new GraphNode(3);
        GraphNode n4 = new GraphNode(4);
        GraphNode n5 = new GraphNode(5);
        n0.insertAdjacent(n1);
        n0.insertAdjacent(n4);
        n0.insertAdjacent(n5);

        n1.insertAdjacent(n4);
        n1.insertAdjacent(n3);

        n2.insertAdjacent(n1);

        n3.insertAdjacent(n2);
        n3.insertAdjacent(n4);

        graph.insertNode(n0);
        graph.insertNode(n1);
        graph.insertNode(n2);
        graph.insertNode(n3);
        graph.insertNode(n4);
        graph.insertNode(n5);
        return graph;
    }

    public static Graph generateSecondGraph() {
        Graph graph = new Graph();

        GraphNode n6 = new GraphNode(6);
        GraphNode n7 = new GraphNode(7);
        GraphNode n8 = new GraphNode(8);
        n6.insertAdjacent(n7);

        n7.insertAdjacent(n8);

        n8.insertAdjacent(n6);

        return graph;
    }
}
