package Solutions.MergeIntervals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeetingRoomsTwoTest {

    @Test
    void test1() {
        int[][] intervals = new int[][]{
                {0, 30},
                {5, 10},
                {15, 20},
                {35, 50},
                {45, 55},
        };

        assertEquals(3, MeetingRoomsTwo.minMeetingRooms(intervals));
    }

    @Test
    void test2() {
        int[][] intervals = new int[][]{
                {0, 30},
                {5, 10},
                {15, 20},
        };

        assertEquals(2, MeetingRoomsTwo.minMeetingRooms(intervals));
    }

    @Test
    void test3() {
        int[][] intervals = new int[][]{
                {7, 10},
                {2, 4}
        };

        assertEquals(1, MeetingRoomsTwo.minMeetingRooms(intervals));
    }

    @Test
    void test4() {
        int[][] intervals = new int[][]{
                {9, 10},
                {4, 9},
                {4, 17}
        };

        assertEquals(2, MeetingRoomsTwo.minMeetingRooms(intervals));
    }
}