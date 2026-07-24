class Solution {
    public int hammingDistance(int x, int y) {

        // The Hamming distance is the number of differing bits,
        // i.e. the population count of the XOR of the two numbers.
        return Integer.bitCount(x ^ y);
    }
}
