package codingTest;

import java.util.Arrays;

public class Lessons33 {

	public static void main(String[] args) {
		
		Lessons33 lessons33 = new Lessons33();
		long answer = lessons33.solution(118372);
		
		System.out.println("Result : " + answer);
	}
	
    public long solution(long n) {
    	
    	String number = n + "";
    	
    	char[] numberArr = number.toCharArray();
    	Arrays.sort(numberArr);

    	StringBuilder numberArrReverse = new StringBuilder(new String(numberArr));
    	
        long answer = Long.valueOf(String.valueOf(numberArrReverse.reverse()).trim());
        return answer;
    }
}
