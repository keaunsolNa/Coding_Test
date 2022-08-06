package codingTest;

import java.util.Arrays;

public class Lessons6 {

	public static void main(String[] args) {
		
		Lessons6 lessons5 = new Lessons6();
		String s = "Zbzcdefg";
		String answer = lessons5.solution(s);
		System.out.println(answer);
	}
	
	public String solution(String s) {
		char[] strArray = s.toCharArray();
		
		Arrays.sort(strArray);

		StringBuilder answer = new StringBuilder(new String(strArray));
		
		
		return answer.reverse().toString();
	}

}
