package Solutions.StringsAndArrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusOneTest {

    PlusOne plusOne = new PlusOne();

    @Test
    void test1() {
        int[] x = new int[]{3,2,1};
        int[] result = new int[]{3,2,2};

        assertArrayEquals(result, plusOne.plusOne(x));
    }

    @Test
    void test2() {
        int[] x = new int[]{3};
        int[] result = new int[]{4};

        assertArrayEquals(result, plusOne.plusOne(x));
    }

    @Test
    void test3() {
        int[] x = new int[]{9};
        int[] result = new int[]{1,0};

        assertArrayEquals(result, plusOne.plusOne(x));
    }

    @Test
    void test4() {
        int[] x = new int[]{9,9};
        int[] result = new int[]{1,0,0};

        assertArrayEquals(result, plusOne.plusOne(x));
    }

    @Test
    void test5() {
        int[] x = new int[]{9,9,9,9};
        int[] result = new int[]{1,0,0,0,0};

        assertArrayEquals(result, plusOne.plusOne(x));
    }

    @Test
    void test6() {
        int[] x = new int[]{0};
        int[] result = new int[]{1};

        assertArrayEquals(result, plusOne.plusOne(x));
    }

    @Test
    void test7() {
        int[] x = new int[]{1,3,9};
        int[] result = new int[]{1,4,0};

        assertArrayEquals(result, plusOne.plusOne(x));
    }

    @Test
    void test8() {
        int[] x = new int[]{9,3,9};
        int[] result = new int[]{9,4,0};

        assertArrayEquals(result, plusOne.plusOne(x));
    }
}