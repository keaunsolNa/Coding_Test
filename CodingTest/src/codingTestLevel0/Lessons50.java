package codingTestLevel0;

public class Lessons50 {
	
	// 7의 개수
    public int solution(int[] array) {
    	
    	StringBuffer sb = new StringBuffer();
    	
    	for(int i = 0; i < array.length; i++) {
    		sb.append(array[i]);
    	}
    	
    	int answer = 0;
    	while(!(sb.indexOf("7") == -1)) {
    		sb.deleteCharAt(sb.indexOf("7"));
    		answer++;
    	}
    	
        return answer;
    }
}