package codingTestLevel0;

import java.util.ArrayList;
import java.util.List;

public class Lessons39 {

	// n의 배수 고르기
    public int[] solution(int n, int[] numlist) {
        
        List<Integer> arr = new ArrayList<>();
        
        for(int i = 0; i < numlist.length; i++) {
        	if(numlist[i] % n == 0) {
        		arr.add(numlist[i]);
        	}
        }
        
        int[] answer = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
			answer[i] = arr.get(i);
		}
        
        return answer;
    }
}