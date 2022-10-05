package codingTestLevel1;

public class Lessons08 {

	public static void main(String[] args) {
		
		Lessons08 lessons08 = new Lessons08();
		
		int n = 12;
		
		int result = lessons08.solution(n);
		
	}
	
    public int solution(int n) {
    	
    	int result = 0;
    	for(int a = 1; a < n; a++) {
    		if(n%a == 0) {
    			System.out.println("a : " + a);
    			System.out.println("result : " + result);
    			result += a;
    		}
    	}
    	result += n;
    	
        return result;
    }
}
