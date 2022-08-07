package codingTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Lessons16 {

	public static void main(String[] args) {

		Lessons16 lessons16 = new Lessons16();
		int[] arr = {1, 1, 3, 3, 0, 1, 1};
		int[] answer = lessons16.solution(arr);
		
		for (int i : answer) {
			System.out.println(i);
		}
	}

    public int[] solution(int []arr) {
       
//    	배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다. 
//    	이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다. 
//    	단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다. 예를 들면,
//
//    	arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
//    	arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
//    	배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.
  	
    	
        List<Integer> arrayOfNumbers = new ArrayList<>();
        
        for (Integer integer : arr) {
			arrayOfNumbers.add(integer);
		}
        System.out.println("BEFORE : " + arrayOfNumbers);
        
        Iterator<Integer> iter=arrayOfNumbers.iterator();

        
        
        for(int i = 1; i < arrayOfNumbers.size(); i++) {
        	if(arrayOfNumbers.get(i) == arrayOfNumbers.get(i -1)) {
        		System.out.println("제거 문자열 : " + arrayOfNumbers.get(i) + " 인덱스 : " + i);
        		arrayOfNumbers.remove(i);
        	}
        }
        
        System.out.println("RESULT : " + arrayOfNumbers);
        
        int[] answer = arrayOfNumbers.stream()
                .filter(i -> i != null)
                .mapToInt(i -> i)
                .toArray();
        		
        return answer;
    }
}
