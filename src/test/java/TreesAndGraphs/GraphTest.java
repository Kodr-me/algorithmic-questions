package TreesAndGraphs;

import org.junit.jupiter.api.Test;

import static TreesAndGraphs.GraphsUtils.generateGraph;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GraphTest {

    @Test
    void TestingInsert() {
        Graph<Integer> graph = generateGraph();
        graph.printAdjacentNodes();
        assertEquals(0, graph.getNodes().get(0).data);
        assertEquals(1, graph.getNodes().get(0).getAdjacentNodes().get(0).data);
        assertEquals(1, graph.getNodes().get(1).data);
    }
}
