package codingTestLevel0;

public class Lessons64 {
	
	// 주사위의 개수
    public int solution(int[] box, int n) {
    	
    	int a = box[0]/n;
    	int b = box[1]/n;
    	int c = box[2]/n;
    	
        return a*b*c;
    }
    
    
}