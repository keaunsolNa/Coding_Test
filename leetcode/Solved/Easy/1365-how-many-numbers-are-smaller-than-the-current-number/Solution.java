class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        // nums[i] is bounded by 0..100, so a counting table beats the O(n^2) scan.
        int[] count = new int[101];

        for (int num : nums) {
            count[num]++;
        }

        int[] smallerThan = new int[101];

        for (int i = 1; i <= 100; i++) {
            smallerThan[i] = smallerThan[i - 1] + count[i - 1];
        }

        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = smallerThan[nums[i]];
        }

        return ans;
    }
}
