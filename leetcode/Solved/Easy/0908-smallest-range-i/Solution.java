class Solution {
    public int smallestRangeI(int[] nums, int k) {
        
        Arrays.sort(nums);

        int min = nums[0];
        int max = nums[nums.length - 1];

        return Math.min(max - min, Math.max(max - min - k, 0));
    }
}