package codingTestLevel0;

import java.util.ArrayList;
import java.util.List;

public class Lessons37 {

	// 약수 구하기
    public int[] solution(int n) {
        
        List<Integer> arr = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if(n%i == 0){
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