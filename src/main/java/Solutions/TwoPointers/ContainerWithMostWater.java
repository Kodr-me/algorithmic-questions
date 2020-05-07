package Solutions.TwoPointers;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        if (height == null || height.length < 2) return -1;
        int maxarea = 0, l = 0, r = height.length - 1;

        while (l < r) {
            int n = Math.min(height[l], height[r]) * (r - l);
            maxarea = Math.max(maxarea, n);

            if (height[l] < height[r]) l++;
            else r--;
        }


        return maxarea;
    }
}
