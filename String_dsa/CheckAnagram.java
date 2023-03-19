package String_dsa;

public class CheckAnagram {
    public static void main(String[] args) {
        System.out.println(checkAnagram("anagram","nagaraa"));
    }

    public static boolean checkAnagram(String str1,String str2){
        char[] alphas = new char[26];
        for(int i =0;i<str1.length();i++){
            char ch = str1.charAt(i);
            alphas[ch-'a']++;
        }
        for(int i =0;i<str1.length();i++){
            char ch = str1.charAt(i);
            alphas[ch-'a']--;
        }
        for(int i =0;i<alphas.length;i++){
           if(alphas[i]>0) return false;
        }
        return true;
    }
}
