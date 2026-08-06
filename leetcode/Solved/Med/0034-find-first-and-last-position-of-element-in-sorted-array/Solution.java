class Solution {
    public int[] searchRange(int[] nums, int target) {

        if (nums.length == 0) {
            return new int[] {-1, -1};
        }

        int firstIdx = findFirstTrue(nums, target, false);

        if (firstIdx == -1 || nums[firstIdx] != target) {
            return new int[] {-1, -1};
        }

        int afterLastIdx = findFirstTrue(nums, target, true);
        int lastIdx;

        if (afterLastIdx == -1) {
            lastIdx = nums.length - 1;
        } else {
            lastIdx = afterLastIdx - 1;
        }

        return new int[] {firstIdx, lastIdx};
    }

    // findGreater 가 false 면 target 이상, true 면 target 초과인 첫 인덱스를 찾는다.
    private int findFirstTrue(int[] nums, int target, boolean findGreater) {

        int left = 0;
        int right = nums.length - 1;
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
