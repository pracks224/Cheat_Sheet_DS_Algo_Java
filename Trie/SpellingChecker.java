package Trie;

import java.net.StandardSocketOptions;
import java.util.ArrayList;
import java.util.Arrays;

public class SpellingChecker {
    Node root = null;

    public ArrayList<Integer> solve(ArrayList<String> A, ArrayList<String> B) {
        ArrayList<Integer> ls = new ArrayList<>();
        root = new Node();
        for (String str : A)
            insert(root, str);
        for (String str : B) {
            ls.add(find(root, str));
        }
        return ls;
    }

    public Integer find(Node root, String str) {
        Node temp = root;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int idx = ch - 'a';
            if (temp.children[idx] != null && temp.children[idx].isEndOfWord) {
                return 1;
            }
            temp = temp.children[idx];
        }
        return 0;
    }

    public void insert(Node root, String str) {
        Node temp = root;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            final int idx = ch - 'a';
            if (temp.children[idx] == null) {
                temp.children[idx] = new Node();
            }
            temp = temp.children[idx];
        }
        temp.isEndOfWord = true;
    }

    public static void main(String[] args) {
        SpellingChecker awesome = new SpellingChecker();
        ArrayList<String> A = new ArrayList<>(Arrays.asList(new String[]{"ab", "abc", "abcd", "abcde", "abcdef", "abcdefg"}));
        ArrayList<String> B = new ArrayList<>(Arrays.asList(new String[]{"a", "b", "ab", "abcd"}));
        ArrayList<Integer> numList = awesome.solve(A, B);
        System.out.println(numList);
    }
}

class Node {
    boolean isEndOfWord;
    Node[] children;

    Node() {
        isEndOfWord = false;
        children = new Node[26];
    }
}
