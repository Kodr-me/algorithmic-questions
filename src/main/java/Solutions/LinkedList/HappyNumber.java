package Solutions.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

class HappyNumber {

    public static boolean find(int num) {
        int slow = num, fast = num;

        do {
            slow = generateSquare(slow);
            fast = generateSquare(generateSquare(fast));
            System.out.println("slow + " + slow + " fast " + fast);
        } while (slow != fast);

        return slow == 1;
    }

    private static int generateSquare(int num) {
        int sum = 0;
        char[] digits = String.valueOf(num).toCharArray();
        for (Character c: digits) {
            int n = Character.getNumericValue(c);
            sum += (n * n);
        };
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(HappyNumber.find(23));
        System.out.println(HappyNumber.find(12));
    }
}
