class Solution {
    public int singleNumber(int[] nums) {

        int[] arr = new int[3 * 10000 + 1];
        int ans = 0;
        
        for (int x : nums) {

            arr[x]++;
            if (arr[x] == 3) ans ^= x;
            
        }
        
        return ans;

    }
}