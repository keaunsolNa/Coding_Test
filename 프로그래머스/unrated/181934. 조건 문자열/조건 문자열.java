class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        
        switch(ineq) {
            case "<" :
                
                if(eq.equals("=")) return n <= m ? 1 : 0;
                else return n < m ? 1 : 0;
                
            case ">" :
                
                if(eq.equals("=")) return n >= m ? 1 : 0;
                else return n > m ? 1 : 0;
                
        }
        int answer = 0;
        return answer;
    }
}