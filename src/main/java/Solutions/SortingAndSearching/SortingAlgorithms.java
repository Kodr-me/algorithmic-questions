package Solutions.SortingAndSearching;

public class SortingAlgorithms {
    void mergeSort(int[] array) {
        int[] helper = new int[array.length];
        mergeSort(array, helper, 0, array.length - 1);
    }

    private void mergeSort(int[] array, int[] helper, int low, int high) {
        if (low < high) {
            int midle = (low + high) / 2;
            mergeSort(array, helper, low, midle);
            mergeSort(array, helper, midle + 1, high);
            merge(array, helper, low, midle, high);
        }
    }

    private void merge(int[] array, int[] helper, int low, int middle, int high) {

        // copy onto helper array
        for (int i = low; i <= high; i++) {
            helper[i] = array[i];
        }

        int helperLeft = low;
        int helperRight = middle + 1;
        int current = low;

        /* iterate through the helper array, comparing the left and right half -
        and copying back the smaller element of the two, into the original array
         */
        while (helperLeft <= middle && helperRight <= high) {

            if (helper[helperLeft] <= helper[helperRight]) {
                array[current] = helper[helperLeft];
                helperLeft++;
            } else { // the right element is smaller
                array[current] = helper[helperRight];
                helperRight++;
            }

            current++;
        }

        // copy the rest of the left side of the helper into the original array.
        int remaining = middle - helperLeft;
        for (int i = 0; i <= remaining; i++) {
            array[current + i] = helper[helperLeft + i];
        }
    }



    void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int partition = partition(arr, low, high);
            quickSort(arr, low, partition-1);
            quickSort(arr, partition+1, high);
        }
    }

    int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low-1); // index of smaller element

        for (int j=low; j<high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i+1;
    }

    private void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
