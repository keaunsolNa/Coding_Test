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

            if (prev > now) {
                ans++;
                continue;
            }
            
            prev = now;

            for (int j = 2; j < n; j++) {
                
                now  = arr[i][j];
                System.out.println(prev + " " + now);
                
                if (prev > now ) {
                    ans++;
                    break;
                }

                prev = now;

            }
        }

        return ans;
    }
}