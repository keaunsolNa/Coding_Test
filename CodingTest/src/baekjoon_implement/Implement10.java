package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Implement10 {

	public static void main(String[] args) throws IOException {
		test02();
	}
	
	
	// Простая задача
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int I = Integer.parseInt(st.nextToken());
			int F = Integer.parseInt(st.nextToken());
			
			if(I > 2 && F > 2) {
				System.out.println("No");
			} else if(I < 2 && F < 3) {
				System.out.println("Yes");
			} else if(I < 3 && F < 2) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
	
	
}
