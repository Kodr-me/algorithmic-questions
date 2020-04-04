package Solutions.Queues;

import Solutions.StacksAndQueues.Queue;

import java.util.Arrays;

public class WallsAndGates {
    public void solution(int[][] rooms) {
        // we need to find the gates
        int INF = Integer.MAX_VALUE;
        Queue<int[]> queue = new Queue<>();

        // make the nearest from the found
        for (int row = 0; row < rooms.length; row++) {
            for (int column = 0; column < rooms.length; column++) {

                int current = rooms[row][column];
                if (current == 0) {
                    // first element is the column and second is the row
                    int[] coordinates = new int[]{row, column};
                    queue.add(coordinates);
                }
            }
        }

        System.out.println(Arrays.toString(queue.peek()));

        while (!queue.isEmpty()) {
            // need to populate all the INF with the distance from that point in the queue
            int[] gate = queue.remove();

            for (int row = 0; row < rooms.length; row++) {
                for (int column = 0; column < rooms.length; column++) {

                    int current = rooms[row][column];

                    if (row == gate[0] && current == INF) { // they are in the same row
                        System.out.println("same row, value is: " + current);
                        if (column > gate[1]) {
                            rooms[row][column] = column - gate[1];
                        } else {
                            rooms[row][column] = gate[1] - column;
                        }
                    }
                }
            }
        }
    }
}
