package codingTestLevel2;

public class Lessons52 {
	
	public static void main(String[] args) {

		Lessons52 lessons52 = new Lessons52();

		long[] numbers = {2, 7};
		
		long[] answer = lessons52.solution(numbers);

		System.out.println(answer);
		
	}
	
	public long[] solution(long[] numbers) {

// 		2개 이하로 다른 비트
		
//		양의 정수 x에 대한 함수 f(x)를 다음과 같이 정의합니다.
//
//		x보다 크고 x와 비트가 1~2개 다른 수들 중에서 제일 작은 수
//		예를 들어,
//
//		f(2) = 3 입니다. 다음 표와 같이 2보다 큰 수들 중에서 비트가 다른 지점이 2개 이하이면서 제일 작은 수가 3이기 때문입니다.
//		수	비트	다른 비트의 개수
//		2	000...0010	
//		3	000...0011	1
//		f(7) = 11 입니다. 다음 표와 같이 7보다 큰 수들 중에서 비트가 다른 지점이 2개 이하이면서 제일 작은 수가 11이기 때문입니다.
//		수	비트	다른 비트의 개수
//		7	000...0111	
//		8	000...1000	4
//		9	000...1001	3
//		10	000...1010	3
//		11	000...1011	2
//		정수들이 담긴 배열 numbers가 매개변수로 주어집니다. 
//		numbers의 모든 수들에 대하여 각 수의 f 값을 배열에 차례대로 담아 return 하도록 solution 함수를 완성해주세요.
				
		long[] answer = new long[numbers.length];
		for(int i = 0; i < numbers.length; i++) {
			long a = function(numbers[i]);
			System.out.println("MINI : " + a);
			answer[i] = a;
		}
		
        return answer;
    }
	
	public long function(long a) {
		
		StringBuilder binaryBuilder = new StringBuilder();
		char[] binary = Long.toBinaryString(a).toCharArray();
		for (char c : binary) {
			binaryBuilder.append(c);
		}
		
		for(long i = a + 1; i > 1; i++) {
			StringBuilder binaryBuilder2 = new StringBuilder();
			char[] binary2 = Long.toBinaryString(i).toCharArray();
			for(char c : binary2) {
				binaryBuilder2.append(c);
			}
			
			if(binaryBuilder.length() < binaryBuilder2.length()) {
				while(binaryBuilder.length() != binaryBuilder2.length()) {
					binaryBuilder.insert(0, 0);
				}
			} else if(binaryBuilder.length() > binaryBuilder2.length()) {
				while(binaryBuilder.length() != binaryBuilder2.length()) {
					binaryBuilder2.insert(0,0);
				}
			}
			int cnt = 0;
			System.out.println("BINARYBUFFER : " + binaryBuilder.toString());
			System.out.println("BINARYBUFFER2 : " + binaryBuilder2.toString());
			for(int j = 0; j < binaryBuilder.length(); j++) {
				if(binaryBuilder.charAt(j) != binaryBuilder2.charAt(j)) {
					cnt++;
					if(cnt > 2) {
						break;
					}
				}
			}
			if(cnt <= 2) {
				return i;
			}
		}
		return 1;
	}
}