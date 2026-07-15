class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);

        int maxPositive1 = nums[nums.length - 1];
        int maxPositive2 = nums[nums.length - 2];
        int maxPositive3 = nums[nums.length - 3];
        int maxNegative1 = nums[0];
        int maxNegative2 = nums[1];

        int max = Math.max(maxPositive1 * maxPositive2 * maxPositive3,
                          maxNegative1 * maxNegative2 * maxPositive1);

        return max;
    }
}