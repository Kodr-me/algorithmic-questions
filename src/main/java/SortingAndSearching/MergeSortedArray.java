package SortingAndSearching;

import java.util.Arrays;

public class MergeSortedArray {

    /*
    This is a simple, yet inefficient solution. This would take M to copy the array onto nums1, and the O(N Log N) to sort the whole array.
     */
    public void badMerge(int[] nums1, int m, int[] nums2, int n) {
        int length = nums1.length - 1;
        while (n > 0) {
            System.out.println(n);
            nums1[length] = nums2[n - 1];
            length--;
            n--;
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }

//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//
//        int last = nums1.length - 1;
//
//        while (last != 0) {
//            if (n == 0) {
//                break;
//            };
//
//            if (m == 0) { // finished copying nums1, the leftovers are N elements from nums2 - which should go at the start
//                for (int i = 0; i < n; i++) {
//                    nums1[i] = nums2[i];
//                }
//                break;
//            }
//
//
//            int n1 = nums1[m - 1];
//            int n2 = nums2[n - 1];
//
//            if (n2 > n1) { // if the n2 is bigger, copy to the end
//                nums1[last] = n2;
//                n--;
//            } else if (n2 < n1) { // if the n1 is bigger, copy to the end
//                nums1[last] = n1;
//                m--;
//            } else { // if they are the same, copy n2 to the end
//                nums1[last] = n1;
//                m--;
//            }
//            last--;
//        }
//
//        if (n == 1) { // we havent checked the last element of nums2
//            nums1[0] = nums2[0];
//        }
//    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // two get pointers for nums1 and nums2
        int p1 = m - 1;
        int p2 = n - 1;
        // set pointer for nums1
        int p = m + n - 1;

        // while there are still elements to compare
        while ((p1 >= 0) && (p2 >= 0))
            // compare two elements from nums1 and nums2
            // and add the largest one in nums1
            nums1[p--] = (nums1[p1] < nums2[p2]) ? nums2[p2--] : nums1[p1--];

        // add missing elements from nums2
        System.arraycopy(nums2, 0, nums1, 0, p2 + 1);
    }
}
