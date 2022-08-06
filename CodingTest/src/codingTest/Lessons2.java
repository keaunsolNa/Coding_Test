package codingTest;

public class Lessons2 {

	class Solution {
	    public int[] solution(int[] lottos, int[] win_nums) {
	        int[] answer = new int[2];
	        int zeroCount = 0;
		    int correctNumbering = 0;
	        
	        for(int i = 0; i < lottos.length; i++){
	            if(lottos[i] == 0){
	                
	                zeroCount++;
	            }    
	        }
	        
		    for (int i : lottos) {
		        for (int j : win_nums) {
		        	if(i == j) {
		        		correctNumbering++;
		        	}
		        }
			}
		        
	        answer[0] = parameter(correctNumbering + zeroCount);
	        answer[1] = parameter(correctNumbering);
	        
	       return answer;
	    }
	    
	    public int parameter(int answer) {
	    	
	    	switch(answer){
	                
	    	case 6 : return 1;
	    	case 5 : return 2;
	    	case 4 : return 3;
	    	case 3 : return 4;
	    	case 2 : return 5;
	    	default : return 6;   
	    	
	    	}
	        
	    }
	}

}
