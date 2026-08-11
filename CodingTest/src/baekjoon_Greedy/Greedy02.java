package baekjoon_Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Greedy02 {
	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// 수들의 합
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long S = Long.parseLong(br.readLine());

		int answer = sum(S);
		
		System.out.println(answer);
		
	}
	
	public static int sum(long S) {
		long sum = 0;
		int idx = 0;
		int N = 0;
		
		while(true) {
			sum += ++idx;
			
			if (sum > S) {
				return N;
			}
			N++;
		}
	}
	
	
	static int N;
	
    
	// ATM
	public static void test09() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] point = new int[N];

		for(int i= 0; i < N; i++) {
			point[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(point);
		 
		int prev = 0;
		int total = 0;
		for(int i = 0; i < N; i++){
			total += prev + point[i];
			prev += point[i];
		}
		
		System.out.println(total);
		
	}
	

	// 포인트 카드
	public static void test10() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int[] token = new int[N];
		for(int i = 0; i < N; i++) {
			token[i] = Integer.parseInt(br.readLine());
		}
		
		int maxT = 0;
		int maxAmount = 0;
		while(true) {
			for(int i = 0; i < N; i++) {
				if(token[i] <= K) {
					maxT = token[i];
				} else break;
			}
			int count  = K/maxT;
			
			K = K%maxT;
			maxAmount += count;
			
			if(K == 0) break;
		}
		
		System.out.println(maxAmount);
	}
	
	
}