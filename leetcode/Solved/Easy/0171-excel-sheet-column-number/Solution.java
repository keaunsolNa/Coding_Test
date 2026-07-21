class Solution {
    public int titleToNumber(String columnTitle) {
        
        char[] arr = columnTitle.toCharArray();
        int ans = 0;

        for (int i = 0; i < arr.length; i++) {

            int target = arr[i] - 'A' + 1;

            System.out.println(target);
            target += i == 0 ? 0 : i * 26;
            ans += target;
                System.out.println(target);
        }

        return ans;
    }
}