import java.util.Arrays;

public class Solution {
    public int pivotIndex(int [] nums) { // {1,7,3,6,5,6}
        int totalSum = Arrays.stream(nums).sum();
        int leftSum = 0;
        for (int i = 0; i<nums.length; i++){
            if(leftSum == totalSum - leftSum - nums[i]){
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().pivotIndex(new int [] {1,7,3,6,5,6}));
    }
}
