package codingTestLevel2;

public class Lessons16 {
	public static void main(String[] args) {

		Lessons16 lessons16 = new Lessons16();
		
		int answer = lessons16.solution(15);

		System.out.println(answer);
	}
	
    public int solution(int n) {
    	
//    	Finn은 요즘 수학공부에 빠져 있습니다. 
//    	수학 공부를 하던 Finn은 자연수 n을 연속한 자연수들로 표현 하는 방법이 여러개라는 사실을 알게 되었습니다. 
//    	예를들어 15는 다음과 같이 4가지로 표현 할 수 있습니다.
//
//    	1 + 2 + 3 + 4 + 5 = 15
//    	4 + 5 + 6 = 15
//    	7 + 8 = 15
//    	15 = 15
//    	자연수 n이 매개변수로 주어질 때, 연속된 자연수들로 n을 표현하는 방법의 수를 return하는 solution를 완성해주세요.
    	
    	int num = 0;
    	int answer = 0;

    	for(int i = 1; i < (n/2)+1; i++ ) {
    		for(int j  = i; j < n; j++) {
    			if(num < n) {
    				num += j;
    				System.out.println("num < n, num? :" + num);
    			} else if(num == n) {
    				answer++;
    				num = 0;
    				System.out.println("num == n, answer? :" + answer);
    				break;
    			} else if(num > n) {
    				System.out.println("num > n, num? : " + num);
    				num = 0;
    				break;
    			}
    		}
    		System.out.println("loop end");
    	}
        
        System.out.println("ANSER : " + answer);
        return answer+1;
    }
}
