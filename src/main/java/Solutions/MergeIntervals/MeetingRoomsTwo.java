package Solutions.MergeIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class MeetingRoomsTwo {
    public static int minMeetingRooms(int[][] intervals) {
        if (intervals == null || intervals.length == 0) return 0;
        int minRooms = 1;
        if (intervals == null || intervals.length < 2) return minRooms;
        LinkedList<int[]> merged = new LinkedList<>();
        ArrayList<Integer> availableStartTimes = new ArrayList<>();

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        for (int[] b: intervals ) {
            if (merged.isEmpty() ||
                    merged.getLast()[1] > b[0]
            ) {
                merged.add(b); // no colision happens we dont need another room
            }
            else {
                // we need to replace the previous available meeting room
                int[] a = merged.getLast();
                a[1] = Math.max(a[1], b[1]);
            }
        }

        merged.forEach(room -> System.out.println(Arrays.toString(room)));

        return merged.size();
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
