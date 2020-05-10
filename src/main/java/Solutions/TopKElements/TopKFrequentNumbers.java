package Solutions.TopKElements;

import java.util.*;

class FrequentNumber {
    int n;
    int frequency;

    public FrequentNumber(int n, int frequency) {
        this.n = n;
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "FrequentNumber{" +
                "n=" + n +
                ", frequency=" + frequency +
                '}';
    }
}

class TopKFrequentNumbers {

    public static List<Integer> findTopKFrequentNumbers(int[] nums, int k) {

        List<Integer> topNumbers = new ArrayList<>(k);
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        // sort by highest frequency
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<Map.Entry<Integer, Integer>>(
                (e1, e2) -> e1.getValue() - e2.getValue());

        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            minHeap.add(entry);
            if (minHeap.size() > k) minHeap.poll();
        }

        while (!minHeap.isEmpty()) topNumbers.add(minHeap.poll().getKey());

        return topNumbers;
    }

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : nums) map.put(n, map.getOrDefault(n, 0) + 1);
//        System.out.println(map);

        PriorityQueue<FrequentNumber> minHeap = new PriorityQueue<>(Comparator.comparingInt(n -> n.frequency));

        int[] result = new int[k];

        for (int key : map.keySet()) {
            int val = map.get(key);
            if (minHeap.size() < k) minHeap.add(new FrequentNumber(key, val));
            else {
                if (minHeap.peek().frequency < val) {
                    minHeap.poll();
                    minHeap.add(new FrequentNumber(key, val));
                }
            }
        }

//        System.out.println(minHeap);

        for (int i = 0; i < result.length; i++) {
            result[i] = minHeap.poll().n;
        }


        return result;
    }

    public static void main(String[] args) {

        int[] result = topKFrequent(new int[] { 1, 3, 5, 12, 11, 12, 11 }, 2);
        System.out.println("Here are the K frequent numbers: " + Arrays.toString(result));
//        List<Integer> result = TopKFrequentNumbers.findTopKFrequentNumbers(new int[] { 1, 3, 5, 12, 11, 12, 11 }, 2);
//        System.out.println("Here are the K frequent numbers: " + result);
//
//        result = TopKFrequentNumbers.findTopKFrequentNumbers(new int[] { 5, 12, 11, 3, 11 }, 2);
//        System.out.println("Here are the K frequent numbers: " + result);
    }
}

