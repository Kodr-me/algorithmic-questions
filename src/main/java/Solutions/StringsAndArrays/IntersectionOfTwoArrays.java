package Solutions.StringsAndArrays;

import java.lang.reflect.Array;
import java.util.*;

public class IntersectionOfTwoArrays {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length == 0) return new int[0];
        if (nums2.length == 0) return new int[0];

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> resultSet = new HashSet<>();

        for (int i : nums1) {
            set.add(i);
        }

        for (int i : nums2) {
            if (set.contains(i)) resultSet.add(i);
        }

        System.out.println(resultSet);

        int[] result = resultSet.stream().mapToInt(i -> i).toArray();

        System.out.println(Arrays.toString(result));

        return result;
    }
}
