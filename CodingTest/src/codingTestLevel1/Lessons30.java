package codingTestLevel1;

public class Lessons30 {

	public static void main(String[] args) {

		Lessons30 lessons30 = new Lessons30();
		int answer = lessons30.solution(10);
		
		System.out.println("Result : " + answer);
	}

    public int solution(int n) {
//    	1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
//
//    	소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
//    	(1은 소수가 아닙니다.)
    	int count = 0;
    	
        for(int i = 2; i <= n; i++) {
            boolean isPrimeNumber = true;
            
            for(int j = 2; j <= Math.sqrt(i); j++) {
                if(i%j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
            if(isPrimeNumber) {
            	count++;
            }
        }
    	
        return count;
    }
    

}