package codingTestLevel1;

public class Lessons15 {

	public static void main(String[] args) {

		Lessons15 lessons15 = new Lessons15();
		int answer = lessons15.solution(987);
		
		System.out.println(answer);
	}

    public int solution(int n) {
        int answer = 0;
        
        String number = n + "";
        
        for(int i = 0; i < number.length(); i++) {
        	int a = Character.getNumericValue(number.charAt(i));
        	answer += a;
        }
        
        return answer;
    }
}
