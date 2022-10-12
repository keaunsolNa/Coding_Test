package baekjoon_Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Greedy {
	public static void main(String[] args) throws IOException {
		test01();
	}
	
	// 전자레인지
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int time  = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();

		if(time%10 != 0) {
			System.out.println(-1);
		} else {
			int a = time/300;
			time = time%300;
			int b = time/60;
			time = time%60;
			int c = time/10;

			System.out.println(a + " " + b + " " + c);
		}
		
	}
	
	// 
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N  = Integer.parseInt(br.readLine());
		
	}
	
}
