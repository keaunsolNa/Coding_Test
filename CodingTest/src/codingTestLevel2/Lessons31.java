package codingTestLevel2;

import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class Lessons31 {
	Deque<String> strDequeUnionAll = new LinkedList<>();
	Deque<String> strDequeIntersection = new LinkedList<>();
	Set<String> strSetUnion = new HashSet();
	public static void main(String[] args) {

		Lessons31 lessons31 = new Lessons31();

		int answer = lessons31.solution("aa1+aa2", "AAAA12");

		System.out.println("Answer : " + answer);
		
	}
	
	public int solution(String str1, String str2) {
		
//		여러 언론사에서 쏟아지는 뉴스, 특히 속보성 뉴스를 보면 비슷비슷한 제목의 기사가 많아 정작 필요한 기사를 찾기가 어렵다. 
//		Daum 뉴스의 개발 업무를 맡게 된 신입사원 튜브는 사용자들이 편리하게 다양한 뉴스를 찾아볼 수 있도록 문제점을 개선하는 업무를 맡게 되었다.
//
//		개발의 방향을 잡기 위해 튜브는 우선 최근 화제가 되고 있는 "카카오 신입 개발자 공채" 관련 기사를 검색해보았다.
//
//		카카오 첫 공채..'블라인드' 방식 채용
//		카카오, 합병 후 첫 공채.. 블라인드 전형으로 개발자 채용
//		카카오, 블라인드 전형으로 신입 개발자 공채
//		카카오 공채, 신입 개발자 코딩 능력만 본다
//		카카오, 신입 공채.. "코딩 실력만 본다"
//		카카오 "코딩 능력만으로 2018 신입 개발자 뽑는다"
//		기사의 제목을 기준으로 "블라인드 전형"에 주목하는 기사와 "코딩 테스트"에 주목하는 기사로 나뉘는 걸 발견했다. 
//		튜브는 이들을 각각 묶어서 보여주면 카카오 공채 관련 기사를 찾아보는 사용자에게 유용할 듯싶었다.
//
//		유사한 기사를 묶는 기준을 정하기 위해서 논문과 자료를 조사하던 튜브는 "자카드 유사도"라는 방법을 찾아냈다.
//
//		자카드 유사도는 집합 간의 유사도를 검사하는 여러 방법 중의 하나로 알려져 있다. 
//		두 집합 A, B 사이의 자카드 유사도 J(A, B)는 두 집합의 교집합 크기를 두 집합의 합집합 크기로 나눈 값으로 정의된다.
//
//		예를 들어 집합 A = {1, 2, 3}, 집합 B = {2, 3, 4}라고 할 때, 교집합 A ∩ B = {2, 3}, 합집합 A ∪ B = {1, 2, 3, 4}이 되므로, 
//		집합 A, B 사이의 자카드 유사도 J(A, B) = 2/4 = 0.5가 된다. 
//		집합 A와 집합 B가 모두 공집합일 경우에는 나눗셈이 정의되지 않으니 따로 J(A, B) = 1로 정의한다.
//
//		자카드 유사도는 원소의 중복을 허용하는 다중집합에 대해서 확장할 수 있다. 다중집합 A는 원소 "1"을 3개 가지고 있고, 
//		다중집합 B는 원소 "1"을 5개 가지고 있다고 하자. 이 다중집합의 교집합 A ∩ B는 원소 "1"을 min(3, 5)인 3개, 
//		합집합 A ∪ B는 원소 "1"을 max(3, 5)인 5개 가지게 된다. 
//		다중집합 A = {1, 1, 2, 2, 3}, 다중집합 B = {1, 2, 2, 4, 5}라고 하면, 
//		교집합 A ∩ B = {1, 2, 2}, 합집합 A ∪ B = {1, 1, 2, 2, 3, 4, 5}가 되므로, 
//		자카드 유사도 J(A, B) = 3/7, 약 0.42가 된다.
//
//		이를 이용하여 문자열 사이의 유사도를 계산하는데 이용할 수 있다. 문자열 "FRANCE"와 "FRENCH"가 주어졌을 때, 이를 두 글자씩 끊어서 다중집합을 만들 수 있다. 
//		각각 {FR, RA, AN, NC, CE}, {FR, RE, EN, NC, CH}가 되며, 교집합은 {FR, NC}, 합집합은 {FR, RA, AN, NC, CE, RE, EN, CH}가 되므로, 
//		두 문자열 사이의 자카드 유사도 J("FRANCE", "FRENCH") = 2/8 = 0.25가 된다.
		
        String match = "[^A-Z]";
        
        str1 = str1.toUpperCase().replaceAll(match, "");
        str2 = str2.toUpperCase().replaceAll(match, "");

        union(str1);
        union(str2);
        System.out.println("strDequeUnionAll : " + strDequeUnionAll);
        
        intersection(strDequeUnionAll);
        System.out.println("strDequeIntersectionSize : " + strDequeIntersection.size());
        System.out.println("strSetUnionSize : " + strSetUnion.size());
        double jaccardIndex = (double)strDequeIntersection.size()/(double)strSetUnion.size();
        
        System.out.println("jaccardIndex : " + jaccardIndex);
        return (int)Math.ceil(jaccardIndex*65536);
    }
	
	public void union(String str){
		
		char[] charArr = str.toCharArray();
		
		for (int i = 0; i < charArr.length -1; i++) {
			strDequeUnionAll.add("" + charArr[i] + charArr[i+1]);
			strSetUnion.add("" + charArr[i] + charArr[i+1]);
		}
		
	}
	
	public void intersection(Deque<String> strDequeUnionAll) {
		
		for(int i = 0; i < strDequeUnionAll.size(); i++) {
			String temp = strDequeUnionAll.poll();
			for(Iterator<String> iter=strDequeUnionAll.iterator(); iter.hasNext();) {
				if(temp.equals(iter.next())) {
					strDequeIntersection.add(temp);
					break;
				} 
			}
			
		}
		
	}
}
