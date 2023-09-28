class Solution {
    public String solution(String my_string, int m, int c) {
        
        StringBuilder answer = new StringBuilder();

        int si = c - 1;

        while (si < my_string.length()) {
            answer.append(my_string.charAt(si));
            si += m;
        }

        return answer.toString();
    }
}