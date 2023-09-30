import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public int solution(int[] priorities, int location) {
    	int cnt = 0;
    	
    	Queue<String> document = new LinkedList<>();
    	List<String> prioritiesList = new ArrayList<>();
    	int i = 0;
    	
    	for(i = 0; i < priorities.length; i++) {
    		document.add("" + i + priorities[i]);
    		prioritiesList.add("" + priorities[i]);
    	}
    	
    	String tempPriorities = "" + location + priorities[location];
    	Collections.sort(prioritiesList, Collections.reverseOrder());
    	
		while(1==1) {
			if(document.peek().substring(document.peek().length()-1).equals(
                prioritiesList.get(cnt).substring(prioritiesList.get(cnt).length()-1))) {
				
				if(document.peek().equals(tempPriorities)) {
					cnt++;
					return cnt;
				}
				document.poll();
				cnt++;
			} else {
				String temp = document.peek();
				document.remove();
				document.add(temp);
			}
		}
    }
}
