package baekjoon_StepByStep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Test19_Greedy {

	public static void main(String[] args) throws IOException {
		test05();
	}
	
	
	// ATM
	public static void test03() throws IOException {
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
	
	
	// 주유소
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		long[] length = new long[N-1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N - 1; i++) length[i] = Integer.parseInt(st.nextToken());
			
		long[] pay = new long[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) pay[i] = Integer.parseInt(st.nextToken());
		
		long sum = 0;
		long minPay = pay[0];
		
		for(int i = 0; i < N - 1; i++) {
			
			if(pay[i] < minPay) minPay = pay[i];
			
			sum += (minPay * length[i]);
		}
		
		System.out.println(sum);
	}
	
	
}
