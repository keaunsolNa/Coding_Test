package codingTestLevel2;

import java.util.LinkedList;
import java.util.List;

public class Lessons45 {

	public static void main(String[] args) {

		Lessons45 lessons45 = new Lessons45();

		int cacheSize = 5;
		String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};
		
		int answer = lessons45.solution(cacheSize, cities);

		System.out.println("ANSER : " + answer);
		
	}
	
	List<String> citiesList = new LinkedList<>();
	public int solution(int cacheSize, String[] cities) {

		
//		지도개발팀에서 근무하는 제이지는 지도에서 도시 이름을 검색하면 해당 도시와 관련된 맛집 게시물들을 데이터베이스에서 읽어 보여주는 서비스를 개발하고 있다.
//		이 프로그램의 테스팅 업무를 담당하고 있는 어피치는 서비스를 오픈하기 전 각 로직에 대한 성능 측정을 수행하였는데, 
//		제이지가 작성한 부분 중 데이터베이스에서 게시물을 가져오는 부분의 실행시간이 너무 오래 걸린다는 것을 알게 되었다.
//		어피치는 제이지에게 해당 로직을 개선하라고 닦달하기 시작하였고, 
//		제이지는 DB 캐시를 적용하여 성능 개선을 시도하고 있지만 캐시 크기를 얼마로 해야 효율적인지 몰라 난감한 상황이다.
//
//		어피치에게 시달리는 제이지를 도와, DB 캐시를 적용할 때 캐시 크기에 따른 실행시간 측정 프로그램을 작성하시오.
		
//		캐시 교체 알고리즘은 LRU(Least Recently Used)를 사용한다.
//		cache hit일 경우 실행시간은 1이다.
//		cache miss일 경우 실행시간은 5이다.
		
		/**
		 * cities 배열을 cacheSize 크기의 Queue에 담는다.
		 * Queue의 Size가 cacheSize를 초과하면 가장 먼저 입력된 값(오래된 값)을 꺼낸다. 
		 * 단, 이 때 새로 입력된 값이 Queue에 있으면(cache hit) 실행시간을 1 더하고
		 * 없으면(cache miss) 5를 더한다. 
		 * 최초 입력시는 cache miss로 계산한다.
		 */
		
		int answer = 0;

		if(cacheSize == 0) {
			return 5*cities.length;
		}
		
		for(int i = 0; i < cities.length; i++) {
			answer += isHit(cities[i].toLowerCase(), cacheSize);
			System.out.println("citiesList : " + citiesList );
		}
        
        return answer;
        
    }
	
	public int isHit(String cities, int cacheSize) {
		
		System.out.println("SIZE : " + citiesList.size());
		
		if (citiesList.size() < cacheSize) {
			if(citiesList.contains(cities)) {
				citiesList.remove(cities);
				citiesList.add(citiesList.size(), cities);
				return 1;
			} else {
				citiesList.add(cities);
				return 5;
			}
		}
		
		
		
		if(citiesList.contains(cities)) {
			System.out.println("일치 도시 있음");
			citiesList.remove(cities);
			citiesList.add(citiesList.size(), cities);
			return 1;
		} else {
			citiesList.remove(0);
			citiesList.add(cities);
			return 5;
		}
	}
	
}
	