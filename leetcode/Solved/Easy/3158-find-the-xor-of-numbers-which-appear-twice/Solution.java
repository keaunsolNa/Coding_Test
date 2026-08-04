class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        
        int[] arr = new int[51];
        int ans = 0;
        
        for (int x : nums) {

            arr[x]++;
            if (arr[x] == 2) ans ^= x;
            
        }
        
        return ans;
    }
}