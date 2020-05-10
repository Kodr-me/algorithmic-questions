package Solutions.CyclicSort;

public class FindDuplicate {

    public static int findDuplicate(int[] nums) {
        int turtle = nums[0], hare = nums[0];
        System.out.println("turtle : " + turtle + " hare: " + hare);

        do {
            turtle = nums[turtle];
            hare = nums[nums[hare]];
            System.out.println("turtle : " + turtle + " hare: " + hare);
        } while (turtle != hare);

        // reset turtle
        turtle = nums[0];

        while (turtle != hare) {
            turtle = nums[turtle];
            hare = nums[hare];
        }

        return turtle;
    }

    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[] { 2,6,4,1,3,1,5 }));
//        System.out.println(findDuplicate(new int[] { 1, 4, 4, 3, 2 }));
//        System.out.println(findDuplicate(new int[] { 2, 1, 3, 3, 5, 4 }));
//        System.out.println(findDuplicate(new int[] { 2, 4, 1, 4, 4 }));
    }

    public static int findNumber(int[] nums) {

        int i = 0;
        while (i < nums.length) {

            if (nums[i] != i + 1) { // if the current one is not the one it should be, start swapping process
                if (nums[i] != nums[nums[i] - 1]) { // keep swapping until we found that there is already one in the index we are trying to switch to
                    swap(nums, i, nums[i] - 1);
                } else return nums[i];
            } else i++;
        }

        return -1;
    }

    private static void swap(int[] arr, int i, int j) {
//        System.out.println("swapping: " + arr[i] + " with: " + arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

//    public static void main(String[] args) {
//        System.out.println(FindDuplicate.findNumber(new int[] { 1, 4, 4, 3, 2 }));
//        System.out.println(FindDuplicate.findNumber(new int[] { 2, 1, 3, 3, 5, 4 }));
//        System.out.println(FindDuplicate.findNumber(new int[] { 2, 4, 1, 4, 4 }));
//    }
}
