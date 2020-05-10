package Solutions.TopKElements;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

class KthSmallestNumber {

    public static int findKthSmallestNumber(int[] nums, int k) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); // max heap
        for (int i = 0; i < k; i++) maxHeap.offer(nums[i]);

        for (int i = k; i < nums.length; i++) {
            int c = nums[i];
            if (c < maxHeap.peek()) {
                maxHeap.poll();
                maxHeap.offer(c);
            }
        }

        return maxHeap.peek();
    }

    public static void main(String[] args) {
        int result = KthSmallestNumber.findKthSmallestNumber(new int[] { 1, 5, 12, 2, 11, 5 }, 3);
        System.out.println("Kth smallest number is: " + result);

        // since there are two 5s in the input array, our 3rd and 4th smallest numbers should be a '5'
        result = KthSmallestNumber.findKthSmallestNumber(new int[] { 1, 5, 12, 2, 11, 5 }, 4);
        System.out.println("Kth smallest number is: " + result);

        result = KthSmallestNumber.findKthSmallestNumber(new int[] { 5, 12, 11, -1, 12 }, 3);
        System.out.println("Kth smallest number is: " + result);
    }
}
