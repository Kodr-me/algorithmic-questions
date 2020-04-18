package Solutions.StringsAndArrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntersectionOfTwoArraysTest {

    IntersectionOfTwoArrays intersectionOfTwoArrays = new IntersectionOfTwoArrays();

    @Test
    void intersect1() {
        int[] nums1 = new int[]{1,2,2,1};
        int[] nums2 = new int[]{2,2};

        int[] result = new int[]{2};

        assertArrayEquals(result, intersectionOfTwoArrays.intersect(nums1, nums2));
    }

    @Test
    void intersect2() {
        int[] nums1 = new int[]{2,2};
        int[] nums2 = new int[]{2,2};

        int[] result = new int[]{2};

        assertArrayEquals(result, intersectionOfTwoArrays.intersect(nums1, nums2));
    }

    @Test
    void intersect3() {
        int[] nums1 = new int[]{4,9,5};
        int[] nums2 = new int[]{9,4,9,8,4};

        int[] result = new int[]{4, 9};

        assertArrayEquals(result, intersectionOfTwoArrays.intersect(nums1, nums2));
    }

    @Test
    void intersect4() {
        int[] nums1 = new int[]{};
        int[] nums2 = new int[]{9,4,9,8,4};

        int[] result = new int[]{};

        assertArrayEquals(result, intersectionOfTwoArrays.intersect(nums1, nums2));
    }

    @Test
    void intersect5() {
        int[] nums2 = new int[]{};
        int[] nums1 = new int[]{9,4,9,8,4};

        int[] result = new int[]{};

        assertArrayEquals(result, intersectionOfTwoArrays.intersect(nums1, nums2));
    }
}