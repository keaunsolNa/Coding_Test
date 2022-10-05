package codingTestLevel1;


public class Lessons05 {

	public static void main(String[] args) {
		
		Lessons05 lessons05 = new Lessons05();
		boolean answer = lessons05.solution("1234");
		
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
