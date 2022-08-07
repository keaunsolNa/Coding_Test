package codingTest;

public class Lessons19 {

	public static void main(String[] args) {

		Lessons19 lessons19 = new Lessons19();
		int num = 3;
		String answer = lessons19.solution(num);
		
		System.out.println(answer);
	}

    public String solution(int num) {
    	
    	//정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.
    	
    	if(num%2 == 0) {
    		return "Even";
    	} else {
    		return "Odd";
    	}
    }
    
}
