import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
    	int loop = 0;
    	Queue<Integer> progressesStack = new LinkedList<>();
    	List<Integer> arrayList = new ArrayList<>();
    	
    	for(int i = 0; i < progresses.length; i++) {
    		progressesStack.add(progresses[i]);
    	}
    	
    	
    	List<Integer> arraySpeed = new ArrayList<>();
    	for(int i = 0; i < speeds.length; i ++) {
    		arraySpeed.add(speeds[i]);
    	}
    	
    	
    	while(progressesStack.size() != 0) {
			loop = loop(progressesStack, arraySpeed, loop);
			if(loop != 0) {
				arrayList.add(loop);
				loop = 0;
			}
			
			if(progressesStack.size() == 0) {
				break;
			}
    	}
    	
    	System.out.println(arrayList);
    	
    	int[] answer = new int[arrayList.size()];
    	for(int i = 0; i < arrayList.size(); i++) {
    		answer[i] = arrayList.get(i);
    	}
		return answer;
    	
    }
    
    public int loop(Queue<Integer> progressesStack, List<Integer> arraySpeed, int loop) {
    	if(progressesStack.size() != 0) {
    		
	    	if(progressesStack.peek() < 100) {
	    		for(int i = 0; i < arraySpeed.size(); i++) {
	    			int temp = progressesStack.poll();
	    			temp += arraySpeed.get(i);
	    			progressesStack.add(temp);
	    		}
	    	} else {
	    		for(int i = 0; i < progressesStack.size(); i++) {
	    			while(progressesStack.peek() >= 100) {
	    				progressesStack.poll();
	    				loop++;
	    				if(arraySpeed.size() != 1) {
	    					arraySpeed.remove(i);
	    				} else {
	    					break;
	    				}
	    				
	    			} 
	    		}
	    	}
    	}
    	return loop;
    }
}