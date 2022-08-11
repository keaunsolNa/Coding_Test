package codingTestLevel2;

public class Lessons01 {

	public static void main(String[] args) {

		Lessons01 lessons01 = new Lessons01();
		String answer = lessons01.solution(2);
		
		System.out.println("result : " + answer);
	}

	static StringBuilder sb = new StringBuilder();
	
    public String solution(int n) {
        String answer = "";
        
//        124 나라가 있습니다. 124 나라에서는 10진법이 아닌 다음과 같은 자신들만의 규칙으로 수를 표현합니다.
//
//        124 나라에는 자연수만 존재합니다.
//        124 나라에는 모든 수를 표현할 때 1, 2, 4만 사용합니다.
//        예를 들어서 124 나라에서 사용하는 숫자는 다음과 같이 변환됩니다.
//        10진법	124 나라	10진법	124 나라
//        1		1		6		14   
//        2		2		7		21   
//        3		4		8		22   
//        4		11		9		24   
//        5		12		10		41   
//        자연수 n이 매개변수로 주어질 때, n을 124 나라에서 사용하는 숫자로 바꾼 값을 return 하도록 solution 함수를 완성해 주세요.
	    
        if(n == 1) {
    		sb.append("1");
    	} else if(n == 2) {
    		sb.append("2");
    	} else if(n == 3 || n == 0) {
    		sb.append("4");
    	} else {
    		cal((n-1)/3);
    		cal(n%3);
    	}
		return sb.toString();
    }

	private String cal(int n) {
		
		solution(n);
		return sb.toString();
	}
    

}
