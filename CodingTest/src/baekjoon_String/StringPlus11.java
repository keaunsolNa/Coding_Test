package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class StringPlus11 {
	
	public static void main(String[] args) throws IOException {
		test03();
	}
	
	
	// 팰린드롬
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			String input = br.readLine().toLowerCase();
			int answer = 0;
			for(int j = 0; j < input.length()/2; j++) {
				if(input.charAt(j) != input.charAt(input.length() - (j+1))) {
					answer = 1;
					break;
				}
			}
			
			if(answer == 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
	
	
}
