package codingTestLevel2;

import java.util.Arrays;

public class Lessons07 {
	
	public static void main(String[] args) {

		Lessons07 lessons07 = new Lessons07();
		String s = "-1 22 3 4";
		
		String answer = lessons07.solution(s);
		
		System.out.println("result : " + answer);
	}

	
	public String solution(String s) {
	
//		문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다. 
//		str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를 "(최소값) (최대값)"형태의 문자열을 반환하는 함수, solution을 완성하세요.
//		예를들어 s가 "1 2 3 4"라면 "1 4"를 리턴하고, "-1 -2 -3 -4"라면 "-4 -1"을 리턴하면 됩니다.
		
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
