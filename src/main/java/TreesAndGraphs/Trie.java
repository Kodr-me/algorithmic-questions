package TreesAndGraphs;

public class Trie {
    TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode current = root;

        for(int i=0; i<word.length(); i++){
            char c = word.charAt(i);

            TrieNode t;
            if (current.getChildren().containsKey(c)){
                t = current.getChildren().get(c);
            } else {
                t = new TrieNode(c);
                current.getChildren().put(c, t);
            }

            current = t;

            if(i==word.length()-1)
                t.setWord(true);
        }
    }

    public boolean search(String word) {
        TrieNode t = searchNode(word);

        if (t != null && t.isWord()) return true;
        return false;
    }

    private TrieNode searchNode(String word) {
        TrieNode current = root;
        TrieNode t = null;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if (current.getChildren().containsKey(c)) {
                t = current.getChildren().get(c);
                current = t;
            } else {
                return null;
            }
        }
        return t;
    }

    public void printWordsWithPrefix(String prefix) {
        TrieNode t = traverseToNode(prefix);

        printWordsFromNode(t, prefix);
    }

    private TrieNode traverseToNode(String inputWord) {
        TrieNode current = root;

        TrieNode t = null;
        for (int i = 0; i < inputWord.length(); i++) {
            char c = inputWord.charAt(i);
            if (current.getChildren().containsKey(c)) {
                t = current.getChildren().get(c);
                current = t;
            } else {
                return null;
            }
        }
        return t;
    }

    private void printWordsFromNode(TrieNode t, String prefix) {
        if (t.isWord()) {
            System.out.println(prefix);
        }
        for (int i = 0; i < t.getChildren().keySet().size(); i++) {
            char c = (char) t.getChildren().keySet().toArray()[i];
            TrieNode children = t.getChildren().get(c);
            printWordsFromNode(children, prefix + c);
        }
    }

}
