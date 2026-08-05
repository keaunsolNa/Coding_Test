class Solution {
    public int subtractProductAndSum(int n) {
        
        String str = String.valueOf(n);

        int product = 1;
        int sum = 0;

        for (char c : str.toCharArray()) {
            product *= (int) c;
            sum += (int) c;
        }

        return product - sum;
    }
}