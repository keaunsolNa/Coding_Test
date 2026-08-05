class Solution {
    public int dominantIndex(int[] nums) {

        int maxIdx = 0;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > nums[maxIdx]) {
                maxIdx = i;
            }
        }

        for (int i = 0; i < nums.length; i++) {

            if (i != maxIdx && nums[maxIdx] < nums[i] * 2) {
                return -1;
            }
        }

        return maxIdx;
    }
}
