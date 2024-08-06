import java.util.Arrays;

public class Two_Sum {
    public static void main(String[] args) {
        int[] nums = {5, 6, 1, 8, 2};
        System.out.println(Arrays.toString(twoSum(nums,11)));

    }
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length ; i++) {
            for (int j = i+1; j < nums.length ; j++) {
                if (nums[i]+nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};

    }
}
