package Trie;

import java.util.HashMap;
import java.util.Map;

public class TrieBasics {
    TrieNode root;

    TrieBasics() {
        root = new TrieNode();
    }

    public static void main(String[] args) {
        TrieBasics trie = new TrieBasics();
        trie.insert("word");
        trie.insert("work");
        trie.insert("wood");

        for (Map.Entry<Character, TrieNode> map : trie.root.children.entrySet()) {
            TrieNode addMap = map.getValue();
            System.out.println(map.getKey() + " :: " + map.getValue().children);
        }
        System.out.println(trie.search("wodr"));
    }

    void insert(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (!current.children.containsKey(ch)) {
                current.children.put(ch, new TrieNode());
            }
            current = current.children.get(ch);
        }
        current.isEndOfWord = true;
    }

    boolean search(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char chs = word.charAt(i);
            if (!current.children.containsKey(chs)) {
                return false;
            }
            current = current.children.get(chs);
        }
        return current.isEndOfWord;
    }


}

class TrieNode {
    boolean isEndOfWord;
    HashMap<Character, TrieNode> children;

    public TrieNode() {
        this.isEndOfWord = false;
        this.children = new HashMap<>();
    }
}
