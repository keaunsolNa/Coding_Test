package codingTestLevel2;

public class Lessons53 {
	
	public static void main(String[] args) {

		Lessons53 lessons53 = new Lessons53();

		long[] numbers = {2, 7};
		
		long[] answer = lessons53.solution(numbers);

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
		if(a%2 == 0) {
			return a+1;
		} else {
			
			String binaryStr = Long.toString(a , 2);
			System.out.println(binaryStr);
			int index = binaryStr.lastIndexOf("0");
			if(index != -1) {
				binaryStr = binaryStr.substring(0, index) + "10" + binaryStr.substring(index+2, binaryStr.length());
				return Long.parseLong(binaryStr, 2);
			} else {
				binaryStr = "10" + binaryStr.substring(1, binaryStr.length());
				return Long.parseLong(binaryStr, 2);
			}
		}
	}
}