package Solutions.TwoPointers;

import java.util.*;

public class CuadrupleSum {

    /*
    Given an array nums of n integers and an integer target, are there elements a, b, c, and d in nums such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.

    dont include duplicates
     */
    public static List<List<Integer>> searchQuadruplets(int[] nums, int target) {

        List<List<Integer>> resultList = new ArrayList<>();
        if (nums == null || nums.length < 4) return resultList;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i - 1] == nums[i]) continue;

            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i && nums[i - 1] == nums[i]) continue;
                searchPairs(i, j, nums, target, resultList);
            }
        }


        return resultList;
    }

    private static void searchPairs(int first, int second, int[] nums, int target, List<List<Integer>> resultList) {
//        System.out.println("i: " + i + " j "+ j);

        int left = second + 1;
        int right = nums.length -1;

        while (left < right) {
            int sum = nums[first] + nums[second] + nums[left] + nums[right];
            if (sum == target) {
                resultList.add(Arrays.asList(nums[first], nums[second], nums[left], nums[right]));
                left++;
                right--;
                while (left < right && nums[left] == nums[left - 1])
                    left++; // skip same element to avoid duplicate quadruplets
                while (left < right && nums[right] == nums[right + 1])
                    right--; // skip same element to avoid duplicate quadruplets
            }
            else if (sum < target) left++;
            else right--;
        }
    }
}
