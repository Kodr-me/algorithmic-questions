package Solutions.MergeIntervals;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MeetingRooms {
    public static boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i - 1][1] > intervals[i][0]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // Input: [[0,30],[5,10],[15,20]]
        int[][] intervals = new int[][]{
                {0, 30},
                {5, 10},
                {15, 20}
        };
        System.out.println(canAttendMeetings(intervals));
    }
}
