package TreesAndGraphs;

import java.util.ArrayList;
import java.util.Collections;

public class BuildOrder<T> {

    ArrayList<GraphNode<String>> getOrder(GraphNode<String>[] projects, GraphNode<String>[][] dependencies) {
        ArrayList<GraphNode<String>> result = new ArrayList<>();

        Graph<String> graph = generateGraph(projects, dependencies);

        ArrayList<GraphNode<String>> graphNodes = graph.getNodes();


        while (!graphNodes.isEmpty()) {
            for (int i = 0; i < graphNodes.size(); i++) {
                GraphNode node = graphNodes.get(i);
                if (node.getAdjacentNodes().isEmpty()) {
                    result.add(graphNodes.remove(i));
                } else {
                    ArrayList<GraphNode<GraphNode>> adjacents = node.getAdjacentNodes();
                    boolean adjacentsInResults = areAdjacentsInResults(adjacents, result);
                    if (adjacentsInResults) result.add(graphNodes.remove(i));
                }
            }
        }

        Collections.reverse(result);
        return result;
    }

    private Graph<String> generateGraph(GraphNode<String>[] projects, GraphNode<String>[][] dependencies) {
        // create dependency list
        for (GraphNode<String>[] dependency : dependencies) {
            dependency[0].insertAdjacent(dependency[1]);
        }

        Graph<String> graph = new Graph<>();

        for (GraphNode<String> project : projects) {
            graph.insertNode(project);
        }
        return graph;
    }

    private boolean areAdjacentsInResults(ArrayList<GraphNode<GraphNode>> adjacents, ArrayList<GraphNode<String>> result) {
        for (GraphNode<GraphNode> adjacent : adjacents) {
            if (!result.contains(adjacent)) return false;
        }
        return true;
    }

}
