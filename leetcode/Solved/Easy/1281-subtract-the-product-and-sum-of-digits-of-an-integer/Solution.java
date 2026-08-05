class Solution {
    public int subtractProductAndSum(int n) {
        
        String str = String.valueOf(n);

        int product = 1;
        int sum = 0;

        for (char c : str.toCharArray()) {
            System.out.println((int) (c - '0'));
            product *= (int) (c - '0');
            sum += (int) (c - '0');
        }

        return product - sum;
    }
}