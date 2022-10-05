package codingTestLevel0;

public class Lessons38 {

	// 모음 제거
    public String solution(String my_string) {
    	
    	StringBuffer sb = new StringBuffer();
    	for(int i = 0; i < my_string.length(); i++) {
    		char temp = my_string.charAt(i);

    		if(temp != 'a' && temp != 'e' && temp != 'i' && temp != 'o' && temp != 'u') {
    			sb.append(my_string.charAt(i));
    		}
    	}
        return sb.toString();
    }
}