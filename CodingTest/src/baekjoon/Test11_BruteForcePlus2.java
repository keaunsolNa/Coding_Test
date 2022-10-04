package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test11_BruteForcePlus2 {
	
	public static void main(String[] args) throws IOException {
		test02();
	}
	
	// 단순한 문제 (Small)
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		for(int i = 0; i < testCase; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int cnt = 0;
			for(int x = 1; x <= a; x++) {
				for(int y = 1; y <= b; y++) {
					for(int z = 1; z <= c; z++) {
						if(x%y == y%z && y%z == z%x) {
							cnt++;
						}
					}
				}
			}
			System.out.println(cnt);
		}
	}

	// 암호 제작
	public static void test02() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
	}
	
	public static void test03() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	}
	
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	}

	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	}

	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	}
	
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	}
	
	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder N = new StringBuilder(br.readLine());
	}
	
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder N = new StringBuilder(br.readLine());
	}

}

