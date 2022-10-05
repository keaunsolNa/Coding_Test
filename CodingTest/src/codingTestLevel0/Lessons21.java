package codingTestLevel0;

import java.util.Arrays;

public class Lessons21 {
	
	// 중앙값 구하기
    public int solution(int[] array) {
    	
    	Arrays.sort(array);
        return array[array.length/2];
    }
}