package Array;

public class LeftRighDiff {
    public static void main(String[] args) {

    }
    public int[] leftRigthDifference(int[] nums) {
       /* int[] prefixsumArr = new int[nums.length];
        int[] result = new int[nums.length];
        prefixsumArr[0] = nums[0];
        for(int i =1;i<nums.length;i++){
            prefixsumArr[i]=prefixsumArr[i-1]+nums[i];
        }
        result[0] = prefixsumArr[nums.length-1]-nums[0];
        for(int i =1;i<result.length;i++){
            int left_sum = prefixsumArr[i-1];
            int right_sum = prefixsumArr[nums.length-1]-prefixsumArr[i];
            result[i] = Math.abs(left_sum-right_sum);
        }
        return result;*/
        int leftsum=0;
        int rightsum=0;
        for(int i=0;i<nums.length;i++)
        {
            rightsum+=nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            int val=nums[i];
            rightsum-=val;
            nums[i]=Math.abs(leftsum-rightsum);
            leftsum+=val;
        }
        return nums;
    }
}

