package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Implement24 {

	public static void main(String[] args) throws IOException {
		test01();
	}
	
	// 골뱅이 찍기 - 돌아간 ㄹ
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int j = 0; j < N; j++) {
			
			for(int i = 0; i < 3 * N; i++) sb.append("@");
			for(int i = 0; i < N; i++) sb.append(" ");
			for(int i = 0; i < N; i++) sb.append("@");
			sb.append("\n");
			
		}
		
		for(int j = 0; j < 3 * N; j++) {
			
			for(int i = 0; i < N; i++) sb.append("@");
			for(int i = 0; i < N; i++) sb.append(" ");
			for(int i = 0; i < N; i++) sb.append("@");
			for(int i = 0; i < N; i++) sb.append(" ");
			for(int i = 0; i < N; i++) sb.append("@");
			sb.append("\n");
			
		}
		
		for(int j = 0; j < N; j++) {
			
			for(int i = 0; i < N; i++) sb.append("@");
			for(int i = 0; i < N; i++) sb.append(" ");
			for(int i = 0; i < 3 * N; i++) sb.append("@");
			sb.append("\n");
			
		}
		System.out.println(sb);
	}
	
	// 골뱅이 찍기 - 돌아간 ㅈ
	public static void test02() throws IOException {
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
			
			for(int i = 0; i < N; i++) sb.append("@");
			for(int i = 0; i < 2 * N; i++) sb.append(" ");
			for(int i = 0; i < N; i++) sb.append("@");
			sb.append("\n");
			
		}
		
		for(int j = 0; j < N; j++) {
			
			for(int i = 0; i < 3 * N; i++) sb.append("@");
			sb.append("\n");
			
		}
		
		for(int j = 0; j < N; j++) {
			
			for(int i = 0; i < N; i++) sb.append("@");
			for(int i = 0; i < 2 * N; i++) sb.append(" ");
			for(int i = 0; i < N; i++) sb.append("@");
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
	
	
}
