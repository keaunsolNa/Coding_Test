class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {

        for (int target = left; target <= right; target++) {

            boolean covered = false;

            for (int[] range : ranges) {

                if (range[0] <= target && target <= range[1]) {
                    covered = true;
                    break;
                }
            }

            if (!covered) {
                return false;
            }
        }

        return true;
    }
}
