package Solutions.TopKElements;

import java.util.*;

class ConnectRopes {

    public static int minimumCostToConnectRopes(int[] ropeLengths) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int n: ropeLengths) minHeap.add(n);

        int result = 0, current = 0;

        while (minHeap.size() > 1) {
            current = minHeap.poll();
            int next = minHeap.poll();
            int sum = current + next;
            result += sum;
            minHeap.offer(sum);
        }
        return result;
    }

    public static void main(String[] args) {
        int result = ConnectRopes.minimumCostToConnectRopes(new int[] { 1, 3, 11, 5 });
        System.out.println("Minimum cost to connect ropes: " + result);
        result = ConnectRopes.minimumCostToConnectRopes(new int[] { 3, 4, 5, 6 });
        System.out.println("Minimum cost to connect ropes: " + result);
        result = ConnectRopes.minimumCostToConnectRopes(new int[] { 1, 3, 11, 5, 2 });
        System.out.println("Minimum cost to connect ropes: " + result);
    }
}

