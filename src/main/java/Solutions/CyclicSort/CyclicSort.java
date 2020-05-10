package Solutions.CyclicSort;

import java.util.Arrays;

class CyclicSort {

    public static void sort(int[] nums) {

        int i = 0;
        while(i < nums.length) {
            while (nums[i] - 1 != i) {
                swap(i, nums[i] - 1, nums);
            }
            i++;
        }
    }

    private static void swap(int i, int j, int[] nums) {
        System.out.println("swapping: " + nums[i] + " with: " + nums[j]);
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 3, 1, 5, 4, 2 };
        CyclicSort.sort(arr);
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();

        arr = new int[] { 2, 6, 4, 3, 1, 5 };
        CyclicSort.sort(arr);
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();

        arr = new int[] { 1, 5, 6, 4, 3, 2 };
        CyclicSort.sort(arr);
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }
}

