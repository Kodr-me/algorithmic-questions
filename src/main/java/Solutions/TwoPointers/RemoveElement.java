package Solutions.TwoPointers;

import java.util.Arrays;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        boolean foundVal = false;

        for (int j = 0; j < nums.length; j++) {

            System.out.println("i: " + i + " j: " + j);

            if (nums[i] == val) {
                System.out.println("found val");
                foundVal = true;
            } else if (!foundVal){
                System.out.println("increasing i");
                i++;
            }

            if (foundVal && nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }

            System.out.println(Arrays.toString(nums));
        }

        return i;
    }

    public static void main(String[] args) {
//        System.out.println(removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
//        System.out.println(removeElement(new int[]{3,2,2,3}, 3));
        System.out.println(removeElement(new int[]{2, 1}, 1));
    }
}
