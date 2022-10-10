package codingTestLevel0;

import java.util.Arrays;

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
        int[] answer = new int[num];
    	for(int i = 0; i < num; i++) {
    		sum += i;
    	}
    	
    	int keyNumber = 0;
    	while(sum != total) {
            sum += num;
            keyNumber++;
            if(sum > total){
            	
            	for(int i = 0; i < total; i++) {
            		keyNumber = i;
            		sum = i;
            		for(int j = i+1; j < total; j++) {
            			sum += j;
            			if(sum == total) {
            				break;
            			}
            		}
            		if(sum == total) {
            			break;
            		}
            	}
            	
            }
    	}
    	

        
        int cnt = 0;
        for(int i = keyNumber; i < keyNumber+num; i++) {
        	answer[cnt] = i;
        	cnt++;
        }
        
        Arrays.sort(answer);
        return answer;
    }
    
}