package TreesAndGraphs;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuildOrderTest {

    BuildOrder buildOrder = new BuildOrder();

    @Test
    void test1() {
        GraphNode<String> a = new GraphNode<>("A");
        GraphNode<String> b = new GraphNode<>("B");
        GraphNode<String> c = new GraphNode<>("C");
        GraphNode<String> d = new GraphNode<>("D");
        GraphNode<String> e = new GraphNode<>("E");
        GraphNode<String> f = new GraphNode<>("F");
        GraphNode<String>[] projects = new GraphNode[]{a, b, c, d, e, f};

        GraphNode<String>[][] dependencies = new GraphNode[5][];

        dependencies[0] = new GraphNode[]{a, d};
        dependencies[1] = new GraphNode[]{f, b};
        dependencies[2] = new GraphNode[]{b, d};
        dependencies[3] = new GraphNode[]{f, a};
        dependencies[4] = new GraphNode[]{d, c};

        ArrayList<GraphNode<String>> ordered = buildOrder.getOrder(projects, dependencies);

        System.out.println("printing result");
        for (GraphNode<String> stringGraphNode : ordered) {
            System.out.println(stringGraphNode.data);
        }

        assertEquals(f, ordered.get(0));
        assertEquals(c, ordered.get(ordered.size() - 1));
        // Output: f, b, a, b, e, c


    }

}
