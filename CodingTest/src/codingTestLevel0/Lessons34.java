package codingTestLevel0;

public class Lessons34 {
	
	// 제곱수 판별하기
    public int solution(int n) {
    	
    	String a = Math.sqrt(n) + "";

    	System.out.println(a);
    	String[] temp = a.split("[.]");

    	if(temp[1].length() > 1) {
    		return 2;
    	} else {
    		return 1;
    	}
    }
}