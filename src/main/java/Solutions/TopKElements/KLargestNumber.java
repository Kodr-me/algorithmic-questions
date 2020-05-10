package Solutions.TopKElements;

import java.util.*;

class KLargestNumbers {

    public static List<Integer> findKLargestNumbers(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i < nums.length; i++) {
            int c = nums[i];
            if (i < k) minHeap.offer(c);
            if (c > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(c);
            }
        }

        System.out.println(minHeap);

        return new ArrayList<>(minHeap);
    }


    public static void main(String[] args) {
        List<Integer> result = KLargestNumbers.findKLargestNumbers(new int[] { 3, 1, 5, 12, 2, 11 }, 3);
        System.out.println("Here are the top K numbers: " + result);

        result = KLargestNumbers.findKLargestNumbers(new int[] { 5, 12, 11, -1, 12 }, 3);
        System.out.println("Here are the top K numbers: " + result);
    }
}
