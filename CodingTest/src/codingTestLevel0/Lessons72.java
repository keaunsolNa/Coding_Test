package codingTestLevel0;

public class Lessons72 {
	
	// 문자열 계산하기
    public int solution(String my_string) {
    	
    	String[] temp = my_string.split(" ");
    	
    	// 3 + 4 + 5 - 2 + 5 -1
    	int a = Integer.parseInt(temp[0]);
    	String operator =  temp[1];
    	int b = Integer.parseInt(temp[2]);
    	
    	int answer = 0;
    	if(operator.equals("+")) {
    		answer += a + b;
    	} else {
    		answer += a - b;
    	}
    	
    	for(int i = 3; i < temp.length; i = i +2) {
    		operator = temp[i];
    		int number = Integer.parseInt(temp[i+1]);
    		switch(operator) {
    			case "+" : answer += number; break;
    			case "-" : answer -= number; break;
    		}
    	}
        return answer;
    }
    
}