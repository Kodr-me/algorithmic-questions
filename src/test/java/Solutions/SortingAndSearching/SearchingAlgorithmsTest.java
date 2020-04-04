package Solutions.SortingAndSearching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchingAlgorithmsTest {

    @Test
    void binarySearch() {
        SearchingAlgorithms searchingAlgorithms = new SearchingAlgorithms();
        int arr[] = { 2, 3, 4, 5, 8, 10, 20, 30, 40, 100 };

        assertEquals(3, searchingAlgorithms.binarySearch(arr, 3, 0, arr.length));
        assertEquals(3, searchingAlgorithms.binarySearchIterative(arr, 3));
    }
}