class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int index = 0;
        int cnt = s.length();
        for (char c : s.toCharArray()) {

            for (int i = index; i < t.length(); i++) {
                
                index++;
                if (t.charAt(i) == c) {
                    cnt--;
                    break;
                }                
            }
        }

        return cnt == 0;
    }
}