package codingTestLevel0;

public class Lessons14 {
	
	// 문자 반복 출력하기
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < my_string.toCharArray().length; i++){
        	for(int j = 0; j < n; j++) {
        		sb.append(my_string.toCharArray()[i]);
        	}
        }
        return sb.toString();
    }
}