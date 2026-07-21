class Solution {
    public int titleToNumber(String columnTitle) {
        
        char[] arr = columnTitle.toCharArray();
        int ans = 0;

        for (int i = 0; i < arr.length; i++) {

            int target = arr[i] - 'A' + 1;
            target += i == 0 ? 0 : i * 26;
            ans += target;
        }

        return ans;
    }
}