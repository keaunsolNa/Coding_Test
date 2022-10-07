package codingTestLevel0;

public class Lessons65 {
	
	// 암호 해독
    public String solution(String cipher, int code) {
    	
    	char[] arr = cipher.toCharArray();
    	
    	StringBuilder sb = new StringBuilder();
    	for(int i = code; i <= cipher.length(); i++) {
    		if(i%code == 0) {
    			sb.append(arr[i - 1]);
    		}
    	}
        return sb.toString();
    }
    
    
}