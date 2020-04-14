package Solutions.StringsAndArrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArrayTest {
    RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();

    @Test
    void removeDuplicates() {
        int[] array = new int[]{0,0,1,1,1,2,2,3,3,4};

        System.out.println(Arrays.toString(array));

        int n = removeDuplicatesFromSortedArray.removeDuplicates(array);

        System.out.println(Arrays.toString(array));

        assertEquals(5, n);
    }

    @Test
    void removeDuplicates2() {
        int[] array = new int[]{1,1,2};

        int n = removeDuplicatesFromSortedArray.removeDuplicates(array);

        System.out.println(Arrays.toString(array));

        assertEquals(2, n);
    }

    @Test
    void removeDuplicates3() {
        int[] array = new int[]{};

        int n = removeDuplicatesFromSortedArray.removeDuplicates(array);

//        System.out.println(Arrays.toString(array));

        assertEquals(0, n);
    }

    @Test
    void removeDuplicates4() {
        int[] array = new int[]{1000};

        int n = removeDuplicatesFromSortedArray.removeDuplicates(array);

//        System.out.println(Arrays.toString(array));

        assertEquals(1, n);
    }
}