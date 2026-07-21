class Solution {
    public int titleToNumber(String columnTitle) {
        
        char[] arr = columnTitle.toCharArray();
        int ans = 0;

        for (int i = arr.length - 1; i >= 0; i--) {

            System.out.print(arr[i] + " : ");
            int target = arr[i] - 'A' + 1;

            System.out.println(target);
            int idx = arr.length - i - 1;

            System.out.println("idx : " + idx);
            target += idx == 0 ? 0 : idx * (arr[i] - 'A') * 26 - 1;
            ans += target;
                System.out.println(target);
        }

        return ans;
    }
}