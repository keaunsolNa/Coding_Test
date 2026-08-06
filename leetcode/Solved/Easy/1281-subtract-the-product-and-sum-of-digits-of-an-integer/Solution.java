class Solution {
    public int subtractProductAndSum(int n) {

        int product = 1;
        int sum = 0;

        for (char c : String.valueOf(n).toCharArray()) {

            int digit = c - '0';
            product *= digit;
            sum += digit;
        }

        return product - sum;
    }
}
