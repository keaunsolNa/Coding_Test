package codingTestLevel2;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class Lessons34 {

	public static void main(String[] args) {

		Lessons34 lessons34 = new Lessons34();
		int[] prices = {1, 2, 3, 2, 3, 7};
		int[] answer = lessons34.solution(prices);

		for (int i : answer) {
			System.out.println("ANSER : " + i);
		}
		
	}

	public int[] solution(int[] prices) {
		
//		초 단위로 기록된 주식가격이 담긴 배열 prices가 매개변수로 주어질 때, 
//		가격이 떨어지지 않은 기간은 몇 초인지를 return 하도록 solution 함수를 완성하세요.

		Deque<Integer> pricesDeque = new LinkedList<>();
		int[] answer = new int [prices.length];
		int cnt = 0;
		int round = 0;
		for(int i = 0; i < prices.length; i++) {
			pricesDeque.add(prices[i]);
		}
				
		System.out.println(pricesDeque);
		
		while(!pricesDeque.isEmpty()) {
			
			int temp = pricesDeque.poll();
			System.out.println("TEMP : " + temp);
			System.out.println("pricesDequeSize : " + pricesDeque.size());
			
				for(Iterator<Integer> iter=pricesDeque.iterator(); iter.hasNext();) {
					cnt++;
					if(temp > iter.next()) {
						System.out.println("가격 하락");
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
	