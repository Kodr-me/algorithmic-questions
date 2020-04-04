package Solutions.Queues;

import Solutions.TreesAndGraphs.Graph;
import Solutions.TreesAndGraphs.GraphNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BFSTemplateTest {
    BFSTemplate bfsTemplate = new BFSTemplate();

    @Test
    void test1() {
        GraphNode<Integer> head = new GraphNode(1);
        GraphNode<Integer> n2 = new GraphNode(2);
        GraphNode<Integer> n3 = new GraphNode(3);
        GraphNode<Integer> n4 = new GraphNode(4);
        GraphNode<Integer> n5 = new GraphNode(5);
        GraphNode<Integer> n6 = new GraphNode(6);
        GraphNode<Integer> n7 = new GraphNode(7);

        head.insertAdjacent(n2);
        head.insertAdjacent(n3);
        head.insertAdjacent(n4);

        n2.insertAdjacent(n5);

        n3.insertAdjacent(n5);
        n3.insertAdjacent(n6);

        n4.insertAdjacent(n7);

        n6.insertAdjacent(n7);

        Graph<Integer> graph = new Graph<>();

        graph.insertNode(head);
        graph.insertNode(n2);
        graph.insertNode(n3);
        graph.insertNode(n4);
        graph.insertNode(n5);
        graph.insertNode(n6);
        graph.insertNode(n7);

        assertEquals(5, bfsTemplate.breadthFirstSearch(graph, n7));
    }
}