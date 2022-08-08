package codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lessons37 {

	public static void main(String[] args) {
		
		Lessons37 lessons37 = new Lessons37();
		int[] arr = {3, 2, 6};
		int divisor = 10;
		
		int[] answer = lessons37.solution(arr, divisor);
		
		for (int i : answer) {
			System.out.println("RESULT : " + i);
		}
		
	}
	
    public int[] solution(int[] arr, int divisor) {
    	
//    	array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
//    	divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
    	
    	List<Integer> arrList = new ArrayList<>();
    	
    	for(int i = 0; i < arr.length; i++) {
    		if(arr[i]%divisor == 0) {
    			arrList.add(arr[i]);
    		}
    	}
    	
    	int[] answer = new int[arrList.size()]; 
    	int count = 0;
    	
    	for (int i : arrList) {
    		answer[count] = i;
    		count++;
		}
    	
    	Arrays.sort(answer);
    	
    	if(answer.length == 0) {
    		answer = new int[1];
    		answer[0] = -1;
    	}
        return answer;
    }
}
