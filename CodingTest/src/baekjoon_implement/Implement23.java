package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Implement23 {

	public static void main(String[] args) throws IOException {
		test10();
	}
	
	
	// 골뱅이 찍기 - ㄷ
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for(int k = 0; k < T; k++) {
			for(int j = 0; j < T; j++) for(int i = 0; i < 5; i++) sb.append("@");
			sb.append("\n");
		}
		
		for(int j = 0; j < 3*T; j++) {
			for(int i = 0; i < T; i++) sb.append("@");
			sb.append("\n");
		}
		
		for(int k = 0; k < T; k++) {
			for(int j = 0; j < T; j++) for(int i = 0; i < 5; i++) sb.append("@");
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
	
	// 골뱅이 찍기 - ㅁ
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		for(int j = 0; j < N; j++) {
			for(int i = 0; i < 5*N; i++) sb.append("@");
			sb.append("\n");
		}
		
		for(int j = 0; j < 3*N; j++) {
			for(int i = 0; i < N; i++) sb.append("@");
			for(int i = 0; i < 3*N; i++) sb.append(" ");
			for(int i = 0; i < N; i++) sb.append("@");
			sb.append("\n");
		}
		
		for(int j = 0; j < N; j++) {
			for(int i = 0; i < 5*N; i++) sb.append("@");
			sb.append("\n");
		}
		
		System.out.println(sb);
		
	}
	
	// 골뱅이 찍기 - 뒤집힌 ㄱ
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for(int j = 0; j < T; j++) {
			for(int i = 0; i < 5 * T; i++) sb.append("@");
			sb.append("\n");
		}
		
		for(int j = 0; j < 4 * T; j++) {
			for(int i = 0; i < T; i++) sb.append("@");
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
	
	// 골뱅이 찍기 - ㅂ
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int j = 0; j < 2 * N; j++) {
			
			for(int i = 0; i < N; i++) sb.append("@");
			for(int i = 0; i < 3 * N; i++) sb.append(" ");
			for(int i = 0; i < N; i++) sb.append("@");
			sb.append("\n");
		}
		
		for(int j = 0; j < N; j++) {
			for(int i = 0; i < N; i++) sb.append("@");
			for(int i = 0; i < 3 * N; i++) sb.append("@");
			for(int i = 0; i < N; i++) sb.append("@");
			sb.append("\n");
		}
		
		
		for(int j = 0; j < N; j++) {
			
			for(int i = 0; i < N; i++) sb.append("@");
			for(int i = 0; i < 3 * N; i++) sb.append(" ");
			for(int i = 0; i < N; i++) sb.append("@");
			sb.append("\n");
		}
		
		for(int j = 0; j < N; j++) {
			for(int i = 0; i < N; i++) sb.append("@");
			for(int i = 0; i < 3 * N; i++) sb.append("@");
			for(int i = 0; i < N; i++) sb.append("@");
			sb.append("\n");
		}
		
		System.out.println(sb);
		
	}
	
	// 골뱅이 찍기 - 돌아간 ㅍ
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		for(int j = 0; j < N; j++) {
			for(int i = 0; i < N; i++) sb.append("@");
			for(int i = 0; i < 3 * N; i++) sb.append(" ");
			for(int i = 0; i < N; i++) sb.append("@");
			sb.append("\n");
		}
		
		for(int j = 0; j < N; j++) {
			for(int i = 0; i < 5 * N; i++) sb.append("@");
			sb.append("\n");
		}
		
		for(int j = 0; j < N; j++) {
			for(int i = 0; i < N; i++) sb.append("@");
			for(int i = 0; i < 3 * N; i++) sb.append(" ");
			for(int i = 0; i < N; i++) sb.append("@");
			sb.append("\n");
		}
		
		for(int j = 0; j < N; j++) {
			for(int i = 0; i < 5 * N; i++) sb.append("@");
			sb.append("\n");
		}
		
		for(int j = 0; j < N; j++) {
			for(int i = 0; i < N; i++) sb.append("@");
			for(int i = 0; i < 3 * N; i++) sb.append(" ");
			for(int i = 0; i < N; i++) sb.append("@");
			sb.append("\n");
		}
		System.out.println(sb);
	}
	
	// 골뱅이 찍기 - 돌아간 ㅋ
	public static void test08() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        
        for(int j = 0; j < N; j++) {
        	for(int i = 0; i < N * 5; i++) sb.append("@");
        	sb.append("\n");
        }
        
        for(int j = 0; j < N; j++) {
        	for(int i = 0; i < N; i++) sb.append("@");
        	sb.append("\n");
        }
        
        for(int j = 0; j < N; j++) {
        	for(int i = 0; i < N * 5; i++) sb.append("@");
        	sb.append("\n");
        }
        
        for(int j = 0; j < 2 * N; j++) {
        	for(int i = 0; i < N; i++) sb.append("@");
        	sb.append("\n");
        }
        
        System.out.println(sb);
	}
	
	
	// 골뱅이 찍기 - ㅌ
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		for(int j = 0; j < N; j++) {
			for(int i = 0; i < 5 * N; i++) sb.append("@");
			sb.append("\n");
		}
		
		for(int j = 0; j < N; j++) {
			for(int i = 0; i < N; i++) sb.append("@");
			sb.append("\n");
		}
		
		for(int j = 0; j < N; j++) {
			for(int i = 0; i < 5 * N; i++) sb.append("@");
			sb.append("\n");
		}
		
		for(int j = 0; j < N; j++) {
			for(int i = 0; i < N; i++) sb.append("@");
			sb.append("\n");
		}
		
		for(int j = 0; j < N; j++) {
			for(int i = 0; i < 5 * N; i++) sb.append("@");
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
	
	
}
