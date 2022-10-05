package codingTestLevel0;

import java.util.ArrayList;
import java.util.List;

public class Lessons36 {

	// 짝수는 싫어요
    public int[] solution(int n) {
        
        List<Integer> arr = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if(i%2 != 0){
                arr.add(i);                
            }
        }
        int[] answer = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
			answer[i] = arr.get(i);
		}
        
        return answer;
    }
}