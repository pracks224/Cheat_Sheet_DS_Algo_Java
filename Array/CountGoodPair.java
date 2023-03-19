package Array;

import java.util.HashMap;

public class CountGoodPair {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 3};
        System.out.println(findGoodPair(nums));
    }
    public static int findGoodPair(int[] nums) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int goodpaircount = 0;
        for (int num : nums) {
            goodpaircount += freqMap.getOrDefault(num, 0);
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        return goodpaircount;
    }
}
