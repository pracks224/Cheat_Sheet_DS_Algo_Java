package Maths;

import java.util.Arrays;

public class PowerOfThree {
    public static void main(String[] args) {
     // System.out.println(isPowerOfThree(45));
        isAnagram("nagaram","anagram");
    }

    public static boolean isAnagram(String s, String t) {
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1) ;
        Arrays.sort(arr2);
        return  arr1 == arr2;
    }
    public static boolean isPowerOfThree(int n) {
        if(n == 0) return false;
        if(n == 1) return true;
        n = n/3;
        return isPowerOfThree(n);
    }
}
