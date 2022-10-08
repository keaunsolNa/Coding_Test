package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BasicMath2Plus6 {

	public static void main(String[] args) throws IOException {
		test05();
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

		String AB = br.readLine();
		
		if(AB.length() == 2) {
			System.out.println(Integer.parseInt(AB.charAt(0)+"") + Integer.parseInt(AB.charAt(1)+""));
		} else if(AB.length() == 4){
			System.out.println(20);
		} else {
			if(AB.charAt(1) == '0') {
				System.out.println(Integer.parseInt(AB.charAt(0)+"0") + Integer.parseInt(AB.charAt(2)+""));
			} else if(AB.charAt(2) == '0') {
				System.out.println(Integer.parseInt(AB.charAt(0)+"") + Integer.parseInt(AB.charAt(1)+"0"));
			}
		}
	}

	// Multiply 
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		BigInteger A = new BigInteger(br.readLine());
		BigInteger B = new BigInteger(br.readLine());
		System.out.println(A.multiply(B));
	}
	
//	余り (Remainder) 
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		
		System.out.println(X%21);
	}
	
//	身長 (Height)
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		
		System.out.println(B-A);
	}

//	立方体 (Cube) 
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger A = new BigInteger(br.readLine());
		
		System.out.println(A.multiply(A).multiply(A));
	}

//	Bottle Return
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] A = br.readLine().split(" ");

		int sum = 0;
		for(int i = 0; i < A.length; i++) {
			sum += Integer.parseInt(A[i]);
		}
		
		System.out.println(sum*5);
	}
}


