package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test08_BasicMath2Plus {
	
	// 숫자의 개수
	public static void test01() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String ABC = Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine()) + "";
		
		for(int i = 0; i <= 9; i++) {
			int cnt = 0;
			for(int j = 0; j < ABC.length(); j++) {
				
				if(i == Character.getNumericValue(ABC.charAt(j))) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}
	// A+B - 2
	public static void test02() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		System.out.println(A + B);
	}
	
	// 직사각형에서 탈출
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		int xOut = Math.min(w-x, Math.abs(0-x));
		int yOut = Math.min(h-y, Math.abs(0-y));
		System.out.println(Math.min(xOut, yOut));
	}
	
	//	최대공약수와 최소공배수
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int gcdX = x;
		int gcdY = y;
		while(gcdX!=gcdY) {
			if(gcdX>gcdY) 
				gcdX = gcdX-gcdY;
			else gcdY = gcdY-gcdX;
		} 
		System.out.println(gcdY);
		
		int result = x*y;
		
		while(x!=y) {
			if(x>y)
				x = x-y;
			else y = y-x;
		}
		
		int result2 = y;
		
		System.out.println(result/result2);
	}

	// 평균 점수
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int d = Integer.parseInt(br.readLine());
		int e = Integer.parseInt(br.readLine());
		if(a <= 40) a = 40;
		if(b <= 40) b = 40;
		if(c <= 40) c = 40;
		if(d <= 40) d = 40;
		if(e <= 40) e = 40;
		System.out.println((a+b+c+d+e)/5);
	}
	
	// 2007년
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int month = Integer.parseInt(st.nextToken());
		int day = Integer.parseInt(st.nextToken());
		
		switch(month) {
			case 2 : day += 31; break;
			case 3 : day += 59; break;
			case 4 : day += 90; break;
			case 5 : day += 120; break;
			case 6 : day += 151; break;
			case 7 : day += 181; break;
			case 8 : day += 212; break;
			case 9 : day += 243; break;
			case 10 : day += 273; break;
			case 11 : day += 304; break;
			case 12 : day += 334; break;
		}
		
		switch(day%7) {
			case 1 : System.out.println("MON"); break;
			case 2 : System.out.println("TUE"); break;
			case 3 : System.out.println("WED"); break;
			case 4 : System.out.println("THU"); break;
			case 5 : System.out.println("FRI"); break;
			case 6 : System.out.println("SAT"); break;
			case 0 : System.out.println("SUN"); break;
		}
	}

	// 검증수
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		System.out.println((int)(Math.pow(Integer.parseInt(st.nextToken()), 2) + Math.pow(Integer.parseInt(st.nextToken()), 2) + 
				Math.pow(Integer.parseInt(st.nextToken()), 2) + Math.pow(Integer.parseInt(st.nextToken()), 2) + Math.pow(Integer.parseInt(st.nextToken()), 2))%10);
	}
	
	// 직각삼각형
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int[] arr = new int[3];
			arr[0] = Integer.parseInt(st.nextToken());
			arr[1] = Integer.parseInt(st.nextToken());
			arr[2] = Integer.parseInt(st.nextToken());

			Arrays.sort(arr);
			
			if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0) {
				break;
			}
			if(Math.pow(arr[0], 2) + Math.pow(arr[1], 2) == Math.pow(arr[2], 2)) {
				System.out.println("right");
			} else System.out.println("wrong");
			
		}
		
	}
	
	// 피보나치 수 2
	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.print(fibonacci(n));
	}
	
	// 피보나치 재귀 메서드
	public static long fibonacci(int n) {
		if(n < 2)return n;
		long f0 = 0, f1 = 1, f2 = 1;
		for(int i = 2; i < n; i++) {
			f0 = f1;
			f1 = f2;
			f2 = f1 + f0;
		}
		return f2;
	}
	
	// 피보나치 수 4
	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.print(fibonacci2(n));
	}

	// 피보나치 재귀 메서드
	public static String fibonacci2(int n) {
		BigInteger f0 = new BigInteger("0");
		BigInteger f1 = new BigInteger("1");
		BigInteger f2 = new BigInteger("1");
		if(n < 2)return n+"";
		for(int i = 2; i < n; i++) {
			f0 = f1;
			f1 = f2;
			f2 = f1.add(f0);
		}
		return f2.toString();
	}
	
}
