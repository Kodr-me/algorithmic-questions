package TreesAndGraphs;

import org.junit.jupiter.api.Test;

import static TreesAndGraphs.GraphsUtils.generateGraph;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RouteBetweenTwoNodesTest {

    @Test
    void test1() {
        Graph<Integer> graph1 = generateGraph();

        assertFalse(graph1.routeBetweenTwoNodesDFS(new GraphNode(100)));
        assertFalse(graph1.routeBetweenTwoNodesBFS(new GraphNode(100)));
    }

    @Test
    void test2() {
        Graph<Integer> graph1 = generateGraph();
        GraphNode<Integer> lastNode = graph1.getNodes().get(graph1.getNodes().size() - 1);

        assertTrue(graph1.routeBetweenTwoNodesDFS(lastNode));
        assertTrue(graph1.routeBetweenTwoNodesBFS(lastNode));
    }
}
