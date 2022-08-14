package codingTestLevel2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Lessons05 {
	
	public static void main(String[] args) {

		Lessons05 lessons05 = new Lessons05();
		int[] progresses = {99, 99, 99, 90, 90, 90};
		int[] speeds = {1,1,1,1,1,1};
		
		int[] answer = lessons05.solution(progresses, speeds);
		
		for (int i : answer) {
			System.out.println("result : " + i);
		}
	}

	
	Queue<Integer> arrayStack = new LinkedList<>();
    public int[] solution(int[] progresses, int[] speeds) {
//    	프로그래머스 팀에서는 기능 개선 작업을 수행 중입니다. 
//    	각 기능은 진도가 100%일 때 서비스에 반영할 수 있습니다.
//
//    	또, 각 기능의 개발속도는 모두 다르기 때문에 뒤에 있는 기능이 앞에 있는 기능보다 먼저 개발될 수 있고, 
//    	이때 뒤에 있는 기능은 앞에 있는 기능이 배포될 때 함께 배포됩니다.
//
//    	먼저 배포되어야 하는 순서대로 작업의 진도가 적힌 정수 배열 progresses와 
//    	각 작업의 개발 속도가 적힌 정수 배열 speeds가 주어질 때 각 배포마다 몇 개의 기능이 배포되는지를 return 하도록 solution 함수를 완성하세요.
    			
    	
    	int loop = 0;
    	Queue<Integer> progressesStack = new LinkedList<>();
    	List<Integer> arrayList = new ArrayList<>();
    	List<Integer> arraySpeed = new ArrayList<>();
    	
    	for(int i = 0; i < progresses.length; i++) {
    		progressesStack.add(progresses[i]);
    	}
    	
    	System.out.println("BEFORE : " + progressesStack);
    	
    	for(int i = 0; i < speeds.length; i ++) {
    		arraySpeed.add(speeds[i]);
    	}
    	
    	
    	while(progressesStack.size() != 0) {
    		System.out.println("loop 시작");
			loop = loop(progressesStack, arraySpeed, loop);
			if(loop != 0) {
				System.out.println("loop : " + loop);
				arrayList.add(loop);
				loop = 0;
			}
			
			if(progressesStack.size() == 0) {
				break;
			}
    	}
    	
    	int[] answer = new int[arrayList.size()];
    	for(int i = 0; i < arrayList.size(); i++) {
    		answer[i] = arrayList.get(i);
    	}
		return answer;
    	
    }
    
    public int loop(Queue<Integer> progressesStack, List<Integer> arraySpeed, int loop) {
    	System.out.println("loop 도착");
    	if(progressesStack.size() != 0) {
    		
	    	if(progressesStack.peek() < 100) {
	    		
	    		for(int i = 0; i < arraySpeed.size(); i++) {
	    			int temp = progressesStack.poll();
	    			temp += arraySpeed.get(i);
	    			progressesStack.add(temp);
	    		}
	    		
	    	} else {
	    		
	    		System.out.println("완성도 100 이상");
	    		for(int i = 0; i < progressesStack.size(); i++) {
	    			
	    			while(progressesStack.peek() >= 100) {
	    				
	    				System.out.println("뽑는 값 : " + progressesStack.peek());
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
