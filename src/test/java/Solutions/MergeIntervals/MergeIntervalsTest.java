package Solutions.MergeIntervals;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MergeIntervalsTest {

    @Test
    void test1() {
//        Input: [[1,3],[2,6],[8,10],[15,18]]
        int[][] intervals = new int[][]{
                {1,3},
                {2,6},
                {8, 10},
                {15, 18}
        };

        MergeIntervals.merge(intervals);

        System.out.println("printing answer");
        for (int[] interval : intervals) {
            System.out.println(Arrays.toString(interval));
        }
    }

    @Test
    void test2() {
        int[][] intervals = new int[][]{
                {1,4},
                {4, 5},
        };

        MergeIntervals.merge(intervals);

        System.out.println("printing answer");
        for (int[] interval : intervals) {
            System.out.println(Arrays.toString(interval));
        }
    }

    @Test
    void test3() {
        int[][] intervals = new int[][]{
                {6, 7},
                {2,4},
                {5, 9},
        };

        int[][] result = MergeIntervals.merge(intervals);

        System.out.println("printing answer");
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }

}