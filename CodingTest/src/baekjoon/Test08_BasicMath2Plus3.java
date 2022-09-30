package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test08_BasicMath2Plus3 {

	// 저작권
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int I = Integer.parseInt(st.nextToken());
		int answer  = A*(I-1);
		
		if(answer % A == 0) {
			System.out.println(answer + 1);
		} else {
			System.out.println(answer);
		}
	}
	
	// 사파리 월드
	public static void test02() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		long A  = Long.parseLong(st.nextToken());
		long B  = Long.parseLong(st.nextToken());
		System.out.println(Math.abs(A - B));
	}
	
	// 16진수
	public static void test03() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		System.out.println(Integer.parseInt(str, 16));
	}
	
	// 2진수 8진수
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();

		if(str.length() % 3 == 1)
            sb.append(str.charAt(0));
		
        if(str.length() % 3 == 2)
            sb.append((str.charAt(0) - '0') * 2 + (str.charAt(1) - '0'));
		
        for(int i = str.length() % 3; i < str.length(); i+=3) {
            sb.append((str.charAt(i) - '0') * 4 + (str.charAt(i+1) - '0') * 2
                    + (str.charAt(i+2) - '0'));
        }
        System.out.println(sb);
	}

	// 엄청난 부자2
	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		BigInteger n = new BigInteger(st.nextToken());
		BigInteger m = new BigInteger(st.nextToken());
		
		System.out.println(n.divide(m));
		System.out.println(n.mod(m));
	}

	// 카드 게임
	public static void test06() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			sum += Integer.parseInt(br.readLine());
		}
		
		System.out.println(sum);
	}
	
	// 꼬마 정민
	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		BigInteger sum = new BigInteger("0");
		for(int i = 0; i < 3; i++) {
			BigInteger temp = new BigInteger(st.nextToken());
			sum = sum.add(temp);
		}
		System.out.println(sum);
	}
	
	// 긴 자리 계산
	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger A = new BigInteger(br.readLine());
		BigInteger B = new BigInteger(br.readLine());
		System.out.println(A.add(B));
		System.out.println(A.subtract(B));
		System.out.println(A.multiply(B));
	}
	
	// 홍익 대학교
	public static void test09() throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(N - 1946);
	}

	// 이상한 기호
	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		
		System.out.println((A+B)*(A-B));
	}

	
}
