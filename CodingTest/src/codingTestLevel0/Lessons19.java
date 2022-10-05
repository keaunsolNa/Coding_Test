package codingTestLevel0;

public class Lessons19 {
	
	// 양꼬치
    public int solution(int n, int k) {
        int answer = 0;
        
        answer += 12000*n;
        
        k -= n/10;
        
        answer += 2000*k;
        
        return answer;
    }
}