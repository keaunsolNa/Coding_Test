package codingTest;

public class Lessons38 {

	public static void main(String[] args) {
		
		Lessons38 lessons38 = new Lessons38();
		String answer = lessons38.solution("027778888");
		
		System.out.println("RESULT : " + answer);
		
	}
	
    public String solution(String phone_number) {
    	
    	int length = phone_number.length();
    	String liveNumber = phone_number.substring(length-4, length);

    	String answer = "";
    	for(int a = 0; a < length-4; a++) {
    		answer += "*";
    	}
    	
    	answer = answer + liveNumber;
    	
        return answer;
    }
}
