package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Implement31 {

	public static void main(String[] args) throws IOException {
		test02();
	}
	
	// Balancing Weights
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			
			int N = Integer.parseInt(br.readLine());
			int res = 0;
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < N; i++) 
				res += Integer.parseInt(st.nextToken());
			
            if (res > 0) System.out.println("Right");
            else if (res < 0) System.out.println("Left");
            else System.out.println("Equilibrium");
            
            
		}
		
	}

	// When Do We Finish? 
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		String input = "";
		
		while(!(input = br.readLine()).equals("00:00 00:00")) {
			st = new StringTokenizer(input);
			
			String start = st.nextToken();
			String need = st.nextToken();
			
			int SH = Integer.parseInt(start.split(":")[0]);
			int SM = Integer.parseInt(start.split(":")[1]);
			
			int NH = Integer.parseInt(need.split(":")[0]);
			int NM = Integer.parseInt(need.split(":")[1]);
			
			int AM = (SM + NM) % 60;
			int AH = (SH + NH + ((SM + NM) / 60)) % 24;
			
			
			if(AH < 10) sb.append("0" + AH + ":");
			else sb.append(AH + ":");
			
			if(AM < 10) sb.append("0" + AM);
			else sb.append(AM);
			
			if((SH + NH + ((SM + NM) / 60)) / 23 > 0) sb.append(" +" +((SH + NH + ((SM + NM) / 60)) / 23));
			
			sb.append("\n");
			
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
		
	}
	
	// 
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
	}
	
	// 
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
	}
	
	//
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
	}
	
	// 
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
	}
	
	//
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
	}
	
	// 
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
	}
	
	// 
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
	}

	// 
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
	}
	
	
	
}
