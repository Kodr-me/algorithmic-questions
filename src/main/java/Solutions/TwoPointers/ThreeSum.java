package Solutions.TwoPointers;

import java.util.*;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            System.out.println("searching pairs for: " + nums[i]);
            searchPairs(nums, result, i, i + 1);
        }



        System.out.println("printing result");
        result.forEach(list -> System.out.println(list));
        return result;
    }

    private static void searchPairs(int[] nums, List<List<Integer>> result, int constant, int left) {
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[constant] + nums[left] + nums[right];

            if (sum == 0) {
                result.add(Arrays.asList(nums[constant], nums[left], nums[right]));
                // need to move them until they are diff
                left++;
                while (left < right && nums[left] != nums[left + 1]) left++;
                right--;
                while (left < right && nums[right] != nums[right - 1]) right--;
            }
            else if (sum < 0) {
                left++;
            } else right--;

        }
    }

    public static void main(String[] args) {
        int[] input = new int[]{-1, 0, 1, 2, -1, -4};
        threeSum(input);
    }
}
