class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int index = 0;
        int cnt = s.length();
        for (char c : s.toCharArray()) {

            for (int i = index; i < t.length(); i++) {
                
                index++;
                System.out.println(t.charAt(i) + " : " + c);
                if (t.charAt(i) == c) {
                    cnt--;
                    System.out.println(cnt);
                }                
            }
        }

        return cnt == 0;
    }
}