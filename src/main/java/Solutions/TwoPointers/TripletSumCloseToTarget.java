package Solutions.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;

public class TripletSumCloseToTarget {
    public static int searchTriplet(int[] arr, int targetSum) {

        if (arr == null || arr.length < 2) throw new IllegalArgumentException();

        int[] nums = Arrays.copyOf(arr, arr.length);
        Arrays.sort(nums);
        ArrayList<Integer> results = new ArrayList<>();

//        System.out.println(Arrays.toString(nums));

        int closestTarget = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int left = i + 1;
            int right = nums.length - 1;
            System.out.println("i "  + i + "current " + current +  " left: " + left);

            while (left < right) {
                int leftN = nums[left];
                int rightN = nums[right];
                int currentSum = current + leftN + rightN;

                results.add(currentSum);

                int targetDiff = targetSum - current - leftN - rightN;
                System.out.println(targetDiff);

                if (targetDiff == 0) return targetSum - targetDiff;
                // the second part of the above 'if' is to handle the smallest sum when we have more than one solution
                if (Math.abs(targetDiff) < Math.abs(closestTarget) || (Math.abs(targetDiff) == Math.abs(closestTarget) && targetDiff > closestTarget))
                    closestTarget = targetDiff; // save the closest and the biggest difference


                System.out.println("left n " + leftN + " rightn " + rightN + " diff: " + targetDiff);


//                if (diffFromTarget )

                if (currentSum > targetSum) {
                    right--;
                } else if (currentSum < targetSum) {
                    left++;
                }

            }
        }

        return targetSum - closestTarget;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-2, 0, 1, 2};
        int target = 2;
        System.out.println(searchTriplet(arr, target));
    }
}
