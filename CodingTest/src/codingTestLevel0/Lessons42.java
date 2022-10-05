package codingTestLevel0;

import java.util.Arrays;

public class Lessons42 {
	
	// 문자열 정렬하기(1)
    public int[] solution(String my_string) {
    	
    	my_string = my_string.replaceAll("[^0-9]", "");
    	int[] answer = new int[my_string.length()];
    	for(int i = 0; i < my_string.length(); i++) {
    		answer[i] = Character.getNumericValue(my_string.charAt(i));
    	}
    	
    	Arrays.sort(answer);
        return answer;
    }
}