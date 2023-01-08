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
		test10();
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
	
	// ソーシャルゲーム (Social Game) 
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int cnt = 0;
		
		while(true) {
			
			if(C > 0) {
				C -= A;
				cnt++;
			}
			
			if(cnt % 7 == 0) C -= B;
			
			if(C <= 0) break;
		}
		
		System.out.println(cnt);
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
	
	// 99 Problems 
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		if(N < 99) {
			System.out.println(99);
			return;
		} else {
			int i = 0;
			while(true) {
				if((N + i) % 100 == 99) {
					System.out.println(N + i);
					break;
				}
				else if((N - i) % 100 == 99) {
					System.out.println(N - i);
					break;
				}
				
				i++;
			}
		}
		
	}
	
	// Piłeczka
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int cnt = 0;
			
			while(A < B) {
				A *= 2;
				cnt++;
			}
			
			sb.append(cnt);
			sb.append("\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
		
	}
	
	// Time Limits
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(arr);
		
		int mileTime = arr[arr.length-1] * s;
		
		if(mileTime % 1000 == 0) System.out.println(mileTime / 1000);
		else System.out.println(mileTime / 1000 + 1);
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
	
	// Sumac Sequences
	public static void test08() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        
        List<Integer> arr = new ArrayList<>();
        arr.add(A);
        arr.add(B);
        
        int idx = 1;
        while(true) {
        	
        	arr.add(arr.get(idx - 1) - arr.get(idx));
        	idx++;
        	
        	if(arr.get(idx - 1) < arr.get(idx)) break;
        	
        }
        
        System.out.println(arr.size());
	}	
    
	// Superlatives
	public static void test09() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        
        int idx = 1;
        while(T --> 0) {

        	st = new StringTokenizer(br.readLine());
        	int A = Integer.parseInt(st.nextToken());
        	int B = Integer.parseInt(st.nextToken());
        	
        	sb.append("Data Set ").append(idx).append(":").append("\n");

        	if(A <= B) {
        		sb.append("no drought"); 
        		sb.append("\n");
            	sb.append("\n");
            	idx++;
        		continue;
        	}
        		
        	int time = 5;
        	while(A > B * time) time *= 5;
        		
    		for(int i = 5; i <= time - 1; i *= 5) sb.append("mega ");
    		sb.append("drought");
    		sb.append("\n");
    		sb.append("\n");
    		idx++;
        	
        }
        
        sb.deleteCharAt(sb.length() - 1);
        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
	
	}
	
	// Angles
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		
		while(N --> 0) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
			
			sb.append(A + " " + B + " " + C + " ");
			if(A + B + C == 180) sb.append("Seems OK");
			else sb.append("Check");
			
			sb.append("\n");
		} 
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
	}
	
	
	
}
