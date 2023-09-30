import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
    	int[] answer = {};	
    	List<Integer> arrayList = new ArrayList<>();

    	int i = -1;
    	
    	for(int j = 0; j < arr.length; j++) {
    		if(arr[j] != i) {
    			arrayList.add(arr[j]);
    			i = arr[j];
    		}
    	}
    	
    	answer = new int[arrayList.size()];
    	
    	for(int j = 0; j < arrayList.size(); j++) {
    		answer[j] = arrayList.get(j);
    	}

        return answer;
    }
}