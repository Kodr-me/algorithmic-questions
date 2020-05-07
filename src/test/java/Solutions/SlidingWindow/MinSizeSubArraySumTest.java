package Solutions.SlidingWindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinSizeSubArraySumTest {

    MinSizeSubArraySum minSizeSubArraySum = new MinSizeSubArraySum();

    @Test
    void test1() {
        int[] nums = new int[]{2, 1, 5, 2, 3, 2};
        int s = 7;

        assertEquals(2, MinSizeSubArraySum.findMinSubArray(s, nums));
    }

    @Test
    void test2() {
        int[] nums = new int[]{2, 1, 5, 2, 8};
        int s = 7;

        assertEquals(1, MinSizeSubArraySum.findMinSubArray(s, nums));
    }

    @Test
    void test3() {
        int[] nums = new int[]{3, 4, 1, 1, 6};
        int s = 8;

        assertEquals(3, MinSizeSubArraySum.findMinSubArray(s, nums));
    }
}