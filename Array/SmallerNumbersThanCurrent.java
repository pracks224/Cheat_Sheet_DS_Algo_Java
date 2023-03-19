package Array;

import java.util.Map;
import java.util.TreeMap;
/*
How Many Numbers Are Smaller Than the Current Number
 */
public class SmallerNumbersThanCurrent {
    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
        int[] result = smallerNumbersThanCurrent(nums);
        System.out.println(result);
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        Map<Integer, Integer> sortedMap = new TreeMap();
        int[] result = new int[nums.length];
        int i =0;
        for(Map.Entry<Integer,Integer> entry:sortedMap.entrySet()){
           result[entry.getValue()] = nums.length - i;
           i++;
        }

    }
}
