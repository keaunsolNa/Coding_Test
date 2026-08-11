class Solution {
    public int minDeletionSize(String[] strs) {

        int n = strs[0].length();

        if (n == 1) return 0;

        int ans = 0;

        for (String str : strs) {
            
            int prev = str.charAt(0) - 'a';
            int now = str.charAt(1) - 'a';
            boolean asc = prev <= now;

            prev = now;

            for (int i = 2; i < str.length(); i++) {
                
                now = str.charAt(i) - 'a';

                if (asc && prev > now) {
                    ans++;
                    break;
                }

                else if (!asc && prev < now) {
                    ans++;
                    break;
                }

                prev = now;
            }
        }       

        return ans;
    }
}