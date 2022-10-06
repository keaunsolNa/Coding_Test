package codingTestLevel0;

public class Lessons55 {
	
	// A로 B 만들기
    public int solution(String before, String after) {

    	StringBuilder sb = new StringBuilder(after);
    	for(int i = 0; i < before.length(); i++) {
    			char temp = before.charAt(i);
    		for(int j = 0; j < sb.length(); j++) {
    			if(sb.charAt(j) == temp) {
    				sb.deleteCharAt(j);
    				break;
    			}
    		}
    	}
    	
    	if(sb.length() == 0) {
    		return 1;
    	} else {
    		return 0;
    	}
    }
    
    
}