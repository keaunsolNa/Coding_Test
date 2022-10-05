package codingTestLevel1;

import java.util.ArrayList;
import java.util.Collections;

public class Lessons46 {

	public static void main(String[] args) {
		
		Lessons46 lessons46 = new Lessons46();
		String[] strings = {"sun", "bed", "car"};
		int n = 1;
		String[] result = lessons46.solution(strings, n);
		
		for (String string : result) {
			System.out.println(string);
		}
		
	}
	
    public String[] solution(String[] strings, int n) {
    	
//    	문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다. 
//    	예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면 각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.

    	String[] answer = {};
    	ArrayList<String> stringsList = new ArrayList<>();
    	for(int i = 0; i < strings.length; i++) {
    		stringsList.add("" + strings[i].charAt(n) + strings[i]);
    	}
    	
    	Collections.sort(stringsList);
    	answer = new String[stringsList.size()];
    	
    	for(int i = 0; i < stringsList.size(); i++) {
    		answer[i] = stringsList.get(i).substring(1, stringsList.get(i).length());
    	}
  
    	
        return answer;
    }
}
