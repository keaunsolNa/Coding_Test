package codingTestLevel0;

public class Lessons91 {

	public static void main(String[] args) {
		int answer = solution(11, 22);
		System.out.println(answer);
		
	}
	
	// 유한 소수 판별하기
    public static int solution(int a, int b) {
    	
    	int gcd = GCD(a, b);
    	
    	if(gcd != 1) {
    		a = a/gcd;
    		b = b/gcd;
    	}

    	int answer = 1;
    	while(b != 1) {
    		
			if(b%2 == 0){
				b = b/2;
			} else if(b%5 == 0) {
				b = b/5;
			} else {
				answer = 2;
				break;
			}
    	}
    	
       
        return answer;
    }
    
    static int GCD(int a, int b){ 
    	if (a%b == 0) {
    		return b;
    	}
    	return GCD(b, a % b);
    }
}