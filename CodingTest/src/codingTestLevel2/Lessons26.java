package codingTestLevel2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Lessons26 {
	
	public static void main(String[] args) {

		Lessons26 lessons26 = new Lessons26();
		
		String[][] relation = {{"100","ryan","music","2"},{"200","apeach","math","2"},{"300","tube","computer","3"},{"400","con","computer","4"},{"500","muzi","music","3"},{"600","apeach","music","2"}};
		int answer = lessons26.solution(relation);

		System.out.println(answer);
		
	}

    public int solution(String[][] relation) {
        int answer = 0;
        Set<String> hashSet = new HashSet<>();
        List<String> arrList = new ArrayList<>();
        Map<Integer, List<String>> relationMap = new HashMap<>();
        String[] column = new String[relation[1].length];
        int loop = 1;
        
        while(loop != relation[1].length) {
        	for(int i = 0; i < relation.length; i++){
        		arrList.add(relation[i][loop]);
        		continue;
        	}
        	relationMap.put(loop, arrList);
        	arrList = new ArrayList<>();
        	loop++;
        }
        
        System.out.println(relationMap);
        
        for(int i = 1; i < relationMap.size() + 1; i++) {
        	for(int j = 0; j < relationMap.get(i).size(); j++) {
        		hashSet.add(relationMap.get(i).get(j));
        	}
        	if(relationMap.get(i).size() == hashSet.size()) {
        		System.out.println("중복값 없음");
        		answer++;
        		relationMap.remove(i);
        	}
        }
        // 포기...
        return answer+1;
    }
	
	
}
