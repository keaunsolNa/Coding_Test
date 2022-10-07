package codingTestLevel0;

import java.util.Arrays;

public class Lessons66 {
	
	// 최댓값 만들기(2)
    public int solution(int[] numbers) {
    	
    	Arrays.sort(numbers);
    	
        int answer = Math.max((numbers[0]*numbers[1]), (numbers[numbers.length-1]*numbers[numbers.length-2]));
        return answer;
    }
    
}