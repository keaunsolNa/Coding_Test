package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Implement34 {

	public static void main(String[] args) throws IOException {
		test07();
	}
	
	
	// ЛИНИЯ
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		while(true) {
			
			if(N % 2 != 0) {
				N = N/2 + 1;
			} else {
				break;
			}
		}
		
		System.out.println(N);
	}
	
	// Game Show!
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int C = Integer.parseInt(br.readLine());
		
		int sum = 0;
		int ans = 0;
		while(C --> 0) {
			
			int v = Integer.parseInt(br.readLine());
			sum += v;
			
		    if (sum > ans) ans = sum;
		}
		
		System.out.println(ans + 100);
	}
	
	
}
