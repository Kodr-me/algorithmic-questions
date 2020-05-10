package Solutions.CyclicSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicates {
    public static List<Integer> findNumbers(int[] nums) {
        List<Integer> duplicateNumbers = new ArrayList<>();

        //  place each element at its correct location

        int i = 0;
        while (i < nums.length) {
            if (nums[i] != nums[nums[i] - 1]) {
                // we swap
                swap(i, nums[i] - 1, nums);
//                System.out.println(Arrays.toString(nums));
            } else {
                i++;
            };
        }

        System.out.println(Arrays.toString(nums));

        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) duplicateNumbers.add(nums[i]);
        }

        return duplicateNumbers;
    }

    private static void swap(int i, int j, int[] nums) {
//        System.out.println("swapping: " + nums[i] + " with: " + nums[j]);
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 4,3,2,7,8,2,3,1 };
        List<Integer> result =  findNumbers(arr);
        System.out.println(result);
//        for (int num : result)
//            System.out.print(num + " ");
//        System.out.println();
    }
}
