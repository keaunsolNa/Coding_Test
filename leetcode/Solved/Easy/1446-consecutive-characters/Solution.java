class Solution {
    public int maxPower(String s) {
        
        char prev = s.charAt(0);
        int ans = 1;
        int size = 1;

        char[] arr = s.toCharArray();

        for (int i = 1; i < arr.length; i++) {

            if (prev == arr[i]) size++;
            else {
                ans = Math.max(size, ans);
                size = 1;
            }
            prev = arr[i];
        }

        ans = Math.max(size, ans);
        return ans;
    }
}