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
	
	// 동전 0
	public static void test01() throws IOException {
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
	
	// 회의실 배정
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[][] time = new int[N][2];
		
		StringTokenizer st;
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			time[i][0] = Integer.parseInt(st.nextToken());	
			time[i][1] = Integer.parseInt(st.nextToken());	
		}
		
		
		Arrays.sort(time, new Comparator<int[]>() {
			
			@Override
			public int compare(int[] o1, int[] o2) {
				
				if(o1[1] == o2[1]) return o1[0] - o2[0];
				
				return o1[1] - o2[1];
			}
 
		});
		
		int count = 0;
		int prev_end_time = 0;
		
		for(int i = 0; i < N; i++) {
			
			if(prev_end_time <= time[i][0]) {
				prev_end_time = time[i][1];
				count++;
			}
		}
		
		System.out.println(count);
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
	
	// 잃어버린 괄호
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		String[] splitM = input.split("-");
		
		int ans = 0;
		for(int i = 0; i < splitM.length; i++) {
			int sum  = 0;
			
			String[] splitPlus = splitM[i].split("\\+");
			
			for(int j = 0; j < splitPlus.length; j++) 
				sum += Integer.parseInt(splitPlus[j]);
			
			if(i == 0) ans += sum;
			else ans -= sum;
					
		}
		
		System.out.println(ans);
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
