class Solution {
    public boolean isPowerOfFour(int n) {
        
        boolean isPositive = n > 0;
        boolean isPowerOfTwo = (n & (n - 1)) == 0;
        boolean isBitInEvenPosition = (n & 0xAAAAAAAA) == 0;
      
        return isPositive && isPowerOfTwo && isBitInEvenPosition;

    }
}