package Solutions.TwoPointers;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumTest {

    @Test
    void test1() {
        int[] input = new int[]{-3, 0, 1, 2, -1, 1, -2};
        ThreeSum.threeSum(input);

    }

    @Test
    void test2() {
        int[] input = new int[]{-2,0,0,2,2};
        ThreeSum.threeSum(input);
//        List<List<Integer>> result = Arrays.asList(
//                Arrays.asList(-2, 0, 2)
//        );

    }

    @Test
    void test4() {
        int[] input = new int[]{0, 0, 0};
        List<List<Integer>> output = ThreeSum.threeSum(input);
        List<List<Integer>> result = Arrays.asList(
                Arrays.asList(0,0,0)
        );

        for (int i = 0; i < result.size(); i++) {
            List<Integer> list1 = result.get(i);
            List<Integer> list2 = output.get(i);

            for (int j = 0; j < list1.size(); j++) {
                assertEquals(list1.get(i), list2.get(i));
            }
        }
    }

}