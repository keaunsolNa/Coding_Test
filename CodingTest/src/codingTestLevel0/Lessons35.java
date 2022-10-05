package codingTestLevel0;

import java.util.Arrays;

public class Lessons35 {

	// 삼각형 완성조건
    public int solution(int[] sides) {
    	Arrays.sort(sides);
    	if(sides[2] >= sides[1] + sides[0]) {
    		return 2;
    	} else {
    		return 1;
    	}
    }
}