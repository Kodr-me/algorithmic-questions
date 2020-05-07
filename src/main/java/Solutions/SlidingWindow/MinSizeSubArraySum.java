package Solutions.SlidingWindow;

class MinSizeSubArraySum {
    public static int findMinSubArray(int s, int[] arr) {
        int min = Integer.MAX_VALUE;
        int windowStart = 0;
        int sum = 0;

        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            int current = arr[windowEnd];
            sum += current;

            while (sum >= s) {
                int total = windowEnd - windowStart + 1;
                if (total < min) min = total;
                sum -= arr[windowStart];
                windowStart++;
            }
        }


        return min;
    }
}

