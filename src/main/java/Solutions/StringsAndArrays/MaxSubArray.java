package Solutions.StringsAndArrays;

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        if(nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        int totalMax = 0;
        int total = 0;
        int highestNegative = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];

//            System.out.println("current: " + current);
            if (current <= 0 && (current > highestNegative)) { // we keep track of the highest negative in case we only receive negative nums in array
                highestNegative = current;
            }

            if (total < 0 && current > 0 ) { // if current is bigger than 0 we restart the total
                total = 0;
            }

            total += current;

//            System.out.println("total: " + total );

            if (total > totalMax) totalMax = total;
        }
//        System.out.println("total: " + total);
        return totalMax > 0 ? totalMax : highestNegative;
    }
}
