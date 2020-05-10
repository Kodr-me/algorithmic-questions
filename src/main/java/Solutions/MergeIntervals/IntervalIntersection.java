package Solutions.MergeIntervals;

import java.util.Arrays;
import java.util.LinkedList;

public class IntervalIntersection {
    public static int[][] intervalIntersection(int[][] A, int[][] B) {
        LinkedList<int[]> merged = new LinkedList<>();

        int aIndex = 0;
        int bIndex = 0;

        while (aIndex != A.length && bIndex != B.length ) {
            // need to compare both intervals if there is any intersection
            int[] a = A[aIndex];
            int[] b = B[bIndex];
            System.out.println("---------");
            System.out.println("COMPARING: a: " + Arrays.toString(a) + " b " + Arrays.toString(b));
            System.out.println("a index: " + aIndex + ", b index: " + bIndex);

            // we need to find out if there is no overlap first
            if ((a[1] < b[0] && b[1] > a[1]) || (b[1] < a[0] && b[1] < a[0])) {
                // I just want to increase the one with the lowest end
                System.out.println("no overlap just keep going");
                if (a[1] < b[1]) aIndex++;
                else bIndex++;
            } else { // they do have an overlap

                int[] intersectionInterval = new int[]{
                        Math.max(a[0], b[0]),
                        Math.min(a[1], b[1])
                };
                if (intersectionInterval[1] >= a[1]) aIndex++;
                if (intersectionInterval[1] >= b[1]) bIndex++;
                merged.add(intersectionInterval);
                System.out.println(Arrays.toString(intersectionInterval));
//                return A;
            }
        }


        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        int[][] A = new int[][]{
                {-10, -20},
                {0, 2},
                {5, 10},
                {13, 23},
                {24, 25}
        };
        int[][] B = new int[][]{
                {-5, -1},
                {1,5},
                {8, 12},
                {15, 24},
                {25, 26}
        };

        System.out.println(Arrays.deepToString(intervalIntersection(A, B)));
    }
}
