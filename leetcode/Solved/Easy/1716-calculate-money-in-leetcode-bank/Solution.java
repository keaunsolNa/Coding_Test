class Solution {
    public int totalMoney(int n) {

        int quotient = n / 7;
        int remainder =  n % 7;
        int ans = 28 * quotient;

        for (int i = 0; i < quotient; i++) {
            ans += (7 * i);
        }

        for (int i = 1; i <= n % 7; i++) {
            ans += (quotient + i); 
        }

        return ans;
    }
}