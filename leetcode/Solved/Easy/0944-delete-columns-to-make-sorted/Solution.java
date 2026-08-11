class Solution {
    public int minDeletionSize(String[] strs) {

        int l = strs.length;
        int n = strs[0].length();

        if (n == 1) return 0;

        int ans = 0;
        int[][] arr = new int[l][n];

        for (int i = 0; i < l; i++) {
            
            for (int j = 0; j < n; j++) {

                arr [j][i] = (int) strs[i].charAt(j) - 'a';
            }

        }

        for (int i = 0; i < l; i++) {
            
            int prev = arr[i][0];
            int now = arr[i][1];
            boolean asc = prev <= now;

            prev = now;

            for (int j = 2; j < n; j++) {

                if (asc && prev <= now ) {
                    ans++;
                    break;
                }

                else if (!asc && prev >= now) {
                    ans++;
                    break;
                }
            }
        }
        
        return ans;
    }
}