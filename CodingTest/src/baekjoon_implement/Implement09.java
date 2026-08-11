package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Implement09 {

	public static void main(String[] args) throws IOException {
		test01();
	}
	
	// Rectangles
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int R = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < R; i++) {
			for(int j = 0; j < C; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
}
