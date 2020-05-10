package Solutions.CyclicSort;

import java.util.Arrays;

class FirstMissingPositive {

    public static int findNumber(int[] nums) {
        // TODO: Write your code here
        System.out.println(Arrays.toString(nums));
        int i = 0;
        while (i < nums.length) {
//            System.out.println("i " + i);
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[nums[i] - 1]) {
                swap(i, nums[i] - 1, nums);
                System.out.println(Arrays.toString(nums));
            } else i++;
        }

        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) return i + 1;
        }

        return nums.length + 1;
    }

    private static void swap(int i, int j, int[] nums) {
//        System.out.println("swapping: " + nums[i] + " with: " + nums[j]);
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }

    public static void main(String[] args) {
        System.out.println(findNumber(new int[]{-3, 1, 5, 4, 2}));

        System.out.println(findNumber(new int[]{3, -2, 0, 1, 2}));

        System.out.println(findNumber(new int[]{3, 2, 5, 1}));


    }
}

