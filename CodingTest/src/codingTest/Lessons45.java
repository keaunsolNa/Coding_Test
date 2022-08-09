package codingTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Lessons45 {

	public static void main(String[] args) throws ParseException {
		
		Lessons45 lessons45 = new Lessons45();
		int result = lessons45.solution(45);
		
		System.out.println(result);
		
	}
	
    public int solution(int n) {
    	
//    	자연수 n이 매개변수로 주어집니다. 
//    	n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.
    	
        int answer = 0;
        
        String base3 = "";
        while(n != 0) {
        	base3 += n%3;
        	n = n/3;
        }
        answer = Integer.parseInt(base3, 3);
        
        return answer;
    }
}
