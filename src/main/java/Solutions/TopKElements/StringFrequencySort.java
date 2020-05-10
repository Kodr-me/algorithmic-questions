package Solutions.TopKElements;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

class FrequencyChar {
    char c;
    int frequency;

    public FrequencyChar(char c, int frequency) {
        this.c = c;
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "FrequencyChar{" +
                "c=" + c +
                ", frequency=" + frequency +
                '}';
    }
}

public class StringFrequencySort {
    public static String frequencySort(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        System.out.println(map);

        PriorityQueue<FrequencyChar> heap = new PriorityQueue<>(Comparator.comparing(c -> c.frequency));

        for (Character character : map.keySet()) {
            int value = map.get(character);
            heap.offer(new FrequencyChar(character, value));
        }

        while (!heap.isEmpty()) {
            FrequencyChar removed = heap.poll();
            for (int i = 0; i < removed.frequency; i++) {
                stringBuilder.append(removed.c);
            }
        };

        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        String result = frequencySort("tree");
        System.out.println("Here is the given string after sorting characters by frequency: " + result);

//        result = frequencySort("Programming");
//        System.out.println("Here is the given string after sorting characters by frequency: " + result);

//        result = frequencySort("abcbab");
//        System.out.println("Here is the given string after sorting characters by frequency: " + result);
    }
}
