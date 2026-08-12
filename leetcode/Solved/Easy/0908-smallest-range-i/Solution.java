class Solution {
    public int smallestRangeI(int[] nums, int k) {
        
        Arrays.sort(nums);

        int max = nums[nums.length - 1];
        int min = nums[0];

        return Math.max(0, max - min - 2 * k);
    }
}