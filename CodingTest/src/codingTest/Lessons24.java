package codingTest;

public class Lessons24 {

	public static void main(String[] args) {

		Lessons24 lessons24 = new Lessons24();
		int answer = lessons24.solution("-1234");
		
		System.out.println("Result : " + answer);
	}

    public int solution(String s) {
    	
//    	문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.
    	return Integer.parseInt(s);
    }
    
}
