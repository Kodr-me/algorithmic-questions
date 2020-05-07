package Solutions.TwoPointers;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SquaresOfSortedArrayTest {

    @Test
    void test1() {
        int[] input = new int[]{-4, - 1, 0, 3, 10};
        int[] result = new int[]{0,1,9,16,100};
        int[] output = SquaresOfSortedArray.sortedSquares(input);

        assertArrayEquals(result, output);
    }

    @Test
    void test2() {
        int[] input = new int[]{-7,-3,2,3,11};
        int[] result = new int[]{4,9,9,49,121};
        int[] output = SquaresOfSortedArray.sortedSquares(input);

        assertArrayEquals(result, output);
    }
}