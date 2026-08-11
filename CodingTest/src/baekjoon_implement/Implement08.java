package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Implement08 {

	public static void main(String[] args) throws IOException {
		test05();
	}
	
	
	// Checkers 
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		
		if(A >= B) {
			System.out.println(B);
		} else {
			System.out.println(A+1);
		}
	}
	
	
	// 帰省 (Homecoming) 
	public static void test07() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());

		if(C >= A && C < B) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		 
	}
	
	
}
