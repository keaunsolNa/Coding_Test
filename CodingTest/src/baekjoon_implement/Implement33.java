package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Implement33 {

	public static void main(String[] args) throws IOException {
		test07();
	}
	
	
	// Любитель нулей
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		String str = N + "";
		
		for(int i = str.length() - 1; i > 0; i--) {
			if(str.charAt(i) == '0') {
				str = str.substring(0, str.length() - 1);
			} else break;
		}
	
		int cnt = 0;
		for(int i = 0; i < str.length(); i++) if(str.charAt(i) == '0') cnt++;

		System.out.println(cnt);
	}
	
	
}
