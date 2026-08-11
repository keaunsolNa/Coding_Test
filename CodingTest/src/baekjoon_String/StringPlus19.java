package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class StringPlus19 {
	
	public static void main(String[] args) throws IOException {
		test01();
	}

	// Split 
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String N = br.readLine();
		for(int i = 0; i < N.length(); i++) {
			
			if(i == N.length()/2) sb.append(" ");
			sb.append(N.charAt(i));
		}
		
		System.out.print(sb);
	}
	

	// 진법 변환
	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		String input = st.nextToken();
		int binary = Integer.parseInt(st.nextToken());
		
		System.out.println(binaryParse(input, binary));
	}
	
	// 진법 변환 진수 변환 Method
	public static String binaryParse(String input, int binary) {
		
		return new BigInteger(input, binary).toString();
	}
	
	
}
