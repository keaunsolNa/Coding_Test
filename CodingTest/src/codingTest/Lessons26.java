package codingTest;

import java.util.ArrayList;
import java.util.List;

public class Lessons26 {

	public static void main(String[] args) {

		Lessons26 lessons26 = new Lessons26();
		String[] seoul = {"Jane", "Kim"};
		String answer = lessons26.solution(seoul);
		
		System.out.println("Result : " + answer);
	}

    public String solution(String[] seoul) {
    	
//    	String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아, "김서방은 x에 있다"는 String을 반환하는 함수, solution을 완성하세요. 
//    	seoul에 "Kim"은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.
    	int x = 0;
    	List<String> strList = new ArrayList<>();
    	
    	for (String string : seoul) {
			strList.add(string);
		}
    	
    	x = strList.indexOf("Kim");
    	
        String answer = "김서방은 "+x+"에 있다";
        return answer;
    }
    
}
