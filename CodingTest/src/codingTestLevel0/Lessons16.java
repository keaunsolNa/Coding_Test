package codingTestLevel0;

public class Lessons16 {
	
	// 자릿수 더하기
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 0; i < (n+"").length(); i++){
            answer += Character.getNumericValue((n+"").charAt(i));
        }
        return answer;
    }
}