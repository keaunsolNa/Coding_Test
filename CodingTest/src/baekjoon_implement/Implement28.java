package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Implement28 {

	public static void main(String[] args) throws IOException {
		test04();
	}
	
	
	// 종이접기
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		long sum = 0;
		for(int i = 0; i < N; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			for(int j = 0; j < N; j++) {
				int temp = Integer.parseInt(st.nextToken());
				sum += temp;
			}
		}
		
		System.out.println(sum);
	}
	
	
}
