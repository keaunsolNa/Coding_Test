class Solution {
    public String solution(String n_str) {
        String answer = "";
        
        for (int i = 0; i < n_str.length(); i++) {
            if(n_str.charAt(i) == '0') {
                n_str = n_str.replaceFirst("0", "");
                i--;
            }
            else return n_str;
        }
        return n_str;
    }
}