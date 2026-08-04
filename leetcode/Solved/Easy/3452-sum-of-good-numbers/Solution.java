class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        
        int len = nums.length;
        int ans = 0;

        for (int i = 0; i < len; i++) {

            if ( ( i - k < 0 || nums[i] > nums[i - k]) && (i + k > len - 1 || nums[i] > nums[i + k])) ans += nums[i];
        }

        return ans;
    }
}