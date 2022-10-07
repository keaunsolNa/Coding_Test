package codingTestLevel0;

public class Lessons63 {
	
	public static void main(String[] args) {
		System.out.println(solution(50, 10));
	}
	
	// 구슬을 나누는 경우의 수
    public static long solution(int balls, int share) {
    	
        share = Math.min(balls - share, share);

        if (share == 0)
            return 1;

        long result = solution(balls - 1, share - 1);
        result *= balls;
        result /= share;

        return result;
    }
    
    
}