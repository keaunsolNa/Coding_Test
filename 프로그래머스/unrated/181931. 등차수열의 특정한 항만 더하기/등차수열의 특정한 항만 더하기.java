class Solution {
    public int solution(int a, int d, boolean[] included) {
        
        int answer = 0;
        for(int i = 1; i <= included.length; i++) {
            
            if(included[i - 1]) answer += a + ((i - 1) * d);
        }
        
        return answer;
    }
}