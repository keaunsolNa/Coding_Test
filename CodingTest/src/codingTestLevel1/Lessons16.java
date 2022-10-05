package codingTestLevel1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Lessons16 {

	public static void main(String[] args) {

		Lessons16 lessons16 = new Lessons16();
		int[] arr = {1, 1, 3, 3, 0, 1, 1};
		int[] answer = lessons16.solution(arr);
		
		for (int i : answer) {
			System.out.println("ANSWER : " + i);
		}
	}

    public int[] solution(int []arr) {
       
//    	배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다. 이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다. 단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다. 예를 들면,
//
//    	arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
//    	arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
//    	배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.

    	int[] answer = {};	
    	List<Integer> arrayList = new ArrayList<>();

    	int i = -1;
    	
    	for(int j = 0; j < arr.length; j++) {
    		if(arr[j] != i) {
    			arrayList.add(arr[j]);
    			i = arr[j];
    		}
    	}
    	
    	System.out.println(arrayList);
    	
    	answer = new int[arrayList.size()];
    	
    	for(int j = 0; j < arrayList.size(); j++) {
    		answer[j] = arrayList.get(j);
    	}
    	
        return answer;
    }
}
