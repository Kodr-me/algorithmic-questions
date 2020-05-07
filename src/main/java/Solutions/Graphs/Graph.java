package Solutions.Graphs;

import java.util.ArrayList;
import java.util.Arrays;

public class Graph<T> {

    GraphNode<T> head = null;

    public void constructFromMatrix(T[][] grid) {

        ArrayList<ArrayList<GraphNode<T>>> matrix = new ArrayList<>();

        System.out.println("printing matrix");
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {

                GraphNode<T> node = new GraphNode<>(grid[i][j]);

                if (matrix.size() == i) {
                    matrix.add(i, new ArrayList<>());

                }

                ArrayList<GraphNode<T>> row =  matrix.get(i);
                row.add(j, node);
                System.out.print(grid[i][j] + " | ");
            }
            System.out.println("");
        }

        head = matrix.get(0).get(0);


//        // set adjacents right
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length - 1; j++) {
                GraphNode<T> node = matrix.get(i).get(j);
//                GraphNode<T> below = matrix[i + 1][j];
                GraphNode<T> right = matrix.get(i).get(j + 1);
                node.adjacent.add(right);
            }
        }

        // set adjacents below
        for (int i = 0; i < grid.length - 1; i++) {
            for (int j = 0; j < grid[i].length ; j++) {
                GraphNode<T> node = matrix.get(i).get(j);
                GraphNode<T> below = matrix.get(i + 1).get(j);
                node.adjacent.add(below);
            }
        }
    }

    void printMatrix(GraphNode<T>[][] matrix) {
        System.out.println("printing matrix");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j].value + " | ");
            }
            System.out.println("");
        }
    }
}
