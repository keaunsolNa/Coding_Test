package codingTestLevel1;

public class Lessons14 {

	public static void main(String[] args) {

		Lessons14 lessons14 = new Lessons14();
		String answer = lessons14.solution(3);
		
		System.out.println(answer);
	}

    public String solution(int n) {
    	
    	String answer = "";
    	
    	for(int i = 0; i < n; i++) {
    		if(i==0 || i%2 == 0) {
    			answer += "��";
    		} else {
    			answer += "��";
    		}
    	}
    	
        return answer;
    }
}
