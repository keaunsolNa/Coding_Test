import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String solution(int[] numbers) {
        
    	String[] intArr = new String[numbers.length];
    	String answer = "";
    	
    	for (int i=0; i < intArr.length; i++) 
    		intArr[i] = String.valueOf(numbers[i]);
		
    	
    	Arrays.sort(intArr, new Comparator<String>() {

			public int compare(String o1, String o2) {
				return (o2 + o1).compareTo(o1 + o2);
			}
		});
    	
    	if(intArr[0].equals("0")) return "0";
        
    	 else {
             
    		for(int i = 0; i < intArr.length; i++) 
    			answer += intArr[i];
    		
    	}
    	
        return answer;
    }
}