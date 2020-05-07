package Solutions.TwoPointers;

import java.util.Arrays;

public class TripletsWithSmallerSum {

    public static int searchTriplets(int[] nums, int target) {
        int count = 0;
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];

            int targetSum = target - n;

            System.out.println("n " + n + " target sum: " + targetSum);

            int left = i + 1;
            int right = nums.length -1;

            while (left < right) {
                int leftn = nums[left];
                int rightn = nums[right];

                int sum = leftn + rightn;

                System.out.println(" total sum " + sum  + " left " + leftn + " right: " + rightn);

                if (sum > targetSum) {
                    right--;
                } else {
                    count+= right - left;
                    left++;
                }

            }
        }


        return count;
    }

    public static void main(String[] args) {
        int[] a = new int[]{-1, 4, 2, 1, 3};
        System.out.println(searchTriplets(a, 5));
    }
}
