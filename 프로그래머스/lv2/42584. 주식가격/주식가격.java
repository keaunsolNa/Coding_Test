import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

class Solution {
    public int[] solution(int[] prices) {
        
		Deque<Integer> pricesDeque = new LinkedList<>();
		int[] answer = new int [prices.length];
		int cnt = 0;
		int round = 0;
        
		for(int i = 0; i < prices.length; i++) {
			pricesDeque.add(prices[i]);
		}
				
		
		while(!pricesDeque.isEmpty()) {
			
			int temp = pricesDeque.poll();
			
				for(Iterator<Integer> iter=pricesDeque.iterator(); iter.hasNext();) {
					cnt++;
					if(temp > iter.next()) {
						break;
					}
				}
				
			answer[round] = cnt;
			cnt = 0;
			round++;
		}
		
       
        return answer;
    }
}