class Solution {
    public int smallestNumber(int n, int t) {
        for (int candidate = n; ; candidate++) {
            if (calculateDigitProduct(candidate) % t == 0) {
                return candidate;
            }
        }
    }

    private int calculateDigitProduct(int number) {
        int product = 1;
        for (int rest = number; rest > 0; rest /= 10) {
            product *= rest % 10;
        }
        return product;
    }
}
