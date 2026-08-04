class Solution {
    public void sortColors(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while (start < end) {

            if (nums[start] == 0) {

                ++start;

            } else {

                if (nums[end] == 0) {

                    nums[end] = nums[start];
                    nums[start] = 0;
                    ++start;

                } else {

                    --end;

                }
            }
        }

        end = nums.length - 1;

        while (start < end) {

            if (nums[start] == 1) {

                ++start;

            } else {

                if (nums[end] == 1) {

                    nums[end] = nums[start];
                    nums[start] = 1;
                    ++start;

                } else {

                    --end;

                }
            }
        }
    }
}