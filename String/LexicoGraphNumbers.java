package String;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LexicoGraphNumbers {
    public static void main(String[] args) {
        int num = 13;
        System.out.println(lexicalOrder(num));
    }

    public static List<Integer> lexicalOrder(int n) {
        List<Integer> ns = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ns.add(i);
        }
        Collections.sort(ns, (a, b) -> b - a);
        return ns;
    }
}

class LexicalComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
