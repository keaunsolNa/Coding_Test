package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Implement41 {

	public static void main(String[] args) throws IOException {
		test07();
	}
	
	// 10864번 - 친구
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N + 1];
		for(int i = 0; i < M; i++) {
			
			st = new StringTokenizer(br.readLine());
			int one = Integer.parseInt(st.nextToken());
			int two = Integer.parseInt(st.nextToken());
			arr[one]++;
			arr[two]++;
			
		}

		for(int i = 1; i <= N; i++) System.out.println(arr[i]);
	}
	
	// 11637번 - 인기 투표
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= T; i++) {
			
			int N = Integer.parseInt(br.readLine());
			
			int total = 0;
			int max = 0;
			int winner = 0;
			int cnt = 0;
			for(int j = 1; j <= N; j++) {
				
				int vote = Integer.parseInt(br.readLine());
				total += vote;
				
				if(max < vote) {
					max = vote;
					winner = j;
					cnt = 0;
				} else if(max == vote) cnt++;
			}
			
			if(max >= total / 2 + 1) sb.append("majority winner " + winner);
			else if(cnt == 0) sb.append("minority winner " + winner);
			else sb.append("no winner");
			
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
	
	// 10813번 - 공 바꾸기
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		for(int i = 1; i <= N; i++) arr[i - 1] = i;
		
		for(int i = 0; i < M; i++) {
			
			st = new StringTokenizer(br.readLine());
			int I = Integer.parseInt(st.nextToken()) - 1;
			int J = Integer.parseInt(st.nextToken()) - 1;
			
			int temp = arr[I];
			arr[I] = arr[J];
			arr[J] = temp;
			
		}
		
		for(int i = 0; i < N; i++) System.out.print(arr[i] + " ");
	}
	
	// 10384번 - 팬그램
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= T; i++) {
			
			sb.append("Case " + i + ": ");
			
			String input = br.readLine().toLowerCase();
			input = input.replaceAll("[^a-z]", "");
			
			long min = Integer.MAX_VALUE;
			
			for(int c = 97; c <= 122; c++) min = Math.min(min, countChar(input, (char)c));
			
			
			if(min < 1) sb.append("Not a pangram");
			else if(min == 1) sb.append("Pangram!");
			else if(min == 2) sb.append("Double pangram!!");
			else sb.append("Triple pangram!!!");
			
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
	
	public static long countChar(String str, char ch) {
       return str.chars()
               .filter(c -> c == ch)
               .count();
	}
	
	// 8974번 - 희주의 수학시험
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[1001];
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++)
			arr[i] = (((1)+(int)Math.sqrt(1+(8*(i-1))))/2);
		
		for(int i= A; i <= B; i++) sum += arr[i];

		System.out.println(sum);
	}
	
	// 2979번 - 트럭 주차
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		int[] time = new int[101];
		for(int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			
			for(int j = start; j < end; j++) {
				time[j]++;
			}
		}
		
		int sum = 0;
		
		for(int i = 0; i <= 100; i++) {
			
			if(time[i] == 1) sum += time[i] * A;
			else if(time[i] == 2) sum += time[i] * B;
			else if(time[i] == 3) sum += time[i] * C;
		}
		
		System.out.println(sum);
		
	}
	
	// 4564번 - 숫자 카드놀이
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		long input = -1;
		
		while((input = Integer.parseInt(br.readLine())) != 0) {
			
			sb.append(input + " ");
			while(input >= 10) {
				
				long temp = 1;
				String str = input + "";
				
				for(int i = 0; i < str.length(); i++) {
					temp *= Character.getNumericValue(str.charAt(i));
				}
				
				input = temp;
				sb.append(input + " ");
			}
			
			sb.deleteCharAt(sb.length() - 1);
			sb.append("\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
	}
	
	//
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
	}
	
	//
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
	}
	
	//
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
	}
	
	
	
}
