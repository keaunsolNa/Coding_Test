package codingTest;


public class Lessons5 {

	public static void main(String[] args) {
		
		Lessons5 lessons5 = new Lessons5();
		boolean answer = lessons5.solution("1234");
		
		System.out.println(answer);
	}
	
    public boolean solution(String s) {
    	
    	boolean answer = false;
    	String pattern = "^[0-9]*$";
    	
    	if((s.length() == 4 || s.length() == 6) && s.matches(pattern)) {
    		return true;
    	} 
        return answer;
    }
}
