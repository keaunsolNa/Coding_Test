class Solution {
    public int smallestNumber(int n, int t) {

        while (true) {
            
            int product = 1;
            
            int temp = n;
            while (temp > 0) {
                int digit = temp % 10;
                product *= digit; 
                temp /= 10;            
            }

            System.out.println(product + " " + temp);

            if (product % t == 0) return product;
            else n++;

            return 0;
        }       
    }
}