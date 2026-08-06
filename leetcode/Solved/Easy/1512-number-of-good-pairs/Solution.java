class Solution {
    public int numIdenticalPairs(int[] nums) {

        // nums[i] is bounded by 1..100: every earlier equal value forms a good pair.
        int[] count = new int[101];
        int ans = 0;

        for (int num : nums) {
            ans += count[num];
            count[num]++;
        }

        return ans;
    }
}
