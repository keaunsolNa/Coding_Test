package codingTest;

public class Lessons10 {

	public static void main(String[] args) {
		
		Lessons10 lessons10 = new Lessons10();
		
		int numbers = 12;
		
		int result = lessons10.solution(numbers);
		
		System.out.println(result);
	}
	
	public int solution(int n) {
		int answer = 0;
        
		if(n >= 3 && n <=  1000000) {
	        for(int i = 1; i < n; i++) {
	        	if(n%i == 1) {
	        		return i;
	        	}
	        }
		}
        
        return answer;
    }
}
