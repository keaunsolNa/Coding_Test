import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        

        Map<String, Integer> wantMap = new HashMap<>();
		int answer = 0;
		
		for(int i = 0; i < discount.length; i++) {
			
			for(int idx = 0; idx < want.length; idx++) wantMap.put(want[idx], 0);
			
			for(int j = i; j < i + 10; j++) {
				
				if(j == discount.length) break;
                wantMap.put(discount[j], wantMap.getOrDefault(discount[j], 0) + 1);
				
            }
			
			boolean corect = true;
            
			for(int j = 0; j < want.length; j++) 
				if(wantMap.get(want[j]) < number[j]) { corect = false; break; }
				
			if(corect) answer++;
        }

        return answer;
    }
}