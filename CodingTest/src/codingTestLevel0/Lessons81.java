package codingTestLevel0;

import java.util.ArrayList;
import java.util.List;

public class Lessons81 {

	
	// 배열 회전시키기
    public int[] solution(int[] numbers, String direction) {
    	
    	List<Integer> arrayList = new ArrayList<>();
    	if(direction.equals("left")) {
    		
    		for(int i = 1; i < numbers.length; i++) {
    			arrayList.add(numbers[i]);
    		}
    		arrayList.add(numbers[0]);
    		
    	} else {
    		arrayList.add(numbers[numbers.length - 1]);
    		for(int i = 0; i < numbers.length - 1; i++) {
    			arrayList.add(numbers[i]);
    		}
    	}

    	int[] answer = new int[arrayList.size()];
    	for (int i = 0; i < arrayList.size(); i++) {
			answer[i] = arrayList.get(i);
		}
    	
        return answer;
    }
    
}