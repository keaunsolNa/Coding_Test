package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Implement03 {

	public static void main(String[] args) throws IOException {
		test04();
	}
	
	
	// 기찍 N
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i = N; i > 0; i--) {
			System.out.println(i);
		}
	}
	
	
}