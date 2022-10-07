package codingTestLevel0;

public class Lessons70 {
	
	// 공 던지기
    public int solution(int[] numbers, int k) {
    	
    	int cnt = 0;
    	int temp = 0;
    	int index = 0;
    	while(true) {
    		if(index >= numbers.length) {
    			index%= numbers.length;
    		}
    		temp = numbers[index];
    		index += 2;
    		cnt++;
    		
    		if(cnt == k) {
    			break;
    		}
    	}
    	
        int answer = temp;
        return answer;
    }
    
}