package codingTest;

public class Lessons09 {

	public static void main(String[] args) {
		
		Lessons09 lessons09 = new Lessons09();
		
		int[] numbers = {1,2,3,4,6,7,8,0};
		
		int result = lessons09.solution(numbers);
		
		System.out.println(result);
	}
	
	public int solution(int[] numbers) {
		 
		int result = 45;
		 
		for (int i : numbers) {
			result -= i;
		}
		 
	    return result;
	    
	}
}
