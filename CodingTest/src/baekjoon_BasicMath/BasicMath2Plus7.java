package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BasicMath2Plus7 {

	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// Cupcake Party
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		
		System.out.println((A*8) + (B*3) -28);
	}
	
	// Football Scoring
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int aSum = 0;
		aSum += Integer.parseInt(st.nextToken())*6;
		aSum += Integer.parseInt(st.nextToken())*3;
		aSum += Integer.parseInt(st.nextToken())*2;
		aSum += Integer.parseInt(st.nextToken())*1;
		aSum += Integer.parseInt(st.nextToken())*2;
		
		st = new StringTokenizer(br.readLine(), " ");
		
		int bSum = 0;
		bSum += Integer.parseInt(st.nextToken())*6;
		bSum += Integer.parseInt(st.nextToken())*3;
		bSum += Integer.parseInt(st.nextToken())*2;
		bSum += Integer.parseInt(st.nextToken())*1;
		bSum += Integer.parseInt(st.nextToken())*2;
		
		System.out.println(aSum + " " + bSum);
	}
	
	// 폰 노이만과 파리
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int S = Integer.parseInt(st.nextToken());
		int T = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());
		
		System.out.println((D/(S*2))*T);
	}
	
	// 전자레인지
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		int D = Integer.parseInt(br.readLine());
		int E = Integer.parseInt(br.readLine());
		
		if(A < 0) {
			System.out.println((C*Math.abs(A)) + D + E*B);
		} else {
			System.out.println((B-A)*E);
		}
	}
	
	// 이칙연산
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		double A = Double.parseDouble(st.nextToken());
		double B = Double.parseDouble(st.nextToken());
		double C = Double.parseDouble(st.nextToken());
		
		if(((A * B) / C) > ((A / B) * C)) {
			System.out.println((int) ((A * B) / C));
		} else {
			System.out.println((int) ((A / B) * C));
		}
	}

	// 타일 채우기 4
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		long N = Long.parseLong(st.nextToken());
		long M = Long.parseLong(st.nextToken());
		
		System.out.println(N*M/2);
	}
	
//	나이 계산하기
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] Birth = br.readLine().split(" ");
		String[] Date = br.readLine().split(" ");

		int BirthYear = Integer.parseInt(Birth[0]);
		int BirthMonth = Integer.parseInt(Birth[1]);
		int BirthDay = Integer.parseInt(Birth[2]);

		int DateYear = Integer.parseInt(Date[0]);
		int DateMonth = Integer.parseInt(Date[1]);
		int DateDay = Integer.parseInt(Date[2]);

		int age = DateYear - BirthYear;
		
		if(BirthYear == DateYear) {
			System.out.println(age);
		}else{
			if(BirthMonth > DateMonth) {
				System.out.println(age - 1);
			}else if(BirthMonth == DateMonth){
				if(BirthDay <= DateDay) {
					System.out.println(age);
				}else {
					System.out.println(age - 1);
				}
			}else{
				System.out.println(age);
			}
		}
		System.out.println(age + 1);
		System.out.println(age);
		
	}
	
//	감정이입
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String A = br.readLine();
		String B = br.readLine();
		
		Long a = Long.parseLong(A, 2);
		Long b = Long.parseLong(B, 2);
		
		String sum = Long.toBinaryString(a*b);
		
		System.out.println(sum);
	}

//	FA
	public static void test09() throws IOException {
		System.out.println("FA");
	}

//	Do Not Touch Anything
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int R = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());

		int RN = 0;
		if(R%N == 0) {
			RN = R/N;
		} else {
			RN = R/N + 1;
		}
		
		int CN = 0;
		if(C%N == 0) {
			CN = C/N;
		} else {
			CN = C/N + 1;
		}
		
		System.out.println((long)RN * CN);
	}
}


