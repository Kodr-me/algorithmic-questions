package Solutions.MergeIntervals;

import java.util.*;

class Meeting {
    int start;
    int end;

    public Meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
};

class MinimumMeetingRooms {

    public static int findMinimumMeetingRooms(List<Meeting> meetings) {
        if (meetings == null || meetings.size() == 0) return 0;

        meetings.sort(Comparator.comparingInt(a -> a.start));
        int minRooms = 0;

        PriorityQueue<Meeting> minHeap = new PriorityQueue<>(meetings.size(), Comparator.comparingInt(m -> m.end));

        for (Meeting meeting: meetings) {
            while (!minHeap.isEmpty() && meeting.start >= minHeap.peek().end) minHeap.remove();
            minHeap.add(meeting);
        }

        minHeap.forEach(m -> System.out.println(m));
        return -1;
    }

    public static void main(String[] args) {
        List<Meeting> input = new ArrayList<Meeting>() {
            {
                add(new Meeting(4, 5));
                add(new Meeting(2, 3));
                add(new Meeting(2, 4));
                add(new Meeting(3, 5));
            }
        };
        int result = MinimumMeetingRooms.findMinimumMeetingRooms(input);
        System.out.println("Minimum meeting rooms required: " + result);

//        input = new ArrayList<Meeting>() {
//            {
//                add(new Meeting(1, 4));
//                add(new Meeting(2, 5));
//                add(new Meeting(7, 9));
//            }
//        };
//        result = MinimumMeetingRooms.findMinimumMeetingRooms(input);
//        System.out.println("Minimum meeting rooms required: " + result);
//
//        input = new ArrayList<Meeting>() {
//            {
//                add(new Meeting(6, 7));
//                add(new Meeting(2, 4));
//                add(new Meeting(8, 12));
//            }
//        };
//        result = MinimumMeetingRooms.findMinimumMeetingRooms(input);
//        System.out.println("Minimum meeting rooms required: " + result);
//
//        input = new ArrayList<Meeting>() {
//            {
//                add(new Meeting(1, 4));
//                add(new Meeting(2, 3));
//                add(new Meeting(3, 6));
//            }
//        };
//        result = MinimumMeetingRooms.findMinimumMeetingRooms(input);
//        System.out.println("Minimum meeting rooms required: " + result);
//
//        input = new ArrayList<Meeting>() {
//            {
//                add(new Meeting(4, 5));
//                add(new Meeting(2, 3));
//                add(new Meeting(2, 4));
//                add(new Meeting(3, 5));
//            }
//        };
//        result = MinimumMeetingRooms.findMinimumMeetingRooms(input);
//        System.out.println("Minimum meeting rooms required: " + result);
    }
}
