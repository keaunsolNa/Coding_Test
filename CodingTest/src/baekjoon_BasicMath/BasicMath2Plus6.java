package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BasicMath2Plus6 {

	public static void main(String[] args) throws IOException {
		test01();
	}
	
	// 운동장 한 바퀴
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int d1 = Integer.parseInt(br.readLine());
		int d2 = Integer.parseInt(br.readLine());
		
		System.out.println((2*d1) + (2*3.141592*d2));
		
	}
	
	// Rats
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n1 = Integer.parseInt(st.nextToken());
		int n2 = Integer.parseInt(st.nextToken());
		int n12 = Integer.parseInt(st.nextToken());
		
		int L = (n1+1)*(n2+1)/(n12+1) - 1;
		
		System.out.println(L);
	}
	
	// Site Score
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());
		
		System.out.println((56*A) + (24*B) + (14*C) + (6*D));
	}
	
	// Darius님 한타 안 함?
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = br.readLine().split("/");
		
		if(Integer.parseInt(temp[0]) + Integer.parseInt(temp[2]) < Integer.parseInt(temp[1]) || Integer.parseInt(temp[1]) == 0) {
			System.out.println("hasu");
		} else {
			System.out.println("gosu");
		}

	}
	
	// 공백 없는 A + B
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	}
	
	
}


