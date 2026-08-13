class Solution {
    public int removeDuplicates(int[] nums) {
      
        int idx = 0;
      
        for (int num : nums) {

            if (idx == 0 || num != nums[idx - 1]) {
                
                nums[idx] = num;
                idx++;
            }
        }
      
        return idx;
    }
}