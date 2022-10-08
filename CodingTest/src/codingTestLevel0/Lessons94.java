package codingTestLevel0;

import java.util.ArrayList;
import java.util.List;

public class Lessons94 {

	public static void main(String[] args) {
		int a = solution("10 Z");
		System.out.println(a);
		
	}
	
	// 컨트롤 제트
    public static int solution(String s) {
    	String[] arr = s.split(" ");
    	
    	List<String> arrList = new ArrayList<>();
    	for(int i = 0; i < arr.length; i++) {
    		arrList.add(arr[i]);
    	}
    	
    	int answer = 0;
    	int i = 0;
    	while(true) {
    		
    		if(arrList.get(i).equals("Z")) {
    			
    			if(i == 0) {
    				arrList.remove(i);
    				i = 0;
    				if(i == arrList.size()) {
    	    			break;
    	    		}
    			} else if(!arrList.get(i - 1).equals("Z")) {
                    arrList.remove(i);
    				arrList.remove(i-1);
    				i = 0;
    				if(i == arrList.size()) {
    	    			break;
    	    		}
    			} 
    		}
    		i++;
    		if(i == arrList.size()) {
    			break;
    		}
    	}
        
    	for (String string : arrList) {
            if(!string.equals("Z")){
			    answer += Integer.parseInt(string);            
            }

		}
        
        return answer;
    }
}