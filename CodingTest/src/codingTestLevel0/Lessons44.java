package codingTestLevel0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lessons44 {
	
	// 가장 큰 수 찾기
    public int[] solution(int[] array) {
    	
    	int[] sort = array.clone();
    	List<Integer> origin = new ArrayList<>();
    	for(int i = 0; i < array.length; i++) {
    		origin.add(array[i]);
    	}

    	Arrays.sort(sort);
    	
        int[] answer = new int[2];
        int max = sort[sort.length - 1];
        answer[0] = max;
        answer[1] = origin.indexOf(max);
        return answer;
    }
}