package Solutions.Queues;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class WallsAndGatesTest {
    WallsAndGates wallsAndGates = new WallsAndGates();
    int INF = Integer.MAX_VALUE;

    @Test
    void test1() {
        int[][] rooms = new int[][]{
                {INF, -1, 0, INF},
                {INF, INF, INF, -1},
                {INF, -1, INF, -1},
                {0, -1, INF, INF},
        };

        int[][] result = new int[][]{
                {3, -1, 0, 1},
                {2, 2, 1, -1},
                {1, -1, 2, -1},
                {0, -1, 3, 4},
        };

        wallsAndGates.solution(rooms);

        for (int[] x : rooms) {
            for (int y : x)
            {
                System.out.print(y + ", ");
            }
            System.out.println();
        }

        assertTrue(Arrays.deepEquals(rooms, result));
    }
}