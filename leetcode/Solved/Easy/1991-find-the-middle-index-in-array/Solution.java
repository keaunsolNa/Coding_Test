class Solution {
    public int findMiddleIndex(int[] nums) {
        
        int left = 0;
        int right = Arrays.stream(nums).sum();

        for (int i = 0; i < nums.length; i++) {

            right -= nums[i];

            if (left == right) return i;

            left += nums[i];
        }

        return -1;
    }
}