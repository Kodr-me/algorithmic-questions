package Solutions.TopKElements;

import java.util.*;

class KthLargestNumberInStream {

    final int k;
    PriorityQueue<Integer> minHeap = new PriorityQueue<>((n1, n2) -> n1 - n2);

    public KthLargestNumberInStream(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            if (i < k) minHeap.offer(nums[i]);
            else {
                if (minHeap.peek() < nums[i]) {
                    minHeap.poll();
                    minHeap.offer(nums[i]);
                }
            }
        }
        this.k = k;
    }

    public int add(int num) {
        minHeap.offer(num);

        if (minHeap.size() > k) minHeap.poll();

        return minHeap.peek();
    }

    @Override
    public String toString() {
        return "KthLargestNumberInStream{" +
                "k=" + k +
                ", minHeap=" + minHeap +
                '}';
    }

    public static void main(String[] args) {
        int[] input = new int[] { 3, 1, 5, 12, 2, 11 };
        KthLargestNumberInStream kthLargestNumber = new KthLargestNumberInStream(input, 4);
        System.out.println(kthLargestNumber);
        System.out.println("4th largest number is: " + kthLargestNumber.add(6));
        System.out.println("4th largest number is: " + kthLargestNumber.add(13));
        System.out.println("4th largest number is: " + kthLargestNumber.add(4));
    }
}
