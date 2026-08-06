class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {

        int len = nums.length;
        int ans = 0;

        for (int i = 0; i < len; i++) {

            boolean beatsLeft = i - k < 0 || nums[i] > nums[i - k];
            boolean beatsRight = i + k >= len || nums[i] > nums[i + k];

            if (beatsLeft && beatsRight) {
                ans += nums[i];
            }
        }

        return ans;
    }
}
