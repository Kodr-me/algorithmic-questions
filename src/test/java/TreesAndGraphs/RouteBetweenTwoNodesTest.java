package TreesAndGraphs;

import org.junit.jupiter.api.Test;

import static TreesAndGraphs.Graph.routeBetweenTwoNodesBFS;
import static TreesAndGraphs.Graph.routeBetweenTwoNodesDFS;
import static TreesAndGraphs.GraphsUtils.generateGraph;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RouteBetweenTwoNodesTest {

    @Test
    void test1() {
        Graph graph1 = generateGraph();

        assertFalse(routeBetweenTwoNodesDFS(graph1.getNodes().get(0), new GraphNode(100)));
        assertFalse(routeBetweenTwoNodesBFS(graph1.getNodes().get(0), new GraphNode(100)));
    }

    @Test
    void test2() {
        Graph graph1 = generateGraph();

        assertTrue(routeBetweenTwoNodesDFS(graph1.getNodes().get(0), graph1.getNodes().get(graph1.getNodes().size() - 1)));
        assertTrue(routeBetweenTwoNodesBFS(graph1.getNodes().get(0), graph1.getNodes().get(graph1.getNodes().size() - 1)));
    }
}
