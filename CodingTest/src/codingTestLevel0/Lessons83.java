package codingTestLevel0;

public class Lessons83 {

	public static void main(String[] args) {
		System.out.println(solution("hello", "ohell"));
	}
	
	// 문자열 밀기
    public static int solution(String A, String B) {
    	
    	StringBuilder sb = new StringBuilder();
    	int cnt = 0;
    	while(true) {
    		
    		sb.append(A.charAt(A.length() - 1));
    		for(int i = 0; i < A.length() - 1; i++) {
    			sb.append(A.charAt(i));
    		}
    		
    		cnt++;
    		if(B.equals(sb.toString())) {
    			return cnt;
    		} else if(cnt-1 == A.length()){
    			return -1;
    		} 
    		
    		A = sb.toString();
    		System.out.println(A);
    		sb.setLength(0);
    	}
    	
    }
    
}