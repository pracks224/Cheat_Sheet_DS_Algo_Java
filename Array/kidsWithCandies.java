package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class kidsWithCandies {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ls = new ArrayList<>();
       // Arrays.sort(candies);
        int max = Integer.MIN_VALUE;
        for(int num:candies){
            max = Math.max(max,num);
        }
        for (int num : candies) {
            if (max <= (num + extraCandies)) {
                ls.add(true);
            } else {
                ls.add(false);
            }
        }

        return ls;
    }
}
