class Solution {
    public int[] searchRange(int[] nums, int target) {

        int firstIdx = findFirstTrue(nums, target, false);

        if (firstIdx == -1 || nums[firstIdx] != target) {
            return new int[] {-1, -1};
        }

        int afterLastIdx = findFirstTrue(nums, target, true);
        int lastIdx = (afterLastIdx == -1) ? nums.length - 1 : afterLastIdx - 1;

        return new int[] {firstIdx, lastIdx};
    }

    private int findFirstTrue(int[] nums, int target, boolean findGreater) {

        int left = 0;
        int right = nums.length - 1;
        int firstTrueIndex = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;
            boolean feasible = findGreater ? nums[mid] > target : nums[mid] >= target;

            if (feasible) {
                firstTrueIndex = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return firstTrueIndex;
    }
}
