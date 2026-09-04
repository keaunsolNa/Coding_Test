class Solution {
    public int countHillValley(int[] nums) {

        int hillValleyCount = 0;
        int previousDistinctIndex = 0;
      
        for (int i = 1; i < nums.length - 1; i++) {

            if (nums[i] == nums[i + 1]) {
                continue;
            }
          
            if (nums[i] > nums[previousDistinctIndex] && nums[i] > nums[i + 1]) {
                hillValleyCount++;
            }
          
            if (nums[i] < nums[previousDistinctIndex] && 
                nums[i] < nums[i + 1]) {
                hillValleyCount++;
            }
          
            previousDistinctIndex = i;
        }
      
        return hillValleyCount;
    }

}