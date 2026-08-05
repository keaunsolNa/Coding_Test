class Solution {
    public void sortColors(int[] nums) {

        // Dutch national flag: [0, low) = 0, [low, mid) = 1, (high, end] = 2
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {

            if (nums[mid] == 0) {

                swap(nums, low, mid);
                low++;
                mid++;

            } else if (nums[mid] == 2) {

                swap(nums, mid, high);
                high--;

            } else {

                mid++;
            }
        }
    }

    private void swap(int[] nums, int left, int right) {

        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
