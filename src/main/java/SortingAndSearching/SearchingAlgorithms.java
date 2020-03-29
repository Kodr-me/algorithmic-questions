package SortingAndSearching;

import java.util.Arrays;

public class SearchingAlgorithms {

    int binarySearch(int[] array, int n, int low, int high) {
        if (low > high) return -1;

        int middle = (low + high) / 2;
        int pivot = array[middle];

        if (pivot < n) return binarySearch(array, n, middle + 1, high); // need to go right
        else if (pivot > n) return binarySearch(array, n, low, middle - 1); // need to go left
        else return pivot;
    }

    int binarySearchIterative(int[] array, int n) {
        int low = 0;
        int high = array.length - 1;
        int mid, pivot;

        while (low <= high) {
            mid = (low + high) / 2;
            pivot = array[mid];

            if (pivot < n) low = mid + 1;
            else if (pivot > n) high = mid - 1;
            else return pivot;
        }

        return -1; // Error
    }
}
