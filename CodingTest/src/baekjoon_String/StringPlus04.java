package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class StringPlus04 {
	
	public static void main(String[] args) throws IOException {
		test01();
	}
	// Equality
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken());
		String operator = st.nextToken();
		int B = Integer.parseInt(st.nextToken());
		String eqOperator = st.nextToken();
		int C = Integer.parseInt(st.nextToken());

		switch(operator) {
		
			case "+" : if(A + B == C) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			break;
			
			case "-" : if(A - B == C) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			break;
			
			case "*" : if(A * B == C) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			break;
			
			case "/" : if(A / B == C) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			break;
			
			case "%" : if(A % B == C) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			break;
		}
		
		
	}


	// 모음의 개수
	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int answer = 0;
		for(int i = 0; i < str.length(); i++) {
			switch(str.charAt(i)) {
				case 'a' : answer++; break;
				case 'i' : answer++; break;
				case 'u' : answer++; break;
				case 'e' : answer++; break;
				case 'o' : answer++; break;
			}
		}
		
		System.out.println(answer);
	}
	
	
	// 개표
	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int people = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		int a = 0;
		int b = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'A') {
				a++;
			} else {
				b++;
			}
		}
		
		if(a > b) {
			System.out.println("A");
		} else if(a < b) {
			System.out.println("B");
		} else {
			System.out.println("Tie");
		}
		
	}
	
}
