package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Implement14 {

	public static void main(String[] args) throws IOException {
		test01();
	}
	
	// 경기 결과
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int AWin = 0;
		int BWin = 0;
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			if(A > B) {
				AWin++;
			} else if(B > A) {
				BWin++;
			}
		}
		
		System.out.println(AWin + " " + BWin);
	}
	
	
}
