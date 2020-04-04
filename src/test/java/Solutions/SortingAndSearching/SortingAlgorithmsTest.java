package Solutions.SortingAndSearching;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SortingAlgorithmsTest {

    SortingAlgorithms sortingAlgorithms = new SortingAlgorithms();

    @Test
    void mergeSort() {
        int[] array = new int[]{10,9,8,7,6,5,4,3,2,1};
        int[] result = new int[]{1,2,3,4,5,6,7,8,9,10};

        sortingAlgorithms.mergeSort(array);
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            assertEquals(result[i], array[i]);
        }
    }

    @Test
    void quickSort() {
        int[] array = new int[]{10, 80, 30, 90, 40, 50, 70};
        int[] result = new int[]{10, 30, 40, 50, 70, 80, 90};

        sortingAlgorithms.quickSort(array, 0, array.length -1);
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            assertEquals(result[i], array[i]);
        }
    }
}