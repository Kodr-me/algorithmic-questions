package Solutions.MergeIntervals;

import java.util.*;

class MergeIntervals {

    public static int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length < 2) return intervals;

        // sort first O(N log N) by the initial
        LinkedList<int[]> mergedIntervals = new LinkedList<>();
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
//        printMatrix(intervals);

        for (int[] b: intervals) {
            // if is the first one to be added or it doesnt overlap with the previous
            if (mergedIntervals.isEmpty() || b[0] > mergedIntervals.getLast()[1]) mergedIntervals.add(b);
            else {

                int[] a = mergedIntervals.getLast();
                System.out.println("comparing A: " + Arrays.toString(a) + " B: " + Arrays.toString(b));
                mergedIntervals.getLast()[1] = Math.max(a[1], b[1]);
            }
        }

        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = new int[][]{
                {1,3},
                {2,6},
                {8, 10},
                {15, 18}
        };

        int[][] result = MergeIntervals.merge(intervals);

        System.out.println("printing answer");
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }

    private static void printMatrix(int[][] intervals) {
        System.out.println("printing matrix");
        for (int[] interval : intervals) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
