package baekjoon_BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class BruteForcePlus05 {
	
   public static void main(String[] args) throws IOException {
      test10();
   }
	
	// 1145번 - 적어도 대부분의 배수
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] number = new int[5];
		for(int i = 0; i < 5; i++) number[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(number);
		
		for(int i = number[0]; ; i++) {
			
			int cnt = 0;
			for(int j = 0; j < 5; j++) {
				
				if(i % number[j] == 0) cnt++;
			}
			
			if(cnt >= 3) {
				System.out.println(i);
				break;
			}
		}
	}

	// 4641번 - Doubles 
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			
			int[] arr = Arrays.stream(br.readLine().split(" ")).map(String::trim).mapToInt(Integer::parseInt).toArray();
			
			if(arr[0] == -1) break;
			
			int cnt = 0;
			Arrays.sort(arr);
			
			for(int i = 0; i < arr.length; i++) {
				
				for(int j = i + 1; j < arr.length; j++) {
					
					if(arr[i] * 2 == arr[j]) cnt++;
					if(arr[i] * 2 < arr[j]) break;
				}
			}
			
			System.out.println(cnt);
		}
	}
	
	// 15122번 - Forbidden Zero 
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = N + 1; ; i++) {
			
			if((i+"").contains("0")) continue;
			
			System.out.println(i);
			break;
		}
	}
	
	// 15234번 - Number Pairs 
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(arr);
		
		int cnt = 0;
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = i + 1; j < arr.length; j++) {
				
				if(arr[i] + arr[j] == K) cnt++;
			}
		}
		
		System.out.println(cnt);
	}
	
	// 6751번 - From 1987 to 2013 
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int Y = Integer.parseInt(br.readLine());
		
		for(int i = Y + 1; ; i++) {

			String year = i + "";
			Set<Character> set = new HashSet<>();
			for(int j = 0; j < year.length(); j++) set.add(year.charAt(j));
			
			if(year.length() == set.size()) {
				System.out.println(year);
				return;
			}
		}
	}
	
	// 24421번 - 掛け算 (Multiplication)
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());

		int cnt = 0;
		for(int i = 0; i < N; i++) {

			for(int j = i + 1; j < N; j++) {
				
				int temp = arr[i] * arr[j];
				for(int q = j + 1; q < N; q++) if(temp == arr[q]) cnt++;
				
			}
		}
		
		System.out.println(cnt);
	}
	
	// 2435번 - 기상청 인턴 신현수
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length - K + 1; i++) {

			int temp = 0;
			for(int k = i; k < i + K; k++) temp += arr[k];
			max = Math.max(temp, max);
		}
		
		System.out.println(max);
		
	}
	
	// 26552번 - Zero 
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		while(T -- > 0) {
			
			int Y = Integer.parseInt(br.readLine());
			
			for(int i = Y + 1; ; i++) {
				
				if((i+"").contains("0")) continue;
				
				System.out.println(i);
				break;
			}
		}
	}
	
	// 1526번 - 가장 큰 금민수
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		
		while(true) {
			
			boolean chk = true;
			for(int i = 0; i < N.length(); i++) {
		
				if(N.charAt(i) != '4' && N.charAt(i) != '7') {
					chk = false;
					break;
				}
			}

			if(chk == true) break;
			else N = String.valueOf(Integer.parseInt(N) - 1);

		}
		
		System.out.println(N);
		
	}
	
	// 2635번 - 수 이어가기
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		List<Integer> result = new ArrayList<>();
		
		for(int i = N; i >= N/2; i--) {
			
			List<Integer> list = new ArrayList<>();
			list.add(N);
			
			int before = N;
			int now = i;
			
			while(true) {
				
				if(before < 0) break;
				
				int temp = before;
				
				if(now >= 0) list.add(now);
				
				before = now;
				now = temp - before;
				
			}
			
			if(cnt < list.size()) {
				cnt = list.size();
				result = list;
			}
			
		}
		
		System.out.println(cnt);
		for (Integer integer : result) System.out.print(integer +" ");
			
	}

}

