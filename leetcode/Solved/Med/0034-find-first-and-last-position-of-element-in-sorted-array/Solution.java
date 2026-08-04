class Solution {
    private int[] nums;
    private int n;

    public int[] searchRange(int[] nums, int target) {
        this.nums = nums;
        this.n = nums.length;

        if (n == 0) {
            return new int[] {-1, -1};
        }

        int firstIdx = findFirstTrue(target, false);
        if (firstIdx == -1 || nums[firstIdx] != target) {
            return new int[] {-1, -1};
        }

        int afterLastIdx = findFirstTrue(target, true);
        int lastIdx;
        if (afterLastIdx == -1) {
            lastIdx = n - 1;
        } else {
            lastIdx = afterLastIdx - 1;
        }

        return new int[] {firstIdx, lastIdx};
    }

    private int findFirstTrue(int target, boolean findGreater) {
        int left = 0;
        int right = n - 1;
        int firstTrueIndex = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            boolean feasible;
            if (findGreater) {
                feasible = nums[mid] > target;
            } else {
                feasible = nums[mid] >= target;
            }

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
