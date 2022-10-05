package codingTestLevel1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Lessons44 {

	public static void main(String[] args) throws ParseException {
		
		Lessons44 lessons44 = new Lessons44();
		int[] a = {1,2,3,4};
		int[] b = {-3,-1,0,2};
		int result = lessons44.solution(a, b);
		
		System.out.println(result);
		
	}
	
	public int solution(int[] a, int[] b) {
		 
//		 길이가 같은 두 1차원 정수 배열 a, b가 매개변수로 주어집니다. a와 b의 내적을 return 하도록 solution 함수를 완성해주세요.
//		 이때, a와 b의 내적은 a[0]*b[0] + a[1]*b[1] + ... + a[n-1]*b[n-1] 입니다. (n은 a, b의 길이)
		int answer = 0;
		 
		for(int i = 0; i < a.length; i++) {
			answer += (a[i]*b[i]);
		}
		return answer;
		
	 }
}
