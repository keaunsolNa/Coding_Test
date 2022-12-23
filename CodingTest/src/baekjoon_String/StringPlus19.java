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
		test10();
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
	
	// 상근이의 체스판
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int R = Integer.parseInt(input.split(" ")[0]);
		int C = Integer.parseInt(input.split(" ")[1]);
		
		input = br.readLine();
		int A = Integer.parseInt(input.split(" ")[0]);
		int B = Integer.parseInt(input.split(" ")[1]);
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < R; i++) {
			
			for(int k = 0; k < A; k++) {
				
				for(int j = 0; j < C; j++) {
					
					for(int q = 0; q < B; q++) {
					
						if((i + j)%2 == 0) {
							sb.append("X");
						} else {
							sb.append(".");
						}
					}
				}
				sb.append("\n");
			}
		}
		
		System.out.println(sb);
	}

	// 그릇
	public static void test03() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		int height = 10;
		for(int i = 1; i < input.length(); i++) {
			
			if(input.charAt(i) != input.charAt(i-1)) {
				height += 10;
			} else {
				height += 5;
			}
		}
		System.out.println(height);
	}
	
	// 8진수, 10진수, 16진수
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
		String input = br.readLine();
		
		System.out.println(binary(input));
	}
	
	// 8진수, 10진수, 16진수 binary method
	public static String binary(String input) {
        int binary = 10;
        
        if (input.startsWith("0x")) {
            input = input.substring(2);
            binary = 16;
            
        } else if (input.startsWith("0")) {
        	
            input = input.substring(1);
            binary = 8;
            
        }
        return new BigInteger(input, binary).toString();
	}
	
	//Cryptoquote
	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			String input = br.readLine();
			char[] rule = br.readLine().toCharArray();
			List<Character> list = new ArrayList<>();
			
			for (char c : rule) list.add(c);
			
			for(int j = 0; j < input.length(); j++) {
				if(input.charAt(j) != ' ') {
					sb.append(list.get((int)(input.charAt(j) - 'A')));
				} else {
					sb.append(" ");
				}
			}
			sb.append("\n");
		}
		
		sb.deleteCharAt(sb.length()-1);
		System.out.print(sb);
	}
	
    // Chop Cup 
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		int answer = 1;
		for(int i = 0; i < input.length(); i++) {
			
			switch(input.charAt(i)) {
			
				case 'A' :
					if(answer == 1) answer = 2;
					else if (answer == 2) answer = 1;
					break;
				case 'B' :
					if(answer == 2) answer = 3;
					else if (answer == 3) answer = 2;
					break;
				case 'C' :
					if(answer == 3) answer = 1;
					else if (answer == 1) answer = 3;
			}
		}
		System.out.println(answer);
    }

	// Zagubiona litera
	public static void test07() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        
        int total = 2015;
       
        for(int i = 0; i < input.length(); i++) total -= (int)(input.charAt(i));
        	
        System.out.println((char)(total));
        
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
	
	// 이진수 연산
	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String A = br.readLine();
		String B = br.readLine();
		for(int i = 0; i < A.length(); i++) {
			if(A.charAt(i) == '1' && B.charAt(i) == '1') sb.append(1);
			else sb.append(0);
			
		}
		
		sb.append("\n");
		
		for(int i = 0; i < A.length(); i++) {
			
			if(A.charAt(i) == '1' || B.charAt(i) == '1') sb.append(1);
			else sb.append(0);
			
		}
		
		sb.append("\n");
		for(int i = 0; i < A.length(); i++) {
			
			if(A.charAt(i) == '1' && B.charAt(i) == '1') sb.append(0);
			else if(A.charAt(i) == '1' || B.charAt(i) == '1') sb.append(1);
			else sb.append(0);
			
		}
		
		sb.append("\n");
		for(int i = 0; i < A.length(); i++) {
			
			if(A.charAt(i) == '1') sb.append(0);
			else sb.append(1);
			
		}
		
		sb.append("\n");
		for(int i = 0; i < A.length(); i++) {
			
			if(B.charAt(i) == '1') sb.append(0);
			else sb.append(1);
			
		}
		
		
		System.out.println(sb);
	}
	
    // JOI와 IOI
	public static void test10() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        
        int cnt1 = 0;
        int cnt2 = 0;
        
        for(int i = 0; i < input.length() - 2; i++) {
            switch(input.charAt(i)) {
                case 'J':
                if(input.charAt(i + 1) == 'O' && input.charAt(i + 2) == 'I') {
                    cnt1++;
                    break;
                }
                case 'I':
                    if(input.charAt(i + 1) == 'O' && input.charAt(i + 2) == 'I') {
                        cnt2++;
                    }            
            }
        }
        
        System.out.println(cnt1);
        System.out.println(cnt2);
	}
	
	
	
}
