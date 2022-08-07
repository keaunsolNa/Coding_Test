package codingTest;

public class Lessons07 {

	public static void main(String[] args) {
		
		Lessons07 lessons07 = new Lessons07();
		
		int n = 3;
		int m = 12;
		
		int[] result = lessons07.solution(n, m);
		
	}
	
    public int[] solution(int n, int m) {
    	
    	int iNum = n;
    	int iNum2 = m;
    	int iNUm3 = n;
        int iNum4 = m;
        
    	while(iNUm3!=iNum4) {
			if(iNUm3>iNum4)
				iNUm3 = iNUm3-iNum4;
			else iNum4 = iNum4-iNUm3;
		} 
        
    	int GCD = iNum4;
    	
		int result = iNum*iNum2;
		
		while(iNum!=iNum2) {
			if(iNum>iNum2)
				iNum = iNum-iNum2;
			else iNum2 = iNum2-iNum;
		}
		
		int result2 = iNum2;
		
		int LCM = result/result2;
		
        int[] answer = {GCD, LCM};
        
        return answer;
    }
}
