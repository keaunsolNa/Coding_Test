import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[] queue1, int[] queue2) {

        long oneSum = 0;
		long twoSum = 0;
		int answer = 0;
		Queue<Integer> queueOne = new LinkedList<>();
		Queue<Integer> queueTwo = new LinkedList<>();
		
		for (int i : queue1) {
			oneSum += i;
			queueOne.add(i);
		}
		for (int i : queue2) {
			twoSum += i;
			queueTwo.add(i);
		}
		
		while(oneSum != twoSum) {
			answer++;

            if(oneSum > twoSum) {
            
                int value = queueOne.poll();
                oneSum -= value;
                twoSum += value;
                queueTwo.add(value);
            
            } else {
            
                int value = queueTwo.poll();
                oneSum += value;
                twoSum -= value;
                queueOne.add(value);
            
            }
            
            if(answer > (queue1.length + queue2.length) * 2) return -1;

        }
		
        return answer;
    }
}