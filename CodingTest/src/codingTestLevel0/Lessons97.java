package codingTestLevel0;

public class Lessons97 {

	public static void main(String[] args) {
		int[] a = solution(4, 14);
		for (int i : a) {
			System.out.println(i);
		}
		
	}
	
	// 연속된 수의 합
    public static int[] solution(int num, int total) {

    	long sum = 0;
    	for(int i = 0; i < num; i++) {
    		sum += i;
    	}
    	
    	int keyNumber = 0;
    	while(sum != total) {
    		if(sum*10 < total) {
    			sum += num*10;
    			keyNumber += 10;
    		} else {
    			sum += num;
    			keyNumber++;
    		}
    	}
    	
        int[] answer = new int[num];
        
        int cnt = 0;
        for(int i = keyNumber; i < keyNumber+num; i++) {
        	answer[cnt] = i;
        	cnt++;
        }
        
        return answer;
    }
    
}