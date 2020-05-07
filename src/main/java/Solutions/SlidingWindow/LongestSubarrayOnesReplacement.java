package Solutions.SlidingWindow;

public class LongestSubarrayOnesReplacement {
    public static int longestOnes(int[] arr, int k) {
        int windowStart = 0, maxLength = 0, onesCount = 0;

        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {

            if (arr[windowEnd] == 1) onesCount++;

            if (windowEnd - windowStart + 1 - onesCount > k) {
                // shift left
                if (arr[windowStart] == 1) onesCount--;
                windowStart++;
            }

            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1};
        int k = 2;

        System.out.println(LongestSubarrayOnesReplacement.longestOnes(nums, k));
    }
}


