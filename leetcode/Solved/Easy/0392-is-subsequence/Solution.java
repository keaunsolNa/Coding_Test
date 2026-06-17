class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int index = 0;
        int cnt = s.length();
        for (char c : s.toCharArray()) {

            System.out.println("C : " + c);
            for (int i = index; i < t.length(); i++) {
                
                index++;
                System.out.println(t.charAt(i) + " : " + c);
                if (t.charAt(i) == c) {
                    cnt--;
                    System.out.println(cnt);
                    break;
                }                
            }
        }

        return cnt == 0;
    }
}