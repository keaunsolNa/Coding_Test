class Solution {
    public int[] countOppositeParity(int[] nums) {
        
        int len = nums.length;
        int[] ans = new int[len];

        for (int i = 0; i < len - 1; i++) {

            boolean isEven = nums[i] % 2 == 0;

            for (int j = i + 1; j < len; j++) {
                
                if (isEven && nums[j] % 2 != 0) ans[i]++;
                else if (!isEven && nums[j] % 2 == 0) ans[i]++;
            }
        }

        return ans;
        
    }
}