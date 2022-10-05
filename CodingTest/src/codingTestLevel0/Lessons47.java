package codingTestLevel0;

public class Lessons47 {
	
	// 특정 문자 제거하기
    public String solution(String my_string, String letter) {
    	
    	StringBuilder sb = new StringBuilder(my_string);
    	
    	while(!(sb.indexOf(letter) == -1)) {
    		sb.deleteCharAt(sb.indexOf(letter));
    	}
    	
        return sb.toString();
    }
}