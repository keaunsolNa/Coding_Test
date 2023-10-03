import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        
		int[] answer = new int[score.length];
		ArrayList<Integer> honor = new ArrayList<>();
		
		for(int i = 0; i < score.length; i++) {
			
			if(honor.size() < k) {
				honor.add(score[i]);
				Collections.sort(honor);
				answer[i] = honor.get(0);
				continue;
			}
			
			if(honor.size() == k) {
				int min = honor.get(0);
				
				if(min < score[i]) {
					honor.remove(0);
					honor.add(score[i]);
					Collections.sort(honor);
				}
				
				answer[i] = honor.get(0);
			}
		}
        return answer;
    }
}