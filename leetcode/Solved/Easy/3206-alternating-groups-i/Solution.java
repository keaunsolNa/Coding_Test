class Solution {
    public int numberOfAlternatingGroups(int[] colors) {

        int len = colors.length;
        int ans = 0;

        for (int mid = 0; mid < len; mid++) {

            int prev = colors[(mid + len - 1) % len];
            int next = colors[(mid + 1) % len];

            if (colors[mid] != prev && colors[mid] != next) {
                ans++;
            }
        }

        return ans;
    }
}
