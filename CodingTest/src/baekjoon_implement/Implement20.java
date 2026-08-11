package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Implement20 {

	public static void main(String[] args) throws IOException {
		test07();
	}
	
	
	// 골뱅이 찍기 - ㄴ
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		for(int j = 0; j < N*5; j++) {
			
			for(int i = 0; i < N; i++) sb.append("@");
			
			if(j >= N*4) for(int i  = 0; i < N*4; i++) sb.append("@");
			
			sb.append("\n");
			
		}
		
		
		System.out.println(sb);
	}
	
	
}
