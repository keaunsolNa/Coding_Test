class Solution {
    public String solution(int[] numLog) {
        
       int number = 0;
       String answer = "";
       for(int i = 1; i < numLog.length; i++) {
    	   
    	   switch (numLog[i] - numLog[i - 1]) {
    	   	case 1 : answer += "w"; number++; break;
    	   	case -1 : answer += "s"; number--; break;
    	   	case 10 : answer += "d"; number += 10; break;
    	   	case -10 : answer += "a"; number -= 10; break;
    	   }
       }
       
       return answer;
    }
}