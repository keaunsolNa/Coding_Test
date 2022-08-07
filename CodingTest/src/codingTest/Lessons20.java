package codingTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lessons20 {

	public static void main(String[] args) {

		Lessons20 lessons20 = new Lessons20();
		int[] arr = {4,3,2,1};
		int[] answer = lessons20.solution(arr);

		for (int i : answer) {
			System.out.println("RESULT : " + i);
		}
	}

    public int[] solution(int[] arr) {
    	
//    	정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 
//    	단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 
//    	예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
    	
    	List<Integer> arrList = new ArrayList<>();
    	
    	for (Integer integer : arr) {
    		arrList.add(integer);
		}
    	
    	if(arrList.size() != 1) {
    		int min = Collections.min(arrList);
    		int index = arrList.indexOf(min);
    		arrList.remove(index);
    	} else {
    		arrList.remove(0);
    		arrList.add(-1);
    	}
    	
        int[] answer = new int[arrList.size()];
    	
        for(int a = 0; a < arrList.size(); a++) {
        	answer[a] = arrList.get(a);
        }
        
        return answer;
    }
    
}
