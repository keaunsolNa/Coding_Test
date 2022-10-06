package codingTestLevel0;

public class Lessons52 {
	
	// 분수의 덧셈
    public static int[] solution(int denum1, int num1, int denum2, int num2) {

    	int a = (denum1 * num2) + (denum2 * num1);
    	int b = num1 * num2;

    	int c = GCD(a, b);
		
    	int[] answer = new int[2];
    	answer[0] = a/c;
    	answer[1] = b/c;
    	
    	return answer;
    }	
    
    static int GCD(int a, int b){ 
    	if (a%b == 0) {
    		return b;
    	}
    	return GCD(b, a % b);
    }
    
}