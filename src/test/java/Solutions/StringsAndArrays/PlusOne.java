package Solutions.StringsAndArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusOne {
    public int[] plusOne(int[] digits) {
//        System.out.println(Arrays.toString(digits));
        int last = digits.length - 1;

        if (digits[last] == 9) {

            List<Integer> list = new ArrayList<>();

            boolean carryOnEnded = false;

            for (int i = digits.length - 1; i >= 0; i--) {
                int current = digits[i];
//                System.out.println("current " + current);

                if (carryOnEnded) {
                    list.add(0, current);
                } else {
                    if (current == 9 && i == 0) {
                        list.add(0, 0);
                        list.add(0, 1);
                    }
                    else if (current == 9) list.add(0, 0);
                    else {
                        list.add(0, current + 1);
                        carryOnEnded = true;
                    }
                }
            }

//            System.out.println(list);

            return list.stream().mapToInt(i -> i).toArray();
        } else {
            digits[last] = digits[last] + 1;
            return digits;
        }
    }
}
