package codingTestLevel0;

public class Lessons25 {
	
	// 배열 원소의 길이
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = strlist[i].length();
        }
        return answer;
    }
}