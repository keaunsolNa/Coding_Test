class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int firstIndex = Integer.MAX_VALUE;
        int lastIndex = 0;
        boolean check = false;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == target) {
                check = true;
                firstIndex = Math.min(i, firstIndex);
                lastIndex = Math.max(i, lastIndex);
            }
        }

        int[] arr = new int[] {-1 ,-1};
        if (!check) return arr;
        else {

            arr[0] = firstIndex;
            arr[1] = lastIndex;

            return arr;
        }
    }
}