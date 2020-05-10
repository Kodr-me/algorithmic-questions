package Solutions.MergeIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class MeetingRoomsTwo {
    public static int minMeetingRooms(int[][] intervals) {
        if (intervals == null || intervals.length == 0) return 0;

        return 1;
    }

    public static void main(String[] args) {
        // Input: [[0, 30],[5, 10],[15, 20]]
        int[][] intervals = new int[][]{
                {0, 30},
                {5, 10},
                {15, 20},
                {35, 50},
                {45, 55},
        };

        System.out.println(minMeetingRooms(intervals));
    }
}
