class Solution {
    public int findDuplicate(int[] nums) {
        
        boolean[] arr = new boolean[1000000];

        for (int i : nums) {

            if (!arr[nums[i]]) arr[nums[i]] = true;
            else return nums[i];
        }

        return 0;
    }
}