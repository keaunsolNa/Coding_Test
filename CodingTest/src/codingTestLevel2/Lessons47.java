package codingTestLevel2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lessons47 {

	Map<String, Integer> stringMap = new HashMap<>();
	List<String> stringList = new ArrayList<>();
	public static void main(String[] args) {

		Lessons47 lessons47 = new Lessons47();

		String[] orders = {"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"};
		int[] course = {2, 3, 5};
		
		String[] answer = lessons47.solution(orders, course);

		System.out.println("ANSER : " + answer);
		
	}
	
	public String[] solution(String[] orders, int[] course) {
		
//		레스토랑을 운영하던 스카피는 코로나19로 인한 불경기를 극복하고자 메뉴를 새로 구성하려고 고민하고 있습니다.
//		기존에는 단품으로만 제공하던 메뉴를 조합해서 코스요리 형태로 재구성해서 새로운 메뉴를 제공하기로 결정했습니다. 
//		어떤 단품메뉴들을 조합해서 코스요리 메뉴로 구성하면 좋을 지 고민하던 "스카피"는 이전에 각 손님들이 주문할 때 가장 많이 함께 주문한 단품메뉴들을 코스요리 메뉴로 구성하기로 했습니다.
//		단, 코스요리 메뉴는 최소 2가지 이상의 단품메뉴로 구성하려고 합니다. 또한, 최소 2명 이상의 손님으로부터 주문된 단품메뉴 조합에 대해서만 코스요리 메뉴 후보에 포함하기로 했습니다.
//
//		예를 들어, 손님 6명이 주문한 단품메뉴들의 조합이 다음과 같다면,
//		(각 손님은 단품메뉴를 2개 이상 주문해야 하며, 각 단품메뉴는 A ~ Z의 알파벳 대문자로 표기합니다.)
		
		
        String[] answer = {};
        
        for(int i = 0; i < orders.length; i++) {
        	String[] temp = orders[i].split("");
        	Arrays.sort(temp);
        	
        	for(int j = 0; j < temp.length; j++) {
        		for(int k = 0; k < course.length; k++) {
        			dfs(temp, j, 1, course[k], temp[j]);
        		}
        	}
        }
        
        System.out.println("TEST : " + stringMap);
        
        List<String> list = new ArrayList<>(stringMap.keySet());
        Collections.sort(list, new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				return stringMap.get(o2) - stringMap.get(o1);
			}
        });
        
        System.out.println("TEST : " + stringMap);

        for(int i = 0; i < course.length; i++) {
        	int max = 0;
        	
        	for(String courseMenu : list) {
        		if(stringMap.get(courseMenu)>1 && courseMenu.length() == course[i]) {
        			if(stringMap.get(courseMenu) >= max) {
        				stringList.add(courseMenu);
        				max = stringMap.get(courseMenu);
        			}
        		}
        	}
        }

        System.out.println(stringList);
        Collections.sort(stringList);
        
        answer = new String[stringList.size()];
        stringList.toArray(answer);
        
        return answer;
    }
	
	public void dfs(String[] temp, int tempIdx, int dept, int courseIdx, String tempStr) {
		if(dept == courseIdx) {
			if(stringMap.containsKey(tempStr)) {
				stringMap.put(tempStr, stringMap.get(tempStr) + 1);
			} else {
				stringMap.put(tempStr, 1);
			}
		}
		
		for(int i= tempIdx+1; i<temp.length; i++) {
			dfs(temp, i, dept+1, courseIdx, tempStr+temp[i]);
		}
	}
	
}
	