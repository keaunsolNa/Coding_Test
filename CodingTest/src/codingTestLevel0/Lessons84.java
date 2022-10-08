package codingTestLevel0;

public class Lessons84 {

	public static void main(String[] args) {
		System.out.println(solution(1, 13, 1));
	}
	
	// k의 개수
    public static int solution(int i, int j, int k) {
    	
    	int answer = 0;
    	for(int num = i; num <= j; num++) {
    		char[] temp = (num+"").toCharArray();
    		
    		for(int num2 = 0; num2 < temp.length; num2++) {
    			if(temp[num2] == k+'0') {
    				answer++;
    			}
    		}
    	}
        return answer;
    }
}