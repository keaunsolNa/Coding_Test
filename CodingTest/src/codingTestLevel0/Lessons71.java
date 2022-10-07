package codingTestLevel0;

public class Lessons71 {
	
	// 합성수 찾기
    public int solution(int n) {
    	
    	int answer = 0;
    	for(int i = 4; i <= n; i++) {
    		
    		int cnt = 0;
    		for(int j = 1; j <=n; j++) {
    			if(i%j == 0) {
    				cnt++;
    			}
    			
    			if(cnt == 3) {
    				System.out.println(i);
    				answer++;
    				break;
    			}
    		}
    	}
        return answer;
    }
    
}