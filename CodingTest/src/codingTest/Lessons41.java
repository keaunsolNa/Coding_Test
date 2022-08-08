package codingTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Lessons41 {

	public static void main(String[] args) {
		
		Lessons41 lessons41 = new Lessons41();
		int[] answer = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
		int[] result = lessons41.solution(answer);
		
		for (int i : result) {
			System.out.println(i);
		}
		
	}
	
    public int[] solution(int[] answers) {
    	
//    	수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.
//
//    	1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
//    	2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
//    	3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
//
//    	1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.
    	int[] oneAnswer = {1, 2, 3, 4, 5};
    	int[] twoAnswer = {2, 1, 2, 3, 2, 4, 2, 5};
    	int[] threeAnswer = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    	
    	int oneScore = 0;
    	int twoScore = 0;
    	int threeScore = 0;
    	
    	for(int i = 0; i < answers.length; i++) {
    		
    		if(oneAnswer[i%5] == answers[i]) {
    			oneScore++;
    		} 
    		if(twoAnswer[i%8] == answers[i]) {
    			twoScore++;
    		} 
    		if(threeAnswer[i%10] == answers[i]) {
    			threeScore++;
    		}
    	}
    	
    	int max = Math.max(Math.max(oneScore,twoScore), threeScore);
    	
    	List<Integer> list = new ArrayList<>();
    	if(oneScore == max) {
    		list.add(1);
    	}
    	if(twoScore == max) {
    		list.add(2);
    	} 
    	if(threeScore == max) {
    		list.add(3);
    	}
    	if(list.isEmpty()) {
    		return new int[] {1,2,3};
    	}
    	
    	int[] answer = new int[list.size()];
    	for(int i=0; i <list.size(); i++) {
    		answer[i] = list.get(i);
    	}
		return answer;
    }
}
