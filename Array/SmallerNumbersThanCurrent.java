package Array;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/*
How Many Numbers Are Smaller Than the Current Number
 */
public class SmallerNumbersThanCurrent {
    public static void main(String[] args) {
        int[] nums = {5, 0, 10, 0, 10,6};
        int[] result = smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(result));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] hash = new int[11];
        for (int i = 0; i < nums.length; i++) {
            hash[nums[i]]++;
        }
        for (int i = 1; i < hash.length; i++) {
            hash[i] += hash[i - 1];
        }
        int[] result = new int[nums.length];
        for (int i = 0; i < result.length; i++) {
            if (nums[i] == 0) continue;
            result[i] = hash[nums[i] - 1];
        }
        return result;
    }
}
