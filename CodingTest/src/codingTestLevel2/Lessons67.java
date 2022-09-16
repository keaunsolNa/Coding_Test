package codingTestLevel2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Lessons67 {
	
	public static void main(String[] args) {

		Lessons67 lessons67 = new Lessons67();

		int answer = lessons67.solution("AAAABAAAAAAKSAIQ");

		System.out.println("ANSER : " + answer);
		
	} //	main
	
	public int solution(String name) {
   
		Queue<Integer> nameToIntQueue = new LinkedList<>();
		Stack<Integer> nameToIntStack = new Stack<>();
		for(int i = 1; i < name.length(); i++) {
			nameToIntStack.add(name.charAt(i) + 0);
			nameToIntQueue.add(name.charAt(i) + 0);
		}
		
		System.out.println(nameToIntStack);
		System.out.println(nameToIntQueue);
		int stack = Math.min(91 - name.charAt(0), name.charAt(0) - 65);
		int queue = Math.min(91 - name.charAt(0), name.charAt(0) - 65);
		
		if(nameToIntStack.isEmpty()) {
			return Math.min(stack, queue);
		}
		System.out.println("FIRST : " + stack);
		while(1==1) {
			stack++;
			System.out.println("IN LOOP STACK : " + "\t" + nameToIntStack.peek());
			System.out.println();
			
			stack = stack + Math.min(91 - nameToIntStack.peek(), nameToIntStack.pop() - 65);
			
			if(nameToIntStack.isEmpty()) {
				break;
			}
			if(nameToIntStack.size() == 1) {
				System.out.println("마지막Stack : " + nameToIntStack.peek());
				if(nameToIntStack.peek() == 65) {
					break;
				}
			}
			
		}
		
		while(1==1) {
			queue++;
			System.out.println("IN LOOP Queue : " + "\t" + nameToIntQueue.peek());
			System.out.println();
			
			queue = queue + Math.min(91 - nameToIntQueue.peek(), nameToIntQueue.poll() - 65);
			
			if(nameToIntQueue.isEmpty()) {
				break;
			}
			if(nameToIntQueue.size() == 1) {
				System.out.println("마지막Queue : " + nameToIntQueue.peek());
				if(nameToIntQueue.peek() == 65) {
					break;
				}
			}
			
		}
		System.out.println("stack : "  + (stack));
		System.out.println("queue : "  + (queue));
		
		int answer = Math.min(stack, queue);
        return answer;
    }
	
}		// class
	
	
	
