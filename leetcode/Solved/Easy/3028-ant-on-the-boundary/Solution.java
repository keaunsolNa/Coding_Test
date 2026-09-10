class Solution {
    public int returnToBoundaryCount(int[] nums) {

        int position = 0;
        int cnt = 0;

        for (int num : nums) {

            position += num;

            if (position == 0) {
                cnt++;
            }
        }

        return cnt;
    }
}
