package codingTestLevel0;

public class Lessons96 {

	public static void main(String[] args) {
		int a = solution(15);
		System.out.println(a);
		
	}
	
	// 저주의 숫자 3
    public static int solution(int n) {
    	
    	int answer = 0;
    	int cnt = 0;
    	while(cnt != n) {
    		
    		if(answer % 3 == 0) {
    			answer++;
    			continue;
    		}
    		if((answer+"").charAt(0) == '3') {
    			answer++;
    			continue;
    		}
    		if((answer+"").length() == 2){
    			if(Character.getNumericValue((answer+"").charAt(0)) == 3) {
    				answer++;
    				continue;
    			}
                if(Character.getNumericValue((answer+"").charAt(1)) == 3) {
    				answer++;
    				continue;
    			}
    		}
            if((answer+"").length() == 3){
                if(Character.getNumericValue((answer+"").charAt(0)) == 3) {
    				answer++;
    				continue;
    			}
                if(Character.getNumericValue((answer+"").charAt(1)) == 3) {
    				answer++;
    				continue;
    			}
                if(Character.getNumericValue((answer+"").charAt(2)) == 3) {
    				answer++;
    				continue;
    			}
            }
            
    		cnt++;
    		if(cnt != n) {
    			answer++;
    		}
    	}
        return answer;
    }
    
}