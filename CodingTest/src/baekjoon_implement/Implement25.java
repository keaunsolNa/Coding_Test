package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Implement25 {

	public static void main(String[] args) throws IOException {
		test01();
	}
	
	// Speed Limit
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		while(true) {
			
			int input = Integer.parseInt(br.readLine().replaceAll(" ", ""));
			if(input == -1) break;
			
			int[] speed = new int[input];
			int[] time = new int[input];
			
			for(int i = 0; i < input; i++) {
				st = new StringTokenizer(br.readLine());
				speed[i] = Integer.parseInt(st.nextToken());
				time[i] = Integer.parseInt(st.nextToken());
			}
			
			int total = speed[0] * time[0];
			for(int i = 1; i < input; i++) total += speed[i] * (time[i] - time[i-1]);
			
			System.out.println(total + " miles");
		}
	}
	
	
	// Rectangles 
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String input = "";
		
		while(!(input = br.readLine()).equals("0 0 0")) {
			int[] arr = new int[3];
			st = new StringTokenizer(input);
			
			for(int i = 0; i < 3; i++) arr[i] = Integer.parseInt(st.nextToken());
			
			if(arr[0] == 0) sb.append(arr[2] / arr[1] + " " + arr[1] + " " + arr[2]);
			else if(arr[1] == 0) sb.append(arr[0] + " " + arr[2] / arr[0] + " " + arr[2]);
			else if(arr[2] == 0) sb.append(arr[0] + " " + arr[1] + " " + arr[0] * arr[1]);
			
			
			sb.append("\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
	}
	
	
	// Gift
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(br.readLine());

		int cnt = 0;
		for(int i = 1; i < n; i++) if(arr[i - 1] - arr[i] >= k) cnt++;
		
		System.out.println(cnt);
	}
	
    
}
