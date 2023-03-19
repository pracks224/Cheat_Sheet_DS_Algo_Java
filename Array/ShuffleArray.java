package Array;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        shuffle(nums, 3);
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        result[0] = nums[0];
        int j = 0, k = 1;
        for (int i = 1; i < result.length; i = i + 2, j++) {
            result[i] = nums[n + j]; //1,3,5,
            // result[i+1] = nums[i+1-j];
        }
        for (int i = 2; i < result.length; i = i + 2, k++) {
            result[i] = nums[i - k];
        }
        return result;
    }

}
