class Solution {
    public int minDeletionSize(String[] strs) {

        int n = strs[0].length();

        if (n == 1) return 0;

        int ans = 0;

        for (String str : strs) {
            
            int prev = str.charAt(0) - 'a';

            for (int i = 1; i < str.length(); i++) {
                
                int now = str.charAt(i) - 'a';

                if (prev > now) {
                    ans++;
                    break;
                }
            }
        }       

        return ans;
    }
}