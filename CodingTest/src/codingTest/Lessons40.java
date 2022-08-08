package codingTest;

public class Lessons40 {

	public static void main(String[] args) {
		
		Lessons40 lessons40 = new Lessons40();
		long[] answer = lessons40.solution(2, 5);
		
		for (long l : answer) {
			System.out.println(l);
		}
		
	}
	
	public long[] solution(int x, int n) {
		
//		함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 
//		다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
		
		
        long[] answer = new long[n];
        
        for(long a = 0; a < n; a++) {
        	answer[(int) a] = x*(a+1);  
        }
        
        return answer;
    }
}
