package codingTest;

public class Lessons36 {

	public static void main(String[] args) {
		
		Lessons36 lessons36 = new Lessons36();
		long answer = lessons36.solution(5);
		
		System.out.println(answer);
	}
	
    public long solution(long n) {
    	
//    	임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
//    	n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
    	
	long answer = 0;
	answer = (long)Math.sqrt(n);
    	
	if(n == (long)Math.pow(answer, 2)) {
		
		answer = (long)Math.pow(answer+1, 2);
		
	} else {
		
		answer =  -1;
		
	}
    	
	return answer;
    	
    }
}
