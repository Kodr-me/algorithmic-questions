package Solutions.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    public static String minWindow(String str, String pattern) {
        int windowStart = 0, matched = 0, minLength = str.length() + 1, subStrStart = 0;
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        for (char c: pattern.toCharArray()) charFrequencyMap.put(c, charFrequencyMap.getOrDefault(c, 0) + 1);

        System.out.println(charFrequencyMap);

        // try to extend the range of window start and window end
        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char rightChar = str.charAt(windowEnd);

            if (charFrequencyMap.containsKey(rightChar)) {
                charFrequencyMap.put(rightChar, charFrequencyMap.get(rightChar) - 1);
                if (charFrequencyMap.get(rightChar) >= 0) matched++;
            }

            System.out.println("window end " + windowEnd + " char " + rightChar);
            System.out.println(charFrequencyMap);

            while (matched == pattern.length()) {
                System.out.println("entering while");
                System.out.println("now theyve matched " + str.substring(windowStart, windowEnd));
                int length = windowEnd - windowStart + 1;
                if (minLength > length) {
                    minLength = length;
                    subStrStart = windowStart;
                }

                char leftChar = str.charAt(windowStart++);
                if (charFrequencyMap.containsKey(leftChar)) {

                    if (charFrequencyMap.get(leftChar) == 0) matched--;
                    charFrequencyMap.put(leftChar, charFrequencyMap.get(leftChar) + 1);
                    System.out.println(charFrequencyMap);
                }
                System.out.println("");
            }
        }



        return minLength > str.length() ? "" : str.substring(subStrStart, subStrStart + minLength);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";

        System.out.println(minWindow(s, t));
    }
}
