import java.util.Deque;
import java.util.LinkedList;

class Solution {
    boolean solution(String s) {
        boolean answer = false;

        Deque<Character> deque = new LinkedList<>();
        
        char[] charArray = s.toCharArray();

        for (char c : charArray) {
        	
        	if(c == '(') {
        		deque.add(c);
        	}  else if(c == ')') {
        		if(deque.size() == 0) {
        			return false;
        		} else {
        			deque.poll();
        		}
        	}
		}
        
        if(deque.size() == 0) {
        	return true;
        }

        return answer;
    }
}