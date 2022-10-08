package codingTestLevel0;

public class Lessons88 {

	public static void main(String[] args) {
		System.out.println(solution("10", "11"));
	}
	
	// 이진수 더하기
    public static String solution(String bin1, String bin2) {
        
    	StringBuilder sb = new StringBuilder();
    	
    	if(bin1.length() < bin2.length()) {
    		while(bin1.length() != bin2.length()) {
    			bin1 = "0"+bin1;
    		}
    	} else if(bin1.length() > bin2.length()){
    		while(bin1.length() != bin2.length()) {
    			bin2 = "0"+bin2;
    		}
    	}
    	
    	int isPlus = 0;
    	for(int i = 0; i < bin1.length(); i++) {
    		int temp = Character.getNumericValue(bin1.charAt(bin1.length() - (i+1))) + Character.getNumericValue(bin2.charAt(bin2.length() - (i+1)));
    		if(isPlus != 0) {
    			temp++;
    			isPlus = 0;
    		}
    		if(temp == 1 || temp == 0) {
    			sb.append(temp);
    		} else if(temp == 2) {
    			sb.append(0);
    			if(i == bin1.length() - 1) {
    				sb.append(1);
    			}
    			isPlus++;
    		} else if(temp == 3) {
    			sb.append(1);
    			if(i == bin1.length() - 1) {
    				sb.append(1);
    			} else{
                    isPlus++;
                }
    		}
    		
    	}
    	
        return sb.reverse().toString();
    }
}