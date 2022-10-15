package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class StringPlus04 {
	
	public static void main(String[] args) throws IOException {
		test09();
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

	// CAPS 
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String alert = br.readLine().toUpperCase();
		
		System.out.println(alert);
	}

	// 母音を数える (Counting Vowels) 
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());
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
	
	// Communication Channels
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < testCase; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String A = st.nextToken();
			String B = st.nextToken();
			
			if(A.equals(B)) {
				System.out.println("OK");
			} else {
				System.out.println("ERROR");
			}
		}
		
	}
	
	// Basketball One-on-One
	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int aSum = 0;
		int bSum = 0;
		for(int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i) == 'A') {
				aSum = aSum + Character.getNumericValue(str.charAt(i+1));
				i++;
			} else {
				bSum = bSum + Character.getNumericValue(str.charAt(i+1));
				i++;
			}
		}
		
		if(aSum > bSum) {
			System.out.println("A");
		} else {
			System.out.println("B");
		}
	}
	
	//The Walking Adam 
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		int result = 0;

		for (int i = 0; i < testCase; i++){
            String t = br.readLine();
            for (int j = 0; j < t.length(); j++){
                if (t.charAt(j) == 'U'){
                    result++;}
                else
                    break;
            }
            System.out.println(result);
            result = 0;
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
	
	// 소음
	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger A = new BigInteger(br.readLine());
		String operator = br.readLine();
		BigInteger B = new BigInteger(br.readLine());
		
		switch(operator){
			case "*" : 
				System.out.println(A.multiply(B));
				break;
			case "+" :
				System.out.println(A.add(B));
				break;
		}
	}
	
	// 첫 글자를 대문자로
	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < testCase; i++) {
			String temp = br.readLine();
			if((int)temp.charAt(0) > 90) {
				StringBuilder sb = new StringBuilder();
				for(int j = 0; j < temp.length(); j++) {
					if(j == 0) {
						int a = ((int)temp.charAt(0))-32;
						sb.append((char)a);
					} else {
						sb.append(temp.charAt(j));
					}
				}
				temp = sb.toString();
			}
			System.out.println(temp);
		}
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
