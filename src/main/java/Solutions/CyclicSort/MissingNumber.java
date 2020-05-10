package Solutions.CyclicSort;

import java.util.Arrays;

class MissingNumber {

    public static int findMissingNumber(int[] nums) {
        // we can cyclic sort the array
        int i = 0;
        // try to sort the numbers as much as we can
        while (i < nums.length) {
            while (nums[i] < nums.length && nums[i] != nums[nums[i]])
                swap(i, nums[i], nums);
            i++;
        }

        System.out.println(Arrays.toString(nums));

        for (i = 0; i < nums.length; i++) {
            if (i != nums[i]) return i;
        }

        return  -1;
    }

    private static void swap(int currentIndex, int targetIndex, int[] nums) {
        System.out.println("swapping: " + nums[currentIndex] + " with: " + nums[targetIndex]);
        int temp = nums[targetIndex];
        nums[targetIndex] = nums[currentIndex];
        nums[currentIndex] = temp;
    }

    public static void main(String[] args) {
        System.out.println(MissingNumber.findMissingNumber(new int[] { 4, 0, 3, 1 }));
        System.out.println(MissingNumber.findMissingNumber(new int[] { 8, 3, 5, 2, 4, 6, 0, 1 }));
    }
}

