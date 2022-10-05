package codingTestLevel1;

public class Lessons17 {

	public static void main(String[] args) {

		Lessons17 lessons17 = new Lessons17();
		long answer = lessons17.solution(3, 5);
		
		System.out.println(answer);
	}

    public long solution(int a, int b) {
    	
//    	두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
//    	예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.
    	long answer = 0;

    	if(a > b) {
    		for(int num = b; num <= a; num++) {
    			System.out.println("TEST1 : " + num);
    			answer += num;
    		}
    	} else {
    		for(int num = a; num <= b; num++) {
    			System.out.println("TEST2 : " + num);
    			answer += num;
    		}
    	}
        return answer;
    }
}
