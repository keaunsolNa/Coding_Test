class Solution {
    public int duplicateNumbersXOR(int[] nums) {

        // 제약: 1 <= nums[i] <= 50, 각 값은 최대 2 번 등장한다.
        final int maxValue = 50;
        boolean[] seen = new boolean[maxValue + 1];
        int ans = 0;

        for (int num : nums) {

            if (seen[num]) {
                ans ^= num;
            } else {
                seen[num] = true;
            }
        }

        return ans;
    }
}
