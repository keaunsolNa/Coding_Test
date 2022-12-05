package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Implement14 {

	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// 경기 결과
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int AWin = 0;
		int BWin = 0;
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			if(A > B) {
				AWin++;
			} else if(B > A) {
				BWin++;
			}
		}
		
		System.out.println(AWin + " " + BWin);
	}
	
	// 홀짝 칵테일
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int value1 = 1;
		int value2 = 1;
		boolean odd = false;
		
		int[] arr = new int[3];
		for(int i = 0; i < 3; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			if(arr[i] %2 == 1) {
				value1 *= arr[i];
				odd = true;
			} else {
				value2 *= arr[i];
			}
		}
		
		if(odd) {
			System.out.println(value1);
		} else {
			System.out.println(value2);
		}
		
	}
	
	// Intercepting Information
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = br.readLine().split(" ");
		
		boolean check = true;
		for(int i = 0; i < temp.length; i++) {
			if(Integer.parseInt(temp[i]) == 9) {
				check = false;
				break;
			}
		}
		
		if(check) {
			System.out.println("S");
		} else {
			System.out.println("F");
		}
		
	}
	
	// 치킨댄스를 추는 곰곰이를 본 임스 2
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int answer = 0;
		for(int i = 0; i < T; i++) {
			int day = Integer.parseInt(br.readLine().replaceAll("D-", ""));
			if(day <= 90 ) answer++;
		}
		
		System.out.println(answer);
	}
	
	// 추첨을 통해 커피를 받자
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int total = 0;
		boolean hacker = false;
		for(int i = 0; i < 9; i++) {
			int temp = Integer.parseInt(st.nextToken());
			
			switch(i) {
				case 0 : hacker = temp > 100 ? true : false; break;
				case 1 : hacker = temp > 100 ? true : false; break;
				case 2 : hacker = temp > 200 ? true : false; break;
				case 3 : hacker = temp > 200 ? true : false; break;
				case 4 : hacker = temp > 300 ? true : false; break;
				case 5 : hacker = temp > 300 ? true : false; break;
				case 6 : hacker = temp > 400 ? true : false; break;
				case 7 : hacker = temp > 400 ? true : false; break;
				case 8 : hacker = temp > 500 ? true : false; break;
			}
			
			if(!hacker) break;
			total += temp;
		}
		
		if(hacker) {
			System.out.println("hacker");
		} else if(total >= 100) {
			System.out.println("draw");
		} else {
			System.out.println("none");
		}
	}
	
	// 명장 남정훈
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int L = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		int A = Integer.parseInt(st.nextToken());
		
		int sum = L + R + A;
		int temp = A - Math.abs(L - R);

		System.out.println(temp >= 0 ? sum - temp % 2 : sum - Math.abs(temp));
		
	}
	
	// 페르시아의 왕들
	public static void test07() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st; 
		String input = "";
		
		while(!(input = br.readLine()).equals("0 0 0 0")) {
			st = new StringTokenizer(input, " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			
			int min = Math.abs(c -b);
			int max = Math.abs(d -a);
			
			System.out.println(min + " " + max);
		}
		
	}
	
	// 친구 친구
	public static void test08() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine(), " ");
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        for(int i = 0; i < M; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	int a = Integer.parseInt(st.nextToken());
        	int b = Integer.parseInt(st.nextToken());
        	
        	arr[a-1] += 1;
        	arr[b-1] += 1;
        	
        }
        
        for(int i = 0; i < arr.length; i++) {
        	System.out.println(arr[i]);
        }
	}
	
	// 안녕 클레오파트라 세상에서 제일가는 포테이토칩
	public static void test09() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine(), " ");
        
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        }
        
        boolean flag = true;
        int answer = 0;
        while(flag) {
        	
        	for(int i = 0; i < N; i++) {
        		if(arr[i] < X) {
        			flag = false;
        			answer = i;
        			break;
        		}
        		X++;
        	}
        }
        
        System.out.println(answer+1);
	}
	
	// 특정 대문자를 소문자로 바꾸기
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String A = br.readLine();
		String[] B = br.readLine().split(" ");
		
		for(int i = 0; i < B.length; i++) {
			String temp =  (char)(B[i].charAt(0) + 32) + "";
			A = A.replaceAll(B[i], temp +"");
		}
		
		System.out.println(A);
	}
	
	
}
