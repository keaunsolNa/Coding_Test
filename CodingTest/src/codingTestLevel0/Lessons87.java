package codingTestLevel0;

public class Lessons87 {

	public static void main(String[] args) {
		System.out.println(solution(2, 5));
	}
	
	// 종이 자르기
    public static int solution(int M, int N) {
    	if(N == 1 && M == 1){
    		return 0;
    	} else {
    		return N*M - 1;
    	}
    }
}