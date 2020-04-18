package Solutions.StringsAndArrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RotateArrayTest {
    RotateArray rotateArray = new RotateArray();

    @Test
    void rotate() {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        int[] result = new int[]{5,6,7,1,2,3,4};

        rotateArray.rotate(nums, 3);

        System.out.println(Arrays.toString(nums));

        assertArrayEquals(nums, result);

    }

    @Test
    void rotate5() {
        int[] nums = new int[]{1,2,3,4};
        int[] result = new int[]{1,2,3,4};

        rotateArray.rotate(nums, 4);

        assertArrayEquals(nums, result);

    }

    @Test
    void rotate6() {
        int[] nums = new int[]{1,2,3,4};
        int[] result = new int[]{3,4,1,2};

        rotateArray.rotate(nums, 6);

        System.out.println(Arrays.toString(nums));

        assertArrayEquals(nums, result);

    }

    @Test
    void rotate7() {
        int[] nums = new int[]{1,2,3,4,5};
        int[] result = new int[]{5,1,2,3,4};

        rotateArray.rotate(nums, 6);

        System.out.println(Arrays.toString(nums));

        assertArrayEquals(nums, result);

    }

    @Test
    void rotate8() {
        int[] nums = new int[]{1,2,3,4,5};
        int[] result = new int[]{4,5,1,2,3};

        rotateArray.rotate(nums, 7);

        System.out.println(Arrays.toString(nums));

        assertArrayEquals(nums, result);

    }

    @Test
    void rotate1() {
        int[] nums = new int[]{1,2};
        int[] result = new int[]{2,1};

        rotateArray.rotate(nums, 1);

        System.out.println(Arrays.toString(nums));

        assertArrayEquals(nums, result);

    }

    @Test
    void rotate2() {
        int[] nums = new int[]{};

        rotateArray.rotate(nums, 0);

        System.out.println(Arrays.toString(nums));

        assertArrayEquals(nums, nums);

    }

    @Test
    void rotate3() {
        int[] nums = new int[]{};

        rotateArray.rotate(nums, 0);

        System.out.println(Arrays.toString(nums));

        assertArrayEquals(nums, nums);

    }

    @Test
    void rotate4() {
        int[] nums = new int[]{};

        rotateArray.rotate(nums, 0);

        System.out.println(Arrays.toString(nums));

        assertArrayEquals(nums, nums);

    }
}