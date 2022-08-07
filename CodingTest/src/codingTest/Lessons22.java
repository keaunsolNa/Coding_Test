package codingTest;

public class Lessons22 {

	public static void main(String[] args) {

		Lessons22 lessons22 = new Lessons22();
		int answer = lessons22.solution(13, 17);
		
		System.out.println(answer);
	}

    public int solution(int left, int right) {
    	
//    	두 정수 left와 right가 매개변수로 주어집니다. 
//    	left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고, 
//    	약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.
    	int i = 0;
    	int divisor = 0;
    	int answer = 0;
    	
		for(i = left; i <= right; i++) {
			for(int j = 1; j <= i; j++) {
				if(i%j == 0) {
					divisor++;
				}
			}
			if(divisor%2 == 0) {
				System.out.println(" +  " + i);
				answer += i;
				divisor = 0;
			} else {
				System.out.println(" - " + i);
				answer -= i;
				divisor = 0;
			}
		}
    	
    	
        return answer;
    }
    
}
