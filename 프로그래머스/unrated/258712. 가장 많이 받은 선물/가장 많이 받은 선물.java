import java.util.*;

class Solution {
    
    public int solution(String[] friends, String[] gifts) {
        
        Map<String, Integer> friendsMap = new HashMap<>();
		for(int i = 0; i < friends.length; i++) friendsMap.put(friends[i], i);
		int fl = friends.length;
		int[][] giveMap = new int[fl][fl];
		int[] indices = new int[fl];
		
        for(int i = 0; i < gifts.length; i++) {
            
            int give = friendsMap.get(gifts[i].split(" ")[0]);
            int receive = friendsMap.get(gifts[i].split(" ")[1]);
            
            giveMap[give][receive]++;
            indices[give]++;
            indices[receive]--;
            
        }
        
        int[] nextGiveMap = new int[fl];

        for(int i = 0; i < giveMap.length; i++) {

        	for(int j = 0; j < giveMap[i].length; j++) {

                if(i == j) continue;
                
        		if(giveMap[i][j] == giveMap[j][i]) {
        			if(indices[j] > indices[i]) 
                        nextGiveMap[j]++;
        		} 
        		
        		else if(giveMap[i][j] > giveMap[j][i]) nextGiveMap[i]++;
        	}
				
        }        
        
        Arrays.sort(nextGiveMap);
        
        return nextGiveMap[nextGiveMap.length - 1];
    }
}