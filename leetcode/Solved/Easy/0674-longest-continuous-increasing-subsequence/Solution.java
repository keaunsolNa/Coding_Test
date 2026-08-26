class Solution {
    public int findLengthOfLCIS(int[] nums) {

        int prev = nums[0];
        int cnt = 1;
        int ans = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > prev) cnt++;
            else {
                
                ans = Math.max(ans, cnt);
                cnt = 1; 
            }

            prev = nums[i];
        }   

        ans = Math.max(ans, cnt);

        return ans;
    }
}