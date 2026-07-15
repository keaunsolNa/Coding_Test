class Solution {
    public void reverseString(char[] s) {
        
        char[] copy = Arrays.copyOf(s, s.length);
        int idx = 0;

        for (int i = copy.length - 1; i >= 0; i--) {
            s[idx++] = copy[i];
        }

    }
}