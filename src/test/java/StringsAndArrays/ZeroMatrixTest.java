package StringsAndArrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ZeroMatrixTest {

    ZeroMatrix zeroMatrix = new ZeroMatrix();

    @Test
    void validTest1() {
        int[][] exampleMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 0},
        };

        int[][] exampleResponse = {
                {1, 2, 0},
                {4, 5, 0},
                {0, 0, 0},
        };


        assert (Arrays.deepEquals(exampleMatrix, exampleResponse));
    }

    @Test
    void validTest2() {
        int[][] exampleMatrix = {
                {0, 2, 3},
                {4, 5, 6},
                {7, 8, 0},
        };

        int[][] exampleResponse = {
                {0, 0, 0},
                {0, 5, 0},
                {0, 0, 0},
        };

        zeroMatrix.solution(exampleMatrix);

        assert (Arrays.deepEquals(exampleMatrix, exampleResponse));
    }

    @Test
    void validTest3() {
        int[][] exampleMatrix = {
                {1, 2, 0, 10},
                {4, 5, 6},
                {7, 8, 0, 9},
        };

        int[][] exampleResponse = {
                {0, 0, 0, 0},
                {4, 5, 0},
                {0, 0, 0, 0},
        };

        zeroMatrix.solution(exampleMatrix);

        assert (Arrays.deepEquals(exampleMatrix, exampleResponse));
    }

    @Test
    void validTest4() {
        int[][] exampleMatrix = {
                {1, 2, 3},
                {0, 5, 6},
                {7, 8, 0},
                {1, 0, 1},
        };

        int[][] exampleResponse = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0},
        };
        zeroMatrix.solution(exampleMatrix);

        assert (Arrays.deepEquals(exampleMatrix, exampleResponse));
    }

}
