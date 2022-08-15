package codingTestLevel2;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class Lessons12 {

	public static void main(String[] args) {

		Lessons12 lessons12 = new Lessons12();
		int[] people = {70, 50, 80, 50, 90, 40}; 
		int limit = 240;
		int answer = lessons12.solution(people, limit);
		
		System.out.println("RESULT : " + answer);
	}

	 public int solution(int[] people, int limit) {
		 
//		 무인도에 갇힌 사람들을 구명보트를 이용하여 구출하려고 합니다. 
//		 구명보트는 작아서 한 번에 최대 2명씩 밖에 탈 수 없고, 무게 제한도 있습니다.
//
//		 예를 들어, 사람들의 몸무게가 [70kg, 50kg, 80kg, 50kg]이고 구명보트의 무게 제한이 100kg이라면 2번째 사람과 4번째 사람은 같이 탈 수 있지만 
//		 1번째 사람과 3번째 사람의 무게의 합은 150kg이므로 구명보트의 무게 제한을 초과하여 같이 탈 수 없습니다.
//
//		 구명보트를 최대한 적게 사용하여 모든 사람을 구출하려고 합니다.
//
//		 사람들의 몸무게를 담은 배열 people과 구명보트의 무게 제한 limit가 매개변수로 주어질 때, 
//		 모든 사람을 구출하기 위해 필요한 구명보트 개수의 최솟값을 return 하도록 solution 함수를 작성해주세요.
				 
		 Deque<Integer> peopleStack = new ArrayDeque<>();
		 Integer[] tmp = Arrays.stream(people).boxed().toArray(Integer[]::new);
		 Arrays.sort(tmp, Comparator.reverseOrder());
		 Map<Integer, Integer> boot = new HashMap<>();
		 
		 for(int i = 0; i < tmp.length; i++) {
			 peopleStack.add(tmp[i]);
		 }
		 
		System.out.println("BEFORE : " + peopleStack);
		int cnt = 1;
		int maxpeople = 1;
		boot.put(cnt, peopleStack.removeFirst());
		
		while(peopleStack.size() != 0) {
			if(boot.get(cnt) + peopleStack.getLast() <= limit && maxpeople !=2) {

				boot.put(cnt, boot.get(cnt) + peopleStack.removeLast());
				maxpeople = 2;
				System.out.println("두 명 탑승 : " + peopleStack);
				System.out.println("보트 : " + boot);
					
			} else if(maxpeople == 2) {
				
				cnt++;
				boot.put(cnt, peopleStack.removeFirst());
				System.out.println("신규 한 명 탑승" + peopleStack);
				System.out.println("보트 : " + boot);
				maxpeople = 1;
				
			} else if(boot.get(cnt) + peopleStack.getLast() > limit) {
				
				cnt++;
				boot.put(cnt, peopleStack.removeFirst());
				System.out.println("신규 한 명 탑승" + peopleStack);
				System.out.println("보트 : " + boot);
				maxpeople = 1;
			} 
				
		}
		 
		System.out.println("AFTER : " + peopleStack);
		System.out.println(boot);
	    return cnt;
	 }
	 
}
