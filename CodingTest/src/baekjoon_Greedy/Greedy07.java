package baekjoon_Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Greedy07 {
	public static void main(String[] args) throws IOException {
		test04();
	}
	
	
	// 2212번 - 센서
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());
		
		if(K >= N) { System.out.println(0); return; }
		
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] sensor = new int[N];
		for(int i = 0; i < N; i++) sensor[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(sensor);
		
		Integer[] dif = new Integer[N - 1];
		for(int i = 0; i < N - 1; i++) dif[i] = sensor[i + 1] - sensor[i];
		
		Arrays.sort(dif, Collections.reverseOrder());
		
		long sum = 0;
		for(int i = K - 1; i < N - 1; i++) sum += dif[i];
		
		System.out.println(sum);
	}
	
	// 12931번 - 두 배 더하기
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		int sum = 0;
		
		for(int i = 0; i < N; i++) {
			
			int temp = Integer.parseInt(st.nextToken());
			arr[i] = temp;
			sum += temp;
			
		}

		int answer = 0;
		while(sum != 0) {
			
			int num = 0;
			
			for(int i = 0; i < N; i++) {
				
				if(arr[i] % 2 == 1) {
					arr[i]--;
					num++;
				}
				
			}
			
			if(num > 0) {
				
				sum -= num;
				answer += num;
				
			}
			
			else {
				
				for(int i = 0; i < N; i++) arr[i] /= 2;
				sum /= 2;
				answer++;
				
			}
		}
		
		System.out.print(answer);
		
	}
	
	// 15553번 - 난로
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int[] time = new int[N];
		Integer[] difTime = new Integer[N - 1];
		time[0] = Integer.parseInt(br.readLine());
		
		for(int i = 1; i < N; i++) {
			
			time[i] = Integer.parseInt(br.readLine());
			difTime[i - 1] = time[i] - time[i - 1];
			
		}
		
		Arrays.sort(difTime, Collections.reverseOrder());
		
		long min = 0;
		
		for(int i = 0; i < K - 1; i++) difTime[i] = 0;

		min += K;
		
		for(int i = 0; i < N - 1; i++) min += difTime[i];
		
		System.out.println(min);
	}
	
	// 13164번 - 행복 유치원
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		Integer[] dif = new Integer[N - 1];
		
		arr[0] = Integer.parseInt(st.nextToken());
		for(int i = 1; i < N; i++) {
			
			arr[i] = Integer.parseInt(st.nextToken());
			dif[i - 1] = arr[i] - arr[i - 1];
			
		}
		
		Arrays.sort(dif, Collections.reverseOrder());
		
		long min = 0;
		
		for(int i = 0; i < K - 1; i++) dif[i] = 0;

		for(int i = 0; i < N - 1; i++) min += dif[i];
		
		System.out.println(min);
		
	}
	
	
	// 1339번 - 단어 수학
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		String[] list = new String[N];
		int[] alp = new int[26];
		
		for(int i = 0; i < N; i++) list[i] = br.readLine();
		
		for(int i = 0; i < N; i++) {
			
			int temp = (int)Math.pow(10, list[i].length() - 1);
			
			for(int j = 0; j < list[i].length(); j++) {
				alp[(int)list[i].charAt(j) - 'A'] += temp;
				temp /= 10;
			}
			
		}
		
		Arrays.sort(alp);
		int idx = 9;
		int sum = 0;
		
		for(int i = alp.length - 1; i >= 0; i--) {
			
			if(alp[i] == 0) break;
			
			sum += alp[i]* idx;
			idx--;
			
		}
		
		System.out.println(sum);
	}
	
	
}