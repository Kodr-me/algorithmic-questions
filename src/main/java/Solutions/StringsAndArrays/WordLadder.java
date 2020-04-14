package Solutions.StringsAndArrays;

import java.util.List;

public class WordLadder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (!wordList.contains(beginWord)) return 0;

        int result = 1;
        int prevCount = Integer.MIN_VALUE;

        // need to iterate through every word
        for (int i = 0; i < wordList.size(); i++) {
            String word = wordList.get(i);

            System.out.println("word: " + word);
            // need to iterate through each words char's -  makign sure the difference between the begin, end and current
            int count = 0;
            for (int j = 0; j < word.length(); j++) {
                char begin = beginWord.charAt(i);
                char end = endWord.charAt(i);
                char current = word.charAt(i);

                if (begin == current) count++;
            }
            // now I have the total count of similarities
            if (prevCount == Integer.MIN_VALUE) {
                prevCount = count;
                result++;
                continue;
            }

            System.out.println("count: " + count + ", prev count: " + prevCount);
            
        }

        return 0;
    }
}
