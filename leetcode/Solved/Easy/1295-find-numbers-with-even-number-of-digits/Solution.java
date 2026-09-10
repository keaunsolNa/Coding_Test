class Solution {
    public int findNumbers(int[] nums) {

        int ans = 0;

        for (int i = 0; i < nums.length; i++) {

            String num = String.valueOf(nums[i]);
            int len = num.length();

            if (len % 2 == 0) ans++;
        }        

        return ans;
    }
}