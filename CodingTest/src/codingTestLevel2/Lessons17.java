package codingTestLevel2;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Lessons17 {
	public static void main(String[] args) {

		Lessons17 lessons17 = new Lessons17();
		
		String[] info = {"java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150","cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"};
		String[] query = {"java and backend and junior and pizza 100","python and frontend and senior and chicken 200","cpp and - and senior and pizza 250","- and backend and senior and - 150","- and - and - and chicken 100","- and - and - and - 150"};

		int[] answer = lessons17.solution(info, query);

		for (int i : answer) {
			System.out.println("answer : " + i);
		}
		
	}
	
	public int[] solution(String[] info, String[] query) {
		
//		지원자가 지원서에 입력한 4가지의 정보와 획득한 코딩테스트 점수를 하나의 문자열로 구성한 값의 배열 info, 
//		개발팀이 궁금해하는 문의조건이 문자열 형태로 담긴 배열 query가 매개변수로 주어질 때,
//		각 문의조건에 해당하는 사람들의 숫자를 순서대로 배열에 담아 return 하도록 solution 함수를 완성해 주세요.

		Deque<String> queryArray = new LinkedList<>();
		List<String> infoArray = new ArrayList<>();
		
		for (String string : info) {
			infoArray.add(string.split(",")[0]);
		}
		
		for(String string : query) {
			string = string.replaceAll("and", "");
			string = string.replaceAll("-", "all");
			string = string.replaceAll("  ", " ");
			queryArray.add(string.split(",")[0]);
		}
		
		for (String string : infoArray) {
			System.out.println("INFO : " + string);
		}
		
		for (String string : queryArray) {
			System.out.println("QUERY : " + string);
		}
		
		int[] answer = new int[info.length];
		int cnt = 0;
		int people = 0;
		
		for(int i = 0; i < query.length; i++) {
			String queryPeek = queryArray.poll();
			System.out.println("FIRST_QUERY : " + queryPeek);
			
			for(int j = 0; j < infoArray.size(); j++) {
				String infoPeek = infoArray.get(j);
				System.out.println("FIRST_INFO : " + infoPeek);
				
				for(int k = 0; k < infoArray.get(j).split(" ").length; k++) {
				String infoPeekSplit = infoPeek.split(" ")[k];
				
				System.out.println("queryPeek : " + queryPeek.split(" ")[k]);
				System.out.println("infoPeekSplit : " + infoPeekSplit);
				
					if(k == infoArray.get(j).split(" ").length-1) {
						
						if(Integer.parseInt(infoPeekSplit) >= Integer.parseInt(queryPeek.split(" ")[k])) {
							System.out.println("일정 점수 이상");
							cnt++;
						} else {
							break;
						}
						
					} else if(queryPeek.split(" ")[k].equals("all") || queryPeek.split(" ")[k].equals(infoPeekSplit)) {
						System.out.println("일치");
						cnt++;
						
					} else {
						System.out.println("불일치");
						break;
						
					}
				}
				if(cnt == infoArray.get(j).split(" ").length) {
					System.out.println("일치하는 직원");
					cnt = 0;
					people++;
				} else {
					System.out.println("불일치하는 직원");
					cnt = 0;
				}
			}
			System.out.println("CNT: " + cnt);
			System.out.println("loop 종료");
			answer[i] = people;
			people = 0;
		}
        return answer;
    }
}
