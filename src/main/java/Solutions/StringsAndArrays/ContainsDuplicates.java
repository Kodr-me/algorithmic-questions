package Solutions.StringsAndArrays;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicates {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length == 0 || nums.length == 1) return false;
        HashSet<Integer> set = new HashSet<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) return true;
            set.add(nums[i]);
            System.out.println(set);
        }
        return false;
    }
}
