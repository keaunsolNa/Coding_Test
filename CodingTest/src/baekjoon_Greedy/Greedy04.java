package baekjoon_Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Greedy04 {
	public static void main(String[] args) throws IOException {
		test07();
	}
	
	// 팔찌 만들기
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(arr);
		
		int sum = 0;
		for(int i = 0; i < arr.length - 1; i++) {
			sum += Math.abs(arr[i+1] - arr[i]);
		}
		sum += Math.abs(arr[arr.length - 1] - arr[0]); 
		System.out.println(sum);
	}
	
	// 기타줄
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int setMin = Integer.MAX_VALUE;
		int singMin = Integer.MAX_VALUE;
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			setMin = Math.min(setMin, Integer.parseInt(st.nextToken()));
			singMin = Math.min(singMin, Integer.parseInt(st.nextToken()));
		}
		
		int justSing;
		int justSet;
		int useDouble;
		
		justSing = singMin * N;
		
		if(N % 6 == 0) justSet = setMin * (N / 6);
		else justSet = setMin * ((N / 6) + 1);
			
		useDouble = (setMin * (N / 6)) + (singMin * (N % 6));
		
		System.out.println(Math.min(Math.min(justSing, justSet), useDouble));
	}
	
	// 공 포장하기
	public static void test03() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] rgb = new int[3];
		for(int i = 0; i < 3; i++) rgb[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(rgb);

		int box = rgb[0];
		
		rgb[1] -= rgb[0];
		rgb[2] -= rgb[0];
		
		box += rgb[1] / 3;
		box += rgb[2] / 3;
		rgb[1] = rgb[1] % 3;
		rgb[2] = rgb[2] % 3;
		
		if(rgb[1] + rgb[2] >= 3) box += 2;
		else if(rgb[1] + rgb[2] == 0) box += 0;
		else if(rgb[1] + rgb[2] <= 2) box += 1;
		
		System.out.println(box);
		
	}

	// 5학년은 다니기 싫어요
	public static void test04() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		int cnt = 8 - N;
		int score = 0;
		int[] X = new int[10];
		int[] Y = new int[10];
		
		for(int i = 0; i < 10; i++) {
			st = new StringTokenizer(br.readLine());
			X[i] = Integer.parseInt(st.nextToken());
			Y[i] = Integer.parseInt(st.nextToken());
		}
		
		if(B >= 130 && A >= 66) System.out.println("Nice");

		else {
			
			for(int i = 0; i < cnt; i++) {
				A += X[i] * 3;
				B += X[i] * 3;
				score = 6 - X[i];
				
				if(score < Y[i]) B += score * 3;
				else B += Y[i] * 3;
				
			}
			
			if(B >= 130 && A >= 66) System.out.println("Nice");
			else System.out.println("Nae ga wae");
		}
	}
    
	// 게임을 만든 동준이 
	public static void test05() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
			
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(br.readLine());
		
		if(N == 1) System.out.println(0);
		else {
			
			int cnt = 0;
			
			for(int i = N - 2; i >= 0; i--) {
				int next = arr[i + 1];
				int prev = arr[i];
				
				if(prev >= next) {
					cnt += prev - (next - 1);
					arr[i] = next - 1;
				}
			}
			System.out.println(cnt);
		}
	}
	
	// 잃어버린 괄호
	public static void test06() throws IOException{
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

	// 신입 사원
	public static void test07() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			
			int N = Integer.parseInt(br.readLine());
			int cnt = 1;
			int[] grade = new int[N + 1];
			
			for(int j = 0; j < N; j++) {
				st = new StringTokenizer(br.readLine());
				int A = Integer.parseInt(st.nextToken());
				int B = Integer.parseInt(st.nextToken());
				
				grade[A] = B;
			}
			
			int target = grade[1];
			
			for(int j = 2; j <= N; j++) {
				if(grade[j] < target) {
					target = grade[j];
					cnt++;
				}
			}
			
			System.out.println(cnt);
		}
		
	}

	// 
	public static void test08() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        
	}

	//
	public static void test09() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		int ans = 0;
		
	}
	
	//
	public static void test10() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
	}
	
	
}