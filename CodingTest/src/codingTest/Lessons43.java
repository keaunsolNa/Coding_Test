package codingTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Lessons43 {

	public static void main(String[] args) throws ParseException {
		
		Lessons43 lessons43 = new Lessons43();
		boolean result = lessons43.solution("Pyy");
		
		System.out.println(result);
		
	}
	
	boolean solution(String s) {
		
//		대문자와 소문자가 섞여있는 문자열 s가 주어집니다. 
//		s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요. 
//		'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 
//		단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
//
//		예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 false를 return합니다.

		String upper = s.toUpperCase();
		char[] charArr = upper.toCharArray();
        int count1 = 0;
        int count2 = 0;
        
		for(int a = 0; a < charArr.length; a++) {
			if(charArr[a] == 'P' ) {
				count1++;
			} 
			if(charArr[a] == 'Y') {
				count2++;
			}
		}
		
		boolean answer = true;
		if(count1 != count2) {
			answer = false;
		}
        return answer;
    }
}
