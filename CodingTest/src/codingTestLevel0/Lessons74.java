package codingTestLevel0;

public class Lessons74 {

	// 삼각형의 완성조건 (2)
    public int solution(int[] sides) {
    	
    	int max = Math.max(sides[0], sides[1]);
    	int min = Math.min(sides[0], sides[1]);
    	int answer = 0;
    	
    	for(int i = max; i > 0; i--) {
    		if(i + min == max) {
    			break;
    		}
    		answer++;
    	}
    	
        for(int i = max+1; i < max+min; i++){
            answer++;
        }
    	
        return answer;
    }
    
}