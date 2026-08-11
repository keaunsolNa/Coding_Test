package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Implement13 {

	public static void main(String[] args) throws IOException {
		test01();
	}
	
	// 세 수
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		if(A + B == C) {
			System.out.println(A + "+" + B + "=" + C);
		} else if(A - B == C) {
			System.out.println(A + "-" + B + "=" + C);
		} else if(A * B == C) {
			System.out.println(A + "*" + B + "=" + C);
		} else if(A / B == C) {
			System.out.println(A + "/" + B + "=" + C);
		} else if(A == B + C) {
			System.out.println(A + "=" + B + "+" + C);
		} else if(A == B - C) {
			System.out.println(A + "=" + B + "-" + C);
		} else if(A == B * C) {
			System.out.println(A + "=" + B + "*" + C);
		} else if(A == B / C) {
			System.out.println(A + "=" + B + "/" + C);
		}
	}
	
	
}
