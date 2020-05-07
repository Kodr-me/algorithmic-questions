package Solutions.TwoPointers;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PairTargetSumTest {

    @Test
    void test1() {
        int[] array = new int[]{1,2,3,4,6};
        int target = 6;
        int[] result = new int[]{1,3};

        assertTrue(Arrays.deepEquals(new Object[]{result}, new Object[]{PairTargetSum.search(array, target)}));
    }

    @Test
    void test2() {
        int[] array = new int[]{2, 5, 9, 11};
        int target = 11;
        int[] result = new int[]{0,2};

        assertTrue(Arrays.deepEquals(new Object[]{result}, new Object[]{PairTargetSum.search(array, target)}));
    }
}