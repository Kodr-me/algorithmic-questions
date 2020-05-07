package Solutions.TwoPointers;

import java.util.ArrayList;

public class TrappingRainWater {
    public static int trap(int[] nums) {

        int count = 0;

        for (int left = 0; left < nums.length; left++) {

            System.out.println("current: " + nums[left]);
            int right = left + 1;
            ArrayList<Integer> list = new ArrayList<>();

            if (nums[left] > nums[right]) {
                System.out.println("left bigger than right");
                while ( right < nums.length && nums[left] >= nums[right]) {
                    list.add(nums[right]);
                    right++;
                    System.out.println("moving right " + right);
                };

                for (int n : list) {
                    count += nums[left] - n;
                    System.out.println("count equals now to: " + count);
                }
                System.out.println(list);
            }

        }

        return count;
    }
}
