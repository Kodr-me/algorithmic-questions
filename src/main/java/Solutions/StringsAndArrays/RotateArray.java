package Solutions.StringsAndArrays;

import java.util.Arrays;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        if (k == 0 || k == length) return;

        if (length == 0 || length == 1) return;

        int[] copy = Arrays.copyOf(nums, length);

//        System.out.println(Arrays.toString(copy));

        int steps = k > length ?  k % length : k; // if k is bigger than the length, we start from k % length

//        System.out.println("steps: " + steps);

        int counter = 0;
        for (int i = length - steps; i < length; i++) { // copy from where the steps start
//            System.out.println(i);
            nums[counter] = copy[i];
            counter++;
        }

        // copy the rest
        int index = counter;
        for (int i = 0; i < length - index; i++) {
            nums[counter] = copy[i];
            counter++;
        }

        System.out.println(Arrays.toString(nums));

    }
}
