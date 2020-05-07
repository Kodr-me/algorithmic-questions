package Solutions.TwoPointers;

import java.util.Arrays;

public class RemoveDuplicates {
    public static int remove(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
            System.out.println(Arrays.toString(nums));
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{ 2,3,3,3,6,9,9};
        System.out.println(remove(arr));
    }
}
