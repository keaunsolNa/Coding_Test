package codingTestLevel0;

import java.util.Arrays;

public class Lessons61 {
	
	public static void main(String[] args) {
		int[] a = {3, 76, 24};
		solution(a);
	}
	// 진료 순서 정하기
    public static int[] solution(int[] emergency) {
    	
    	int[] arrSort = emergency.clone();
    	int[] answer = new int[emergency.length];
    	Arrays.sort(arrSort);
    	
    	for(int i = 0; i < emergency.length; i++) {
    		for(int j = 0; j < arrSort.length; j++) {
    			if(emergency[i] == arrSort[j]) {
    				answer[i] = arrSort.length - j;
    			}
    		}
    	}
        return answer;
    }
    
}