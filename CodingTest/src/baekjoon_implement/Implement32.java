package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Implement32 {

	public static void main(String[] args) throws IOException {
		test02();
	}
	

	// Гостиница 
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int two = 0; two <= N / 2; two++) {
			
			for(int three = 0; three <= N /3; three++) {
				
				if((two * 2) + (three * 3) == N) {
					System.out.println(two + " " + three);
					return;
				}
			}
		}
		
		
	}
	
	
}
