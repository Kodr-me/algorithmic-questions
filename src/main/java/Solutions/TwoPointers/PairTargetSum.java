package Solutions.TwoPointers;

import java.util.Arrays;

public class PairTargetSum {
    public static int[] search(int[] arr, int targetSum) {
        int[] result = new int[2];
        int start = 0, end = arr.length - 1;

        while (start < end ) {
            int sum = arr[start] + arr[end];
            System.out.println("start: " + start + " end: " + end + " sum: " + sum);
            if (sum == targetSum) return new int[]{start, end};

            if (sum > targetSum) end--; // reduce from the right
            else start++;
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,6};
        int target = 6;
        int[] result = new int[]{1,3};

        System.out.println(Arrays.toString(search(array, target)));
    }
}
