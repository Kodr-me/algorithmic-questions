package Solutions.MergeIntervals;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class InsertInterval {
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        if (newInterval == null) return intervals;
        if (intervals == null) return null;
        if (intervals.length == 0) return new int[][]{newInterval};

        // first we can insert and then we can merge
        LinkedList<int[]> insertList = insertIntoList(intervals, newInterval);

        LinkedList<int[]> mergedList = mergeIntervals(insertList);

//        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));
//        System.out.println("");
//        System.out.println("---- merged list ---");
//        mergedList.forEach(i -> System.out.println(Arrays.toString(i)));
//        System.out.println("");

        return mergedList.toArray(new int[mergedList.size()][]);
    }

    private static LinkedList<int[]> mergeIntervals(LinkedList<int[]> insertList) {
        LinkedList<int[]> mergedList = new LinkedList<>();
        for (int[] b: insertList) {
            if (mergedList.isEmpty() || b[0] > mergedList.getLast()[1]) { // want to know if first or if they dont overlap
                mergedList.add(b);
            } else {
                int[] a = mergedList.getLast();
//                System.out.println(" trying to insert: " + Arrays.toString(a) + " and " + Arrays.toString(b));
                a[1] = Math.max(a[1], b[1]);
            }
        }
        return mergedList;
    }

    private static LinkedList<int[]> insertIntoList(int[][] intervals, int[] newInterval) {
        LinkedList<int[]> insertList = new LinkedList<>();
        boolean inserted = false;
        for (int i = 0; i < intervals.length; i++) {
            if (!inserted && newInterval[0] <= intervals[i][0]) {
                insertList.add(newInterval);
                inserted = true;
            }
            insertList.add(intervals[i]);
        }
        if (!inserted) insertList.add(newInterval);

//        System.out.println("");
//        System.out.println("----");
//        System.out.println("insert list");
//        insertList.forEach(i -> System.out.println(Arrays.toString(i)));
//        System.out.println("");
//        System.out.println("----");

        return insertList;
    }

    public static void main(String[] args) {
        int[][] intervals = new int[][]{
                {1,5},
        };

        System.out.println(Arrays.deepToString(insert(intervals, new int[]{2, 7})));
    }
}
