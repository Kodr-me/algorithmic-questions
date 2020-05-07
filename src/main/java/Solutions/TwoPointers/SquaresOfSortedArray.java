package Solutions.TwoPointers;

import java.util.Arrays;

public class SquaresOfSortedArray {
    public static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int left = 0, right = nums.length - 1, endIndex = nums.length - 1;

        while (left <= right) {
            int powLeft = nums[left] * nums[left];
            int powRight = nums[right] * nums[right];

            if (powLeft >= powRight) {
                left++;
                result[endIndex] = powLeft;
                endIndex--;
            } else {
                right--;
                result[endIndex] = powRight;
                endIndex--;
            }
            System.out.println(Arrays.toString(result));
        }

        return result;
    }

    public static void main(String[] args) {
        int[] input = new int[]{-4, - 1, 0, 3, 10};
        int[] output = sortedSquares(input);

        System.out.println(Arrays.toString(output));
    }
}
