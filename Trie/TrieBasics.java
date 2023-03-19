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

      //  HashMap<Integer,Integer>  map = new HashMap<>();
       // map.entrySet().stream().filter(entry-> entry.getValue()>2).


        for (Map.Entry<Character, TrieNode> map : trie.root.children.entrySet()) {
            TrieNode addMap = map.getValue();
            System.out.println(map.getKey() + " :: " + map.getValue().children);
        }
        System.out.println(trie.search("w.rd"));
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

    public boolean search(String word) {
        return searchHelper(word.toCharArray(), 0, root);
    }

    private boolean searchHelper(char[] word, int index, TrieNode node) {
        if (index == word.length) {
            return node.isEndOfWord;
        }
        char c = word[index];
        if (c == '.') {
            for (TrieNode child : node.children.values()) {
                if (searchHelper(word, index + 1, child)) {
                    return true;
                }
            }
            return false;
        } else {
            TrieNode child = node.children.get(c);
            if (child == null) {
                return false;
            }
            return searchHelper(word, index + 1, child);
        }
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
