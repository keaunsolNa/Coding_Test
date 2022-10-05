package codingTestLevel0;

import java.util.Arrays;

public class Lessons30 {
	
	// 최댓값 만들기(1)
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        return numbers[numbers.length - 1]*numbers[numbers.length - 2];
    }
}