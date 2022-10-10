package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BasicMath2Plus8 {

	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// Julka
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger A = new BigInteger(br.readLine());
		BigInteger B = new BigInteger(br.readLine());
		BigInteger two = new BigInteger("2");
		BigInteger C = (A.add(B)).divide(two);
		BigInteger D = (A.subtract(B)).divide(two);
		
		System.out.println(C);
		System.out.println(D);
		
	}
	
	// 헛간 청약
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		
		int max = (W/L)*(H/L);
		System.out.println(Math.min(N, max));
	}
	
	// 2 番目に大きい整数 (The Second Largest Integer) 
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] arr = new int[3];
		for(int i = 0; i < 3; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		System.out.println(arr[1]);
	}
	
	// 試験 (Exam)
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] arr = new int[3];
		for(int i = 0; i < 3; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		System.out.println(arr[1]+arr[2]);
	}
	
	// Every Second Counts
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] start = br.readLine().split(" : ");
		String[] end = br.readLine().split(" : ");
		
		int startSecond = Integer.parseInt(start[2]) + (Integer.parseInt(start[1])*60) + (Integer.parseInt(start[0])*3600);
		int endSecond = Integer.parseInt(end[2]) + (Integer.parseInt(end[1])*60) + (Integer.parseInt(end[0])*3600);
		
		if(endSecond - startSecond >= 0) {
			System.out.println(endSecond - startSecond);
		} else {
			System.out.println(86400 - startSecond + endSecond);
		}
	}

	// Zero or One
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		if(A == B && A == C && B == C) {
			System.out.println("*");
		} else if(A == B && A != C) {
			System.out.println("C");
		} else if(A == C && B != C) {
			System.out.println("B");
		} else if(B == C && A != B) {
			System.out.println("A");
		}
	}
	
	//	金平糖 (Konpeito)
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		int max = Math.max(Math.max(A, B), C);
		
		System.out.println(max-A + max-B + max-C);
	}
	
//	Pizza Deal
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		double A1 = Double.parseDouble(st.nextToken());
		double P1 = Double.parseDouble(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		
		double R1 = Double.parseDouble(st.nextToken());
		double P2 = Double.parseDouble(st.nextToken());
		
		double AP = A1/P1;
		double RP = (Math.PI*R1*R1)/P2;
		
		if(AP < RP) {
			System.out.println("Whole pizza");
		} else {
			System.out.println("Slice of pizza");
		}
	}

//	Tri-du
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		if(A == B) {
			System.out.println(A);
		} else {
			System.out.println(Math.max(A, B));
		}
	}

//	ICPC 
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int P1 = Integer.parseInt(st.nextToken());
		int S1 = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		int S2 = Integer.parseInt(st.nextToken());
		int P2 = Integer.parseInt(st.nextToken());

		int P = P1+P2;
		int S = S1+S2;
		if(P == S) {
			if(P1 == S2) {
				System.out.println("Penalty");
			} else if(P1 > S2){
				System.out.println("Esteghlal");
			} else {
				System.out.println("Persepolis");
			}
		} else {
			if(P > S) {
				System.out.println("Persepolis");
			} else {
				System.out.println("Esteghlal");
			}
		}
		
	}
}


