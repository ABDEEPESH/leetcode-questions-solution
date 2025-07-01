public class Solution {
    public int maxSubArray(int[] nums) {
        int maxSoFar = nums[0]; // Initialize with first element
        int currentMax = nums[0]; // Current subarray sum
        
        for (int i = 1; i < nums.length; i++) {
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }
        
        return maxSoFar;
    }
}
