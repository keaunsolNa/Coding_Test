package codingTest;

import java.util.Arrays;

public class Lessons06 {

	public static void main(String[] args) {
		
		Lessons06 lessons06 = new Lessons06();
		String s = "Zbzcdefg";
		String answer = lessons06.solution(s);
		System.out.println(answer);
	}
	
	public String solution(String s) {
		char[] strArray = s.toCharArray();
		
		Arrays.sort(strArray);

		StringBuilder answer = new StringBuilder(new String(strArray));
		
		
		return answer.reverse().toString();
	}

}
