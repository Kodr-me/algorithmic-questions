package Solutions.Queues;

import Solutions.StacksAndQueues.Queue;
import Solutions.TreesAndGraphs.Graph;
import Solutions.TreesAndGraphs.GraphNode;

import java.util.ArrayList;
import java.util.HashSet;

public class BFSTemplate {

    public int breadthFirstSearch(Graph<Integer> graph, GraphNode<Integer> target) {
        Queue<GraphNode<Integer>> queue =  new Queue<>();
        HashSet<Integer> set = new HashSet<>();
        int stepsAway = -1;

        ArrayList<GraphNode<Integer>> graphNodes = graph.getNodes();
        queue.add(graphNodes.get(0));
        set.add(graphNodes.get(0).getData());

        while (!queue.isEmpty()) {

            // check if current is target
            // else pop the head and add the adjacent to the q
            GraphNode<Integer> current = queue.remove();
            System.out.println(current.getData());
            System.out.println("-");

            if (current == target) return stepsAway;
            stepsAway++;
            System.out.println("stepsAway " + stepsAway);

            for (GraphNode<Integer> adjacentNode : current.getAdjacentNodes()) {

                if (!set.contains(adjacentNode.getData())) {
                    System.out.print("adding node: " + adjacentNode.getData() + ", ");
                    queue.add(adjacentNode);
                    set.add(adjacentNode.getData());
                }
            }
            System.out.println("--");
        }


        return -1;
    }
}
