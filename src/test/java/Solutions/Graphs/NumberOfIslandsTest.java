package Solutions.Graphs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfIslandsTest {

    NumberOfIslands numberOfIslands = new NumberOfIslands();

    @Test
    void Test1() {
        char[][] matrix = new char[][]{
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'},
        };

        assertEquals(3, numberOfIslands.numIslands(matrix));
    }

}