class Solution {
    public int titleToNumber(String columnTitle) {
        
        char[] arr = columnTitle.toCharArray();
        int ans = 0;

        for (int i = arr.length - 1; i >= 0; i--) {

            int idx = arr.length - i - 1;

            if (idx > 0) ans += 26 * (arr[i] - 'A' + idx);
            else ans += arr[i] - 'A' + 1;
        }

        return ans;
    }
}