class Solution {
    public void reverseString(char[] s) {
        
        char[] reverse = new char[s.length];
        int idx = 0;

        for (int i = s.length - 1; i >= 0; i--) {
            reverse[idx++] = s[i];
            System.out.println(reverse[idx - 1] + " " + s[i]);            
        }

        s = reverse;
    }
}