package codingTest;

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
    	
//    	���� �迭 numbers�� �־����ϴ�. 
//    	numbers���� ���� �ٸ� �ε����� �ִ� �� ���� ���� �̾� ���ؼ� ���� �� �ִ� ��� ���� 
//    	�迭�� ������������ ��� return �ϵ��� solution �Լ��� �ϼ����ּ���.
    	
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
