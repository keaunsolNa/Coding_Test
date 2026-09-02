class Solution {
    public int subarraySum(int[] nums) {
        
        int sum = nums[0];
        
        for (int i = 0; i < nums.length - 1; i++) {

            sum += (nums[i] + nums[i + 1]);
        }

        return sum;
    }
}