class Solution {
    public int numberOfAlternatingGroups(int[] colors) {

        int ans = 0;
        int len = colors.length;

        for (int i = 1; i < len - 1; i++) {

            if (colors[i] != colors[i - 1] && colors[i] != colors[i + 1]) ans++;
        }   

        if (colors[0] != colors[1] && colors[0] != colors[len -1]) ans++;
        if (colors[len - 1] != colors[len - 2] && colors[len - 1] != colors[0]) ans++;


        return ans;
    }
}