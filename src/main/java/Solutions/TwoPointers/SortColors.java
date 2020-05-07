package Solutions.TwoPointers;

import java.util.Arrays;

public class SortColors {
    public static void sortColors(int[] nums) {

        int left = 0, right = nums.length - 1;

        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            System.out.println("i: " + i + " = " + curr);

            switch (curr) {
                case 0: {
                    swap(left, curr, nums);
                    System.out.println("swapping left");
                    System.out.println(Arrays.toString(nums));
                    left++;
                    break;
                }
                case 2: {
                    swap(i, right, nums);
                    System.out.println("swapping right");
                    System.out.println(Arrays.toString(nums));
                    right--;
                    break;
                }
            }
            if (i >= right) break;
        }

        System.out.println(Arrays.toString(nums));
    }

    private static void swap(int left, int right, int[] nums) {
        int t = nums[left];
        int t2 = nums[right];
        nums[right] = t;
        nums[left] = t2;
    }

    public static void main(String[] args) {
        int[] a = new int[]{2,0,1};
        System.out.println(Arrays.toString(a));
        sortColors(a);
    }
}
