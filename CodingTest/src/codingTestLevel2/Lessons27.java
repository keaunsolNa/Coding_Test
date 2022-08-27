package codingTestLevel2;

import java.util.HashMap;
import java.util.Map;

public class Lessons27 {
	
	public static void main(String[] args) {

		Lessons27 lessons27 = new Lessons27();

		String[][] clothes = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
		int answer = lessons27.solution(clothes);

		System.out.println("Answer : " + answer);
		
	}

	public int solution(String[][] clothes) {
		
//		스파이들은 매일 다른 옷을 조합하여 입어 자신을 위장합니다.
//
//		예를 들어 스파이가 가진 옷이 아래와 같고 오늘 스파이가 동그란 안경, 긴 코트, 파란색 티셔츠를 입었다면 다음날은 청바지를 추가로 입거나 동그란 안경 대신 검정 선글라스를 착용하거나 해야 합니다.
//
//		종류	이름
//		얼굴	동그란 안경, 검정 선글라스
//		상의	파란색 티셔츠
//		하의	청바지
//		겉옷	긴 코트
//		스파이가 가진 의상들이 담긴 2차원 배열 clothes가 주어질 때 서로 다른 옷의 조합의 수를 return 하도록 solution 함수를 작성해주세요.

		int answer = clothes.length;
		
		Map<String, Integer> clothesmap = new HashMap<>();

        for(int i=0; i<clothes.length; i++) {
        	clothesmap.put(clothes[i][1], clothesmap.getOrDefault(clothes[i][1], 0) + 1);
        }
		
        System.out.println(clothesmap);
        System.out.println(clothesmap.keySet());
        if(clothesmap.size() > 1) {
        	
        	int count = 1;
        	
        	for(String key : clothesmap.keySet()) {
        		count *= clothesmap.get(key) + 1;
        		System.out.println("count : " + count);
        	}
        	
        	answer = count - 1;
        } 
        
		return answer;
	}
	
	
}
