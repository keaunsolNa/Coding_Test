package codingTestLevel0;

import java.util.Arrays;

public class Lessons89 {

	public static void main(String[] args) {
		int[][] score = {{93, 14}, {100, 100}, {100, 100}, {100, 100}, {0, 0}};
		int[] answer = solution(score);
		for (int i : answer) {
			System.out.println(i);
		}
		
	}
	// 등수 매기기
    public static int[] solution(int[][] score) {
    	double[] evr = new double[score.length];
    	
    	for(int i = 0; i < score.length; i++) {
    		evr[i] = (double)(score[i][0] + score[i][1])/2;
    	}
    	
    	double[] sortevr = evr.clone();
    	Arrays.sort(sortevr);
    	
    	int[] answer = new int[sortevr.length];
        for(int j = 0; j < sortevr.length; j++) {
        
            for(int i = 0; i < evr.length; i++) {
    			
    			if(sortevr[j]== evr[i] ) {
    				answer[i] = sortevr.length - j;
    			}
    		}
    	}
    	
        return answer;
    }
}