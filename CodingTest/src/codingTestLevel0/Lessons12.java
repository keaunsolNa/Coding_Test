package codingTestLevel0;

public class Lessons12 {
	
	// 문자열 뒤집기
    public String solution(String my_string) {
        StringBuffer sb = new StringBuffer(my_string);
        return sb.reverse().toString();
    }
}