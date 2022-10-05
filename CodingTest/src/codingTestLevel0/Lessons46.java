package codingTestLevel0;

import java.util.Arrays;

public class Lessons46 {
	
	// 문자열 정렬하기(2)
    public String solution(String my_string) {
    	
    	char[] temp = my_string.toLowerCase().toCharArray();
    	
    	Arrays.sort(temp);
    	
    	StringBuilder sb = new StringBuilder();

    	for (char c : temp) {
			sb.append(c);
		}
    	
        return sb.toString();
    }
}