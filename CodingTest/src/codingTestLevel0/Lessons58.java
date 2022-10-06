package codingTestLevel0;

public class Lessons58 {
	
	// 피자 나눠 먹기 (2)
    public int solution(int n) {

        int pis = 6;
        int answer = 1;
        while(true){
            
            if(pis%n != 0){
                pis += 6;
                answer++;
            }
            else{
                break;
            }
        }
        
        return answer;
    }
    
    
}