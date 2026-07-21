class Solution {
    public int titleToNumber(String columnTitle) {
        
        char[] arr = columnTitle.toCharArray();
        int ans = 0;

        for (int i = arr.length - 1; i >= 0; i--) {

            int idx = arr.length - i - 1;

            System.out.println("idx : " + idx);

            if (idx > 0) {
                ans += 26 * (arr[i] - 'A' + idx);
            }
            else ans += arr[i] - 'A' + 1;
            // System.out.println(Math.pow(arr[i] - 'A' + 1, idx == 0 ? 1 : idx + 1));
            // target += Math.pow(arr[i] - 'A' + 1, idx == 0 ? 1 : idx + 1);
            // ans += Math.pow(arr[i] - 'A' + 1, idx == 0 ? 1 : idx + 1);
                // System.out.println(target);
        }

        return ans;
    }
}