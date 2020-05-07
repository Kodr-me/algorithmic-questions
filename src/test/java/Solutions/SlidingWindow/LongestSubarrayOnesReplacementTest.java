package Solutions.SlidingWindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubarrayOnesReplacementTest {

    @Test
    void test1() {
        int[] nums = new int[]{0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1};
        int k = 2;

        assertEquals(6, LongestSubarrayOnesReplacement.longestOnes(nums, k));
    }

    @Test
    void test2() {
        int[] nums = new int[]{0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1};
        int k = 3;

        assertEquals(9, LongestSubarrayOnesReplacement.longestOnes(nums, k));
    }

    @Test
    void test3() {
        int[] nums = new int[]{1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;

        assertEquals(6, LongestSubarrayOnesReplacement.longestOnes(nums, k));
    }
}