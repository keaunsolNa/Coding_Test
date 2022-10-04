package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Test08_BasicMath2Plus4 {

	// 제리와 톰
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		System.out.println(B-A + " " + B);
	}
	
	// 행렬 덧셈
	public static void test02() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] temp = new int[N][M];
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < N; j++) {
				st = new StringTokenizer(br.readLine(), " ");
				for(int k = 0; k < M; k++) {
					temp[j][k] += Integer.parseInt(st.nextToken());
				}
			}
		}

		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				sb.append(temp[i][j]).append(" ");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
	
	// A + B -9
	public static void test03() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		BigInteger A = new BigInteger(st.nextToken());
		BigInteger B = new BigInteger(st.nextToken());
		
		System.out.println(A.add(B));
	}
	
	// 조별과제를 하려는데 조장이 사라졌다
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int L = Integer.parseInt(br.readLine());

		if(L%5 != 0) {
			System.out.println(L/5 + 1);
		} else {
			System.out.println(L/5);
		}
	}

	// 큰 수 곱셈
	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		BigInteger A = new BigInteger(st.nextToken());
		BigInteger B = new BigInteger(st.nextToken());
		 
		System.out.println(A.multiply(B));
	}

	// 나는 행복합니다~
	public static void test06() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());	
		int M = Integer.parseInt(st.nextToken());	
		int K = Integer.parseInt(st.nextToken());	
		
		System.out.println(K/M + " " + K%M);
	}
	
	// Plane 
	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N1 = Integer.parseInt(st.nextToken());
		int K1 = Integer.parseInt(st.nextToken());
		int N2 = Integer.parseInt(st.nextToken());
		int K2 = Integer.parseInt(st.nextToken());
		
		System.out.println((N1*K1) + (N2*K2));
	}
	
	// 세금
	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(((N*78)/100) + " " + (N-((N*20/100)*22/100)));
	}
	
	// 달달함이 넘쳐흘러
	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] a = new int[3];
		for(int i = 0; i < 3; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		int[] b = new int[3];
		for(int i = 0; i < 3; i++) {
			b[i] = Integer.parseInt(st.nextToken());
		}
		
		int cs = b[0] - a[2];
		int cz = b[1] / a[1];
		int cy = b[2] - a[0];
		
		System.out.println(cs + " " + cz + " " + cy);
		
	}

	// 큰 수 (BIG)
	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		long temp = 0;
        for (int i = 0; i < N.length(); i++) {
            temp = (temp * 10 + (N.charAt(i) - '0')) % 20000303;
        }
		
        System.out.println(temp);
	}

	
}


