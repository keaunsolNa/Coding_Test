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

        int[] answer = new int[num];

        int key = total/num;
        int sum = 0;
        int cnt = 0;
        int keyNumber = 0;
        while(true) {
        	for(int i = key-num; i < key+num; i++) {
        		sum += i;
        		cnt++;
        		if(cnt == num) {
        			keyNumber = i;
        			break;
        		}
        	}
        	
        	if(sum == total) {
        		break;
        	} else {
        		key++;
        		cnt = 0;
        		sum = 0;
        	}
        }
        
        int answerCnt = 0;
        for(int i = keyNumber - (num-1); i <= keyNumber; i++) {
        	answer[answerCnt] = i;
        	answerCnt++;
        }
        return answer;
    }
    
}