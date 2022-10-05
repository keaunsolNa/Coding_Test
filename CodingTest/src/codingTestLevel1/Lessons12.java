package codingTestLevel1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Lessons12 {

	public static void main(String[] args) {
		
		Lessons12 lessons12 = new Lessons12();
		
		int[] numbers = {2,1,3,4,1,8,17,4,9};
		int[] result = lessons12.solution(numbers);
		
		for (int i : result) {
			System.out.println(i);
		}
	}
	
    public int[] solution(int[] numbers) {
    	
//    	정수 배열 numbers가 주어집니다. 
//    	numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 
//    	배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
    	
    	List<Integer> arrayOfNumbers = new ArrayList<>();
    	HashSet<Integer> totalArray = new HashSet<>();
    	int cnt = 0;
    	
    	for (Integer integer : numbers) {
			arrayOfNumbers.add(integer);
		}
    	
    	for(int i = 0; i < arrayOfNumbers.size(); i++) {
    		for(int j = 0; j < arrayOfNumbers.size() - 1; j++) {
    			if(i != j) {
    				totalArray.add(arrayOfNumbers.get(i) + arrayOfNumbers.get(j));
    			}
    		}
    	}
    	
    	int[] answer = new int[totalArray.size()];
    	Iterator<Integer> iter=totalArray.iterator();
    	
		while(iter.hasNext()) {
			answer[cnt++]=(int)iter.next();
		}
		
		Arrays.sort(answer);
		
        return answer;
    }
		
}
