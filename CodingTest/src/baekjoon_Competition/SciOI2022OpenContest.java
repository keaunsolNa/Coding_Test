package baekjoon_Competition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SciOI2022OpenContest {
	public static void main(String[] args) throws NumberFormatException, IOException {
		test03();
	}
	
	// A번 - 카드 뽑기
	public static void test01() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] card = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) card[i] = Integer.parseInt(st.nextToken());
		
	}
	
	// B번 - 최대 점수
	private static int totalPoint;
	public static void test02() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken()) - 1;
		
		st = new StringTokenizer(br.readLine());
		int[] map = new int[N];
		for(int i = 0; i < N; i++) map[i] = Integer.parseInt(st.nextToken());
		
		totalPoint = 0;
		while(true) {
			System.out.println("TOTAL : " + totalPoint);
			if(S - 1 >= 0) {
				if(totalPoint + map[S-1] >= 0) {
					S -= 1;
					totalPoint += map[S];
					map[S] = 0;
					continue;
				} else {
					if(S + 1 < N) {
						
						if(totalPoint + map[S + 1] >= 0) {
							S += 1;
							totalPoint += map[S];
							map[S] = 0;
							continue;
						} else {
							System.out.println("C2");
							break;
						}
					}

				}
			}
			
			
			System.out.println("T");
			break;
			
		}
		System.out.println(totalPoint);
	}
	
	
	// C번 - 점수 내기
	final static int MOD = 998244353;
	public static void test03() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		long[] point = new long[N];
		point[0] = Integer.parseInt(st.nextToken());
		
		long firstT = 0;
		for(int i = 1; i < N; i++) {
			int temp = Integer.parseInt(st.nextToken());
			
			if(temp > point[0]) firstT += (((temp - point[0]) / x * y) + y) ;
			
			if(firstT > MOD) firstT %= MOD;
			point[i] = temp;
		}
		
		
		long sum = 0;
		for(int i = 0; i < point.length; i++) {
			
			for(int j = 0; j < point.length; j++) {
				if(point[i] >= point[j]) continue;
				sum += (((point[j] - point[i]) / x * y) + y);
				
				if(sum > MOD) sum %= MOD;
			}
		}
		
		System.out.println(sum + " " + firstT);
	}
}