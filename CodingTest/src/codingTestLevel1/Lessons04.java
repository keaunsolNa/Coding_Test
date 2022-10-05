package codingTestLevel1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Lessons04 {
	
	public static void main(String[] args) {
	
		Lessons04 lessons04 = new Lessons04();
		
		String[] participant = {"mislav", "stanko", "mislav", "ana", "asdasd", "qweqwe", "cvxckvmkasd"};
		String[] completion = {"stanko", "ana", "mislav", "asdasd", "qweqwe", "cvxckvmkasd"};
		
		String answer = lessons04.solution(participant, completion);
		
		System.out.println(answer);
		
	}
    public String solution(String[] participant, String[] completion) {

    	
    	List<String> participantArrayList = new ArrayList<>(List.of(participant));
    	List<String> completionArrayList = new ArrayList<>(List.of(completion));
    	
    	Collections.sort(participantArrayList);
    	Collections.sort(completionArrayList);
    	
    	for(Iterator<String> iter=participantArrayList.iterator(); iter.hasNext();) {
    		String str = iter.next();
    		for(Iterator<String> iter2=completionArrayList.iterator(); iter2.hasNext();) {
    			String str2 = iter2.next();
    			
    			if(str.equals(str2)) {
    				
    				iter.remove();
    				iter2.remove();
    				
    				break;
    			}
    		}
    	}
    	
    	String answer ="";
    	for (String item:participantArrayList) {
    		answer += item;
    	}
    	
        System.out.println("ANSWER : " + answer);
        return answer;
    }
}
