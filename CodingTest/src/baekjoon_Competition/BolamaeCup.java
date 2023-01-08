package baekjoon_Competition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BolamaeCup {
	public static void main(String[] args) throws NumberFormatException, IOException {
		test02();
	}
	
	// A번 - 특식 배부
	public static void test01() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		int sum = 0;
		if(N >= A) sum += A;
		else sum += N;

		if(N >= B) sum += B;
		else sum += N;
		
		if(N >= C) sum += C;
		else sum += N;
		
		System.out.println(sum);
	}
	
	// B번 - 출입 기록
	public static void test02() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		Map<Integer, Boolean> map = new HashMap<>();
		int cnt = 0;
		while(N --> 0) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			if(!map.containsKey(A)) {
				if(B == 0) cnt++;
				else map.put(A, true);
				continue;
			}
			
			if(map.get(A) == true) {
				if(B == 1) cnt++;
				else map.put(A, false);
				continue;
			}
			
			if(map.get(A) == false) {
				if(B == 0) cnt++;
				else map.put(A, true);
				continue;
			}
			
		}
		
		for (Integer key : map.keySet()) if(map.get(key) == true) cnt++;
		
		System.out.println(cnt);
	}

	
}