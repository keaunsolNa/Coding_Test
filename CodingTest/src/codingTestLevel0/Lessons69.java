package codingTestLevel0;

public class Lessons69 {
	
	// 다음에 올 숫자
    public int solution(int[] common) {
    	
    	int a = common[1] - common[0];
    	int b = common[2] - common[1];
    	int answer = 0;
    	if(a == b) {
    		answer = common[common.length - 1] + a;
    	} else {
    		a = common[common.length - 1] / common[common.length - 2];
    		answer = common[common.length - 1] * a;
    	}
        return answer;
    }
    
}