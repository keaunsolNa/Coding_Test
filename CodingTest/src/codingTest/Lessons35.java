package codingTest;

public class Lessons35 {

	public static void main(String[] args) {
		
		Lessons35 lessons35 = new Lessons35();
		boolean answer = lessons35.solution(10);
		
		System.out.println(answer);
	}
	
    public boolean solution(int x) {
    	
//    	양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 
//    	예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다. 
//    	자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
    	
    	String str = x + "";
    	int sum = 0;
    	
    	for(int i = 0; i < str.length(); i++) {
    		sum += Character.getNumericValue(str.charAt(i));  
    	}

    	if(x%sum != 0) {
    		return false;
    	} else {
    		return true;
    	}
    }
}
