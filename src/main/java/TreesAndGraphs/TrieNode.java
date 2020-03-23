package TreesAndGraphs;

import java.util.HashMap;

public class TrieNode {

    private char character;
    private HashMap<Character, TrieNode> children = new HashMap<>();
    private boolean isWord;

    TrieNode() {}

    TrieNode(char c) {
        this.character = c;
    }

    public char getCharacter() {
        return character;
    }

    HashMap<Character, TrieNode> getChildren() {
        return children;
    }

    boolean isWord() {
        return isWord;
    }

    void setWord(boolean word) {
        isWord = word;
    }
}
