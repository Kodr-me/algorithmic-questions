package Solutions.StringsAndArrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxSubArrayTest {

    MaxSubArray maxSubArray = new MaxSubArray();

    @Test
    void test1() {
        int[] testArray = new int[]{-2,1,-3,4,-1,2,1,-5,4};

        assertEquals(6, maxSubArray.maxSubArray(testArray));
    }

    @Test
    void test2() {
        int[] testArray = new int[]{-2,1};

        assertEquals(1, maxSubArray.maxSubArray(testArray));
    }

    @Test
    void test3() {
        int[] testArray = new int[]{1};

        assertEquals(1, maxSubArray.maxSubArray(testArray));
    }

    @Test
    void test4() {
        int[] testArray = new int[]{1, -2};

        assertEquals(1, maxSubArray.maxSubArray(testArray));
    }

    @Test
    void test5() {
        int[] testArray = new int[]{};

        assertEquals(0, maxSubArray.maxSubArray(testArray));
    }

    @Test
    void test6() {
        int[] testArray = new int[]{-1};

        assertEquals(-1, maxSubArray.maxSubArray(testArray));
    }

    @Test
    void test7() {
        int[] testArray = new int[]{-8, -3, -7};

        assertEquals(-3, maxSubArray.maxSubArray(testArray));
    }

    @Test
    void test8() {
        int[] testArray = new int[]{-8, -3, 4, -7};

        assertEquals(4, maxSubArray.maxSubArray(testArray));
    }

    @Test
    void test9() {
        int[] testArray = new int[]{0};

        assertEquals(0, maxSubArray.maxSubArray(testArray));
    }

    @Test
    void test10() {
        int[] testArray = new int[]{-1, 0};

        assertEquals(0, maxSubArray.maxSubArray(testArray));
    }
}