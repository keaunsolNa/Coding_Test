package codingTestLevel2;

public class Lessons06 {
	
	public static void main(String[] args) {

		Lessons06 lessons06 = new Lessons06();
		int n = 78;
		
		int answer = lessons06.solution(n);
		
		System.out.println("result : " + answer);
	}

	
	public int solution(int n) {
		
//		자연수 n이 주어졌을 때, n의 다음 큰 숫자는 다음과 같이 정의 합니다.
//
//		조건 1. n의 다음 큰 숫자는 n보다 큰 자연수 입니다.
//		조건 2. n의 다음 큰 숫자와 n은 2진수로 변환했을 때 1의 갯수가 같습니다.
//		조건 3. n의 다음 큰 숫자는 조건 1, 2를 만족하는 수 중 가장 작은 수 입니다.
//		예를 들어서 78(1001110)의 다음 큰 숫자는 83(1010011)입니다.
//
//		자연수 n이 매개변수로 주어질 때, n의 다음 큰 숫자를 return 하는 solution 함수를 완성해주세요.

		int loopEnd = 0;
		int temp = n+1;
		int result = 0;
		String binaryNumber = Integer.toBinaryString(n);
		int dupOne = binaryNumber.length() - binaryNumber.replace(String.valueOf("1"), "").length();
		
		while(loopEnd == 0) {
			result = binary(temp, dupOne);
			if(result != 0) {
				if(temp > n) {
					break;
				}
				temp++;
			}
			temp++;
		}
		
        return temp;
    }
	
	public int binary(int temp, int dupOne) {
		
		int result = 0;
		String binaryNumber = Integer.toBinaryString(temp);
		System.out.println("temp : " + temp);
		System.out.println("binaryNumber2 : " + binaryNumber);
		
		int dupOne2 = binaryNumber.length() - binaryNumber.replace(String.valueOf("1"), "").length();
		
		System.out.println("dupOne : " + dupOne);
		System.out.println("dupOne2 : " + dupOne2);
		
		if(dupOne == dupOne2) {
			result = 1;
		}
		
		return result;
		
	}

}
