class Solution {
    public int solution(String num_str) {
        
        int answer = 0;
        
        for (int i = 0; i < num_str.length(); i++) {
            answer += (int) num_str.charAt(i) - 48;
        }
        return answer;
    }
}