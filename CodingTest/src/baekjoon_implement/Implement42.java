package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Implement42 {

	public static void main(String[] args) throws IOException {
		test10();
	}
	
	
	// 8879번 - 올림픽 
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		TreeMap<Integer, List<Integer>> map = new TreeMap<>();
		
		for(int i = 0; i < N; i++) {
			
			st = new StringTokenizer(br.readLine());
			int index = Integer.parseInt(st.nextToken());
			int gold = Integer.parseInt(st.nextToken());
			int silver = Integer.parseInt(st.nextToken());
			int bronze = Integer.parseInt(st.nextToken());
			
			List<Integer> list = new LinkedList<>();
			list.add(gold);
			list.add(silver);
			list.add(bronze);
			
			map.put(index, list);
			
		}

		int grade = 1;
		for(Integer key : map.keySet()) {
			
			if(key != K) {
				
				if(map.get(key).get(0) > map.get(K).get(0)) {
					grade++;
				} else if(map.get(key).get(0) == map.get(K).get(0)) {
					
					if(map.get(key).get(1) > map.get(K).get(1)) {
						grade++;
					} else if(map.get(key).get(1) == map.get(K).get(1)) {
						
						if(map.get(key).get(2) > map.get(K).get(2)) grade++;
					}
				}
			}
		}
		
		System.out.println(grade);
	}
	
	
}
