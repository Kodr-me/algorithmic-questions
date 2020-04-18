package Solutions.StringsAndArrays;

import java.util.HashMap;
import java.util.Set;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (hashMap.containsKey(n)) {
                int c = hashMap.get(n);
                hashMap.put(n, c + 1);
            } else {
                hashMap.put(n, 1);
            }
        }

        System.out.println(hashMap);

        Set<Integer> keySet = hashMap.keySet();

        for (Integer key : keySet) {
            if (hashMap.get(key) == 1) return key;
        }

        return 0;
    }
}
