class Solution {
    public void reverseString(char[] s) {
        
        char[] reverse = new char[s.length];
        int idx = 0;

        for (int i = s.length - 1; i >= 0; i--) {
            reverse[idx++] = s[i];
            System.out.println(reverse[idx - 1] + " " + s[i]);            
        }

        for (int i = 0; i < s.length; i++) System.out.print(reverse[i]);

        System.out.println();

        for (int i = 0; i < s.length; i++) System.out.print(s[i]);
        s = reverse;
    }
}