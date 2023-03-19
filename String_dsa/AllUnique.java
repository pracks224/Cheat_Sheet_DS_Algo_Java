package String_dsa;

/*Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
        cannot use additional data structures?*/
public class AllUnique {
    public static void main(String[] args) {
        System.out.println(isUnique("aaaa"));
    }

    public static boolean isUnique(String str) {
        int[] charArr = new int[26];
        int n = str.length();
        int i = 0;
        while (i <n) {
            char ch = str.charAt(i);
            charArr[ch - 'a'] += 1;
            if (charArr[ch - 'a'] > 1) return false;
            i++;
        }
        return true;
    }
}
