class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        Arrays.sort(g);
        Arrays.sort(s);
        int startIdx = 0;
        int ans = 0;

        for (int i = 0; i < g.length; i++) {

            int grid = g[i];

            for (int j = startIdx; j < s.length; j++) {

                int size = s[j];

                if (grid <= size) {

                    startIdx = j + 1;
                    ans++;
                    break;
                }
                
            }
        }

        return ans;
    }
}