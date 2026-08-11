package baekjoon_BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BruteForcePlus01 {
	private static int N;
	
	// 완전제곱수
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double M = Math.sqrt(Double.parseDouble(br.readLine()));
		double N = Math.sqrt(Double.parseDouble(br.readLine()));
		
		int sum = 0;
		for(int i = (int)Math.ceil(M); i <= N; i++) {
			sum += i*i;
		}
		
		if(sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println((int)Math.ceil(M) * (int)Math.ceil(M));
		}
	}

	
	// 문자열 
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		StringBuilder A = new StringBuilder(st.nextToken());
		StringBuilder B = new StringBuilder(st.nextToken());
		int answer = 0;
		if(A.length() == B.length()) {
			
			for(int i = 0; i < A.length(); i++) {
				if(A.charAt(i) != B.charAt(i)) {
					answer++;
				}
			}
			System.out.println(answer);
		} else {
			N = B.length();
			dfsString(B.length(), A, B);
			System.out.println(N);
		}
		
	}
	
	// 문자열 dfs 메서드
	public static void dfsString(int key, StringBuilder A, StringBuilder B) {
		if(A.length() >= key) {
			int delete = 0;
			for(int i = 0; i < A.length(); i++) {
				if(A.charAt(i) != 'X') {
					if(A.charAt(i) != B.charAt(i)) {
						delete++;
					}
				}
			}
			if(delete < N) {
				N = delete;
			}
			return;
		} else {
			dfsString(key, A.append("X"), B);
			A.deleteCharAt(A.length()-1);
			dfsString(key, A.insert(0, "X"), B);
		}
	}

	
	// 나누기
	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder N = new StringBuilder(br.readLine());
		N = N.deleteCharAt(N.length() - 1);
		N = N.deleteCharAt(N.length() - 1);
		int F = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < 99; i++) {
			if(i < 10) {
				if(Integer.parseInt(N + "0" + i) % F == 0) {
					System.out.println("0"+i);
					break;
				}
			} else {
				if(Integer.parseInt(N +""+ i) % F == 0) {
					System.out.println(i);
					break;
				}
			}
		}
	}
	

}

