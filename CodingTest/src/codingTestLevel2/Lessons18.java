package codingTestLevel2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Lessons18 {
	static Map<String, List<Integer>> map = new HashMap<>();
	
	public static void main(String[] args) {

		Lessons18 lessons18 = new Lessons18();
		
		String[] info = {"java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150","cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"};
		String[] query = {"java and backend and junior and pizza 100","python and frontend and senior and chicken 200","cpp and - and senior and pizza 250","- and backend and senior and - 150","- and - and - and chicken 100","- and - and - and - 150"};

		int[] answer = lessons18.solution(info, query);

		for (int i : answer) {
			System.out.println("answer : " + i);
		}
		
	}
	
	public int[] solution(String[] info, String[] query) {
		
//		지원자가 지원서에 입력한 4가지의 정보와 획득한 코딩테스트 점수를 하나의 문자열로 구성한 값의 배열 info, 
//		개발팀이 궁금해하는 문의조건이 문자열 형태로 담긴 배열 query가 매개변수로 주어질 때,
//		각 문의조건에 해당하는 사람들의 숫자를 순서대로 배열에 담아 return 하도록 solution 함수를 완성해 주세요.
		int[] answer = new int[query.length];
		
		for(int i=0; i<info.length; i++) {
			makeSentenceArray(0, "", info[i].split(" "));
        }
		
		System.out.println(map);
		System.out.println(map.size());
		
		Iterator<String> iter = map.keySet().iterator();
		
		while(iter.hasNext()) {
			String key = iter.next();
			List<Integer> pointList = map.get(key);
			Collections.sort(pointList);
		}
		
		System.out.println(map);
		
		for(int i = 0; i <query.length; i++) {
			
			String[] queryArray = query[i].replaceAll(" and ", "").split(" ");
	        String key = queryArray[0];
	        String value = queryArray[1];
	        
	        System.out.println("InfoPoint : " + map.get(key));
	        System.out.println("QueryPoint : " + value);
	        
	        answer[i] = compareInfoAndQuery(map.get(key), Integer.parseInt(value));
	        
		}
		
		
        return answer;
    }

	
	public static void makeSentenceArray(int loop, String key, String[] info) {
        if(loop == 4) {
            if(map.containsKey(key)) {
                map.get(key).add(Integer.parseInt(info[4]));
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(Integer.parseInt(info[4]));
                map.put(key, list);
            }
            return;
        }

        makeSentenceArray(loop + 1, key + "-", info);
        makeSentenceArray(loop + 1, key + info[loop], info);
    }
	
	public static int compareInfoAndQuery(List<Integer> list, int target) {
        int start = 0;
        int end = list.size() - 1;

        while(start <= end) {
            int mid = (start + end) / 2;
            if(list.get(mid) >= target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return list.size() - start;
    }
	
}
