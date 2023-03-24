package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Decompress Run-Length Encoded List
public class DeCompressArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] result = decompressRLElist(nums);
        System.out.println(Arrays.toString(result));
    }
    //SLOW APPROACH
    /*public static int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i =0;i<nums.length;i = i+2){
            int freq = nums[i];
            int val = nums[i+1];
            while(freq>0){
                list.add(val);
                freq--;
            }
        }
       return list.stream().mapToInt((Integer i)->i.intValue()).toArray();
    }*/

    //FASTER APPROACH with out using List

    public static int[] decompressRLElist(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            result += nums[i];
        }
        int[] ans = new int[result];
        int startIdx = 0;
        for (int i = 0; i < nums.length; i +=2) {
            Arrays.fill(ans, startIdx, startIdx + nums[i], nums[i + 1]);
            startIdx += nums[i];
        }
        return ans;
    }

}
