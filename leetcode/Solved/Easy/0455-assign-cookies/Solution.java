class Solution {
    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);

        int child = 0;

        for (int cookie = 0; cookie < s.length && child < g.length; cookie++) {

            if (g[child] <= s[cookie]) {
                child++;
            }
        }

        return child;
    }
}
