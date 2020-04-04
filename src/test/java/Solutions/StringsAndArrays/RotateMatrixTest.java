package Solutions.StringsAndArrays;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class RotateMatrixTest {

    private RotateMatrix rotateMatrix  = new RotateMatrix();

    int[][] exampleMatrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
    };

    int[][] exampleResponse = {
            {7,4,1},
            {8,2,6},
            {9,6,3}
    };

    @Test
    void validTest() {
        int[][] solution = rotateMatrix.solution(exampleMatrix);

        assert (Arrays.deepEquals(solution, exampleResponse));
    }
}
