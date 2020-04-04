package Solutions.TreesAndGraphs;

import java.util.ArrayList;

public class AutoCompletion {

    void solution(ArrayList<String> list, String prefix) {
        Trie trie = new Trie();

        for (String s : list) {
            trie.insert(s);
        }

        trie.printWordsWithPrefix(prefix);
    }

    public ArrayList badSolution(ArrayList<String> list, String inputWord) {
        ArrayList<String> result = new ArrayList();
        for (String s : list) {
            if (s.contains(inputWord)) result.add(s);
        }
        return result;
    }
}

