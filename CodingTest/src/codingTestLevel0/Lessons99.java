package codingTestLevel0;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Lessons99 {
	private static int answer = 0;
	public static void main(String[] args) {
		int[][] lines = {{1, -1}, {1, 3}, {9, 3}};
		int answer = solution(lines);

		System.out.println(answer);
	}
	
	// 겹치는 선분의 길이
    public static int solution(int[][] lines) {

    	Map<String, Integer> hashMap = new HashMap<>();
    	HashSet<String> arrHash = new HashSet<>();
    	int AStart = Math.min(lines[0][0], lines[0][1]);
    	int AEnd = Math.max(lines[0][0], lines[0][1]);
    	int BStart = Math.min(lines[1][0], lines[1][1]);
    	int BEnd = Math.max(lines[1][0], lines[1][1]);
    	int CStart = Math.min(lines[2][0], lines[2][1]);
    	int CEnd = Math.max(lines[2][0], lines[2][1]);
    	
    	// 첫 번째 줄 범위
    	for(int i = AStart; i < AEnd; i++) {
    		hashMap.put(i + "=" + (i+1), hashMap.getOrDefault(i + "=" + (i+1), 0) + 1);
    		if(hashMap.get(i + "=" + (i+1)) == 2) arrHash.add(i + "=" + (i+1));
    	}
    	
    	for(int i = BStart; i < BEnd; i++) {
    		hashMap.put(i + "=" + (i+1), hashMap.getOrDefault(i + "=" + (i+1), 0) + 1);
    		if(hashMap.get(i + "=" + (i+1)) == 2) arrHash.add(i + "=" + (i+1));
    	}
    	
    	for(int i = CStart; i < CEnd; i++) {
    		hashMap.put(i + "=" + (i+1), hashMap.getOrDefault(i + "=" + (i+1), 0) + 1);
    		if(hashMap.get(i + "=" + (i+1)) == 2)arrHash.add(i + "=" + (i+1));
    	}
    	
        return arrHash.size() -1;
    }
    
}