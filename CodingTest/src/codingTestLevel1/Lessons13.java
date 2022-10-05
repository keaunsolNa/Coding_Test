package codingTestLevel1;

public class Lessons13 {

	public static void main(String[] args) {

		Lessons13 lessons13 = new Lessons13();
		String answer = lessons13.solution("asdasdasdaadasdasda");
		
		System.out.println(answer);
	}
	
    public String solution(String s) {

		int length = s.length();
				
		if(length%2 != 0) {
			return s.substring((length/2), (length/2)+1);
		} else {
			return s.substring((length/2)-1, (length/2)+1);
		}
    	
    }

}
