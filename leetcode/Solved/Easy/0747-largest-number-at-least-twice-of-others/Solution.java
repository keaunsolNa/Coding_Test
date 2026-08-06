class Solution {
    public int dominantIndex(int[] nums) {

        int max = -1;
        int secondMax = -1;
        int idx = -1;

        int maxIdx = 0;

            if (target > max) {

                secondMax = max;
                max = target;
                idx = i;

            } else if (target > secondMax) {

                secondMax = target;
            }
        }

        if (max >= secondMax * 2) {
            return idx;
        }

        return -1;
    }
}
