package codingTestLevel2;

import java.util.Arrays;

public class Lessons07 {
	
	public static void main(String[] args) {

		Lessons07 lessons06 = new Lessons07();
		String s = "-1 22 3 4";
		
		String answer = lessons06.solution(s);
		
		System.out.println("result : " + answer);
	}

	
	public String solution(String s) {
		
		String[] stringArray = s.split(" ");
		int[] intArray = new int[stringArray.length];
		
		for (int i = 0; i < stringArray.length; i++) {
			int a = Integer.parseInt(stringArray[i]);
			intArray[i] = a;
		}
		
		Arrays.sort(intArray);

		for (int i : intArray) {
			System.out.println(i);
		}
		
		String answer = intArray[0] + " " + intArray[intArray.length-1];
	    return answer;
	    }

}
