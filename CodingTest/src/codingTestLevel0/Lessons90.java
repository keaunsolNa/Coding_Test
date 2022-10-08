package codingTestLevel0;

import java.util.Arrays;

public class Lessons90 {

	public static void main(String[] args) {
		String[] keyinput = {"left", "right", "up", "right", "right"};
		int[] board = {11, 11};
		
		int[] answer = solution(keyinput, board);
		for (int i : answer) {
			System.out.println(i);
		}
		
	}
	// 캐릭터의 좌표 
    public static int[] solution(String[] keyinput, int[] board) {
    	
        int[] answer = {0, 0};
        
        for(int i = 0; i < keyinput.length; i++) {
        		
    		switch(keyinput[i]) {
    			case "left" : answer[0] = answer[0] - 1; break;
    			case "right" : answer[0] = answer[0] + 1; break;
    			case "up" : answer[1] = answer[1] + 1; break;
    			case "down" : answer[1] = answer[1] - 1; break;
    		}
    	
    		if(Math.abs(answer[0]) > board[0]/2) {
    			if(answer[0] > board[0]/2) {
    				answer[0] = answer[0] - 1;
    			} else {
    				answer[0] = answer[0] + 1;
    			}
    		} else if(Math.abs(answer[1]) > board[1]/2) {
    			if(answer[1] > board[1]/2) {
    				answer[1] = answer[1] - 1;
    			} else {
    				answer[1] = answer[1] +1;
    			}
    		} 
        }
        
        return answer;
    }
}