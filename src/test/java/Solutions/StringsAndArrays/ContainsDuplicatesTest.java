package Solutions.StringsAndArrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicatesTest {
    ContainsDuplicates containsDuplicates = new ContainsDuplicates();

    @Test
    void test1() {
        int[] nums = new int[]{1,2,3,1};

        assertTrue(containsDuplicates.containsDuplicate(nums));
    }

    @Test
    void test2() {
        int[] nums = new int[]{1,2,3,4};

        assertFalse(containsDuplicates.containsDuplicate(nums));
    }

    @Test
    void test3() {
        int[] nums = new int[]{};

        assertFalse(containsDuplicates.containsDuplicate(nums));
    }
}