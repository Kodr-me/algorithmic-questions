package Solutions.TwoPointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuadrupleSumTest {


    @Test
    void test1() {
        int[] nums = new int[]{4, 1, 2, -1, 1, -3};
        int target = 1;

        // Output: [-3, -1, 1, 4], [-3, 1, 1, 2]
        System.out.println(CuadrupleSum.searchQuadruplets(nums, target));
    }

    @Test
    void test2() {
        int[] nums = new int[]{2, 0, -1, 1, -2, 2};
        int target = 2;

        // [-2, 0, 2, 2], [-1, 0, 1, 2]
        System.out.println(CuadrupleSum.searchQuadruplets(nums, target));
    }

    @Test
    void test3() {
        int[] nums = new int[]{1, 0, -1, 0, -2, 2};
        int target = 0;

        /*
        A solution set is:
        [
          [-1,  0, 0, 1],
          [-2, -1, 1, 2],
          [-2,  0, 0, 2]
        ]
         */
        System.out.println(CuadrupleSum.searchQuadruplets(nums, target));
    }
}