package Solutions.DynamicProgramming;

public class MagicIndex {
    int iterativeSolution(int[] n) {
        for (int i = 0; i < n.length; i++) {
            if (n[i] == i) return i;
        }
        return -1;
    }

    public int recursively(int[] n) {
        return recursively(n, 0, n.length -1);
    }

    private int recursively(int[] array, int start, int end) {
        if (end < start) return  -1;

        int mid = (start + end) / 2;

        if (mid == array[mid]) return mid;
        else if (array[mid] > mid) {
            return recursively(array, start, mid - 1); // we need to go left
        }
        else  return recursively(array, mid + 1, end); // we need to go right
    }
}
