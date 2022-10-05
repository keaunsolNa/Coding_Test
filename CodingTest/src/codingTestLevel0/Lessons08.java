package codingTestLevel0;

public class Lessons08 {
	
	// 짝수의 합
    public int solution(int n) {
        int answer = 0;
        for(int i = 2; i <= n; i++){
            answer += i;
            i++;
        }
        
        return answer;
    }
}