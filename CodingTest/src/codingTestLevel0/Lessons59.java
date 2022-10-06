package codingTestLevel0;

public class Lessons59 {
	
	// 팩토리얼 
	public int solution(int n) {

		int answer = 0;
        if(n <= 2){
            return n;
        }
		for(int i = 2; i <= 10; i++) {
			int fac = factorial(i);
			if(fac == n) {
				answer = i;
				break;
			} else if(fac > n){
                answer = i-1;
                break;
            }
		}
        return answer;
    }
    
    public int factorial(int n) {
		
		if(n < 2) return 1;
		return n*factorial(n-1);
	}
    
}