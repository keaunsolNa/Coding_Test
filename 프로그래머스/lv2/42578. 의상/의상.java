import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[][] clothes) {
        int answer = clothes.length;
		
		Map<String, Integer> clothesmap = new HashMap<>();

        for(int i=0; i<clothes.length; i++) {
        	clothesmap.put(clothes[i][1], clothesmap.getOrDefault(clothes[i][1], 0) + 1);
        }
		
        if(clothesmap.size() > 1) {
        	
        	int count = 1;
        	
        	for(String key : clothesmap.keySet()) {
        		count *= clothesmap.get(key) + 1;
                System.out.println("count : " + count);
        	}
        	
        	answer = count - 1;
        } 
        
		return answer;
    }
}