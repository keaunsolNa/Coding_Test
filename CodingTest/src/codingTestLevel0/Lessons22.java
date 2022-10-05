package codingTestLevel0;

public class Lessons22 {
	
	// 배열 뒤집기
    public int[] solution(int[] num_list) {
    	
        int[] answer = new int[num_list.length];
        
        for(int i = 0; i < num_list.length; i++) {
        	answer[answer.length - (i+1)] = num_list[i];
        }
        return answer;
    }
}