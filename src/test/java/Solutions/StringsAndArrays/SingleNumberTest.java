package Solutions.StringsAndArrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleNumberTest {
    SingleNumber singleNumber = new SingleNumber();

    @Test
    void test1() {
        int[] nums = new int[]{4,1,2,1,2};

        assertEquals(4, singleNumber.singleNumber(nums));
    }

    @Test
    void test2() {
        int[] nums = new int[]{2, 2, 1};

        assertEquals(1, singleNumber.singleNumber(nums));
    }
}