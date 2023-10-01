import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        
		Map<String, Integer> playerMap = new HashMap<>();
        for(int i = 0; i < players.length; i++) playerMap.put(players[i], i);
        
        for(String player : callings){
        
        	int rank = playerMap.get(player);
        	String front = players[rank - 1];
        	
        	players[rank - 1] = player;
        	players[rank] = front;
        	
        	playerMap.put(player, rank - 1);
        	playerMap.put(front, rank);
        	
        }
        return players;
    }
}