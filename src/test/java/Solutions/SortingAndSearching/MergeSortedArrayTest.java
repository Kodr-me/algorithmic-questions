package Solutions.SortingAndSearching;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArrayTest {

    @Test
    void badMerge() {
        MergeSortedArray m = new MergeSortedArray();
        int[] nums1 = new int[]{1,3,8,0,0,0};
        int[] nums2 = new int[]{2,4,10};
        int[] output = new int[]{1,2,3,4,8,10};

        Arrays.toString(nums1);
        m.badMerge(nums1, 3, nums2, 3);
        Arrays.toString(nums1);


        for (int i = 0; i < nums1.length; i++) {
            int x = nums1[i];
            int y = output[i];
            assertEquals(x, y);
        }

    }

    @Test
    void merge1() {

        MergeSortedArray m = new MergeSortedArray();
        int[] nums1 = new int[]{1,3,8,0,0,0};
        int[] nums2 = new int[]{2,4,10};
        int[] output = new int[]{1,2,3,4,8,10};

        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        m.merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));


        for (int i = 0; i < nums1.length; i++) {
            int x = nums1[i];
            int y = output[i];
            assertEquals(x, y);
        }
    }

    @Test
    void merge2() {

        MergeSortedArray m = new MergeSortedArray();
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};
        int[] output = new int[]{1,2,2,3,5,6};

        System.out.println(Arrays.toString(nums1));
        m.merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));


        for (int i = 0; i < nums1.length; i++) {
            int x = nums1[i];
            int y = output[i];
            assertEquals(x, y);
        }
    }

    @Test
    void merge4() {

        MergeSortedArray m = new MergeSortedArray();
        int[] nums1 = new int[]{3,4,8,0,0,0};
        int[] nums2 = new int[]{2,5,6};
        int[] output = new int[]{2,3,4,5,6,8};

        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        m.merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));


        for (int i = 0; i < nums1.length; i++) {
            int x = nums1[i];
            int y = output[i];
            assertEquals(x, y);
        }
    }

    @Test
    void merge6() {

        MergeSortedArray m = new MergeSortedArray();
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{4,5,6};
        int[] output = new int[]{1,2,3,4,5,6,};

        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        m.merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));


        for (int i = 0; i < nums1.length; i++) {
            int x = nums1[i];
            int y = output[i];
            assertEquals(x, y);
        }
    }

    @Test
    void merge7() {

        MergeSortedArray m = new MergeSortedArray();
        int[] nums1 = new int[]{4,5,6,0,0,0};
        int[] nums2 = new int[]{1,2,3};
        int[] output = new int[]{1,2,3,4,5,6,};

        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        m.merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));


        for (int i = 0; i < nums1.length; i++) {
            int x = nums1[i];
            int y = output[i];
            assertEquals(x, y);
        }
    }

    @Test
    void merge8() {

        MergeSortedArray m = new MergeSortedArray();
        int[] nums1 = new int[]{0,0,0,0,0};
        int[] nums2 = new int[]{1,2,3,4,5};
        int[] output = new int[]{1,2,3,4,5};

        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        m.merge(nums1, 5, nums2, 0);
        System.out.println(Arrays.toString(nums1));


        for (int i = 0; i < nums1.length; i++) {
            int x = nums1[i];
            int y = output[i];
            assertEquals(x, y);
        }
    }

    @Test
    void merge9() {

        MergeSortedArray m = new MergeSortedArray();
        int[] nums1 = new int[]{1,2,3,4,5};
        int[] nums2 = new int[]{0,0,0,0,0};
        int[] output = new int[]{1,2,3,4,5};

        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        m.merge(nums1, 5, nums2, 0);
        System.out.println(Arrays.toString(nums1));


        for (int i = 0; i < nums1.length; i++) {
            int x = nums1[i];
            int y = output[i];
            assertEquals(x, y);
        }
    }

    @Test
    void merge3() {

        MergeSortedArray m = new MergeSortedArray();
        int[] nums1 = new int[]{0};
        int[] nums2 = new int[]{1};
        int[] output = new int[]{1};

        System.out.println(Arrays.toString(nums1));
        m.merge(nums1, 0, nums2, 1);
        System.out.println(Arrays.toString(nums1));

        for (int i = 0; i < nums1.length; i++) {
            int x = nums1[i];
            int y = output[i];
            assertEquals(x, y);
        }
    }
}