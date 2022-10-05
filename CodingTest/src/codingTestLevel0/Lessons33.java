package codingTestLevel0;

public class Lessons33 {
	
	// 피자 나눠 먹기(1)
    public int solution(int n) {
        
        if(n%7 == 0){
            return n/7;
        } else {
            return n/7 + 1;
        }
    }
}