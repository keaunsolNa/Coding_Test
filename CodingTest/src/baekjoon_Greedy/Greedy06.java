package baekjoon_Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Greedy06 {
	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// 25400번 - 제자리
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		Queue<Integer> que = new LinkedList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) que.add(Integer.parseInt(st.nextToken()));
		
		int target = 1;
		int ans = 0;
		while(!que.isEmpty()) {
			
			if(que.peek() == target) {
				target++;
				que.poll();
			}
			
			else {
				que.poll();
				ans++;
			}
		}
		
		System.out.println(ans);
	}
	
	// 27919번 - UDPC 파티
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		long U = countChar(input, 'U');
		long D = countChar(input, 'D');
		long P = countChar(input, 'P');
		long C = countChar(input, 'C');

		String answer = "";
		if(C + U > (D + P + 1) / 2) answer += "U";
		if(D + P > 0) answer += "DP";
		
		System.out.println(answer);
		
	}
	
	private static long countChar(String str, char ch) {
		return str.chars()
				.filter(c -> c == ch)
				.count();

	}
	
	// 26070번 - 곰곰이와 학식
	private static long[] gomgom = new long[3];
	private static long[] mealTicket = new long[3];
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		gomgom[0] = Long.parseLong(st.nextToken());
		gomgom[1] = Long.parseLong(st.nextToken());
		gomgom[2] = Long.parseLong(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		mealTicket[0] = Long.parseLong(st.nextToken());
		mealTicket[1] = Long.parseLong(st.nextToken());
		mealTicket[2] = Long.parseLong(st.nextToken());
		
		long ans = 0;
		
		ans = solve(ans);
		System.out.println(ans);
		
	}

	private static long solve(long ans) {
		
		for(int i = 0; i < 3; i++) {
			
			if(gomgom[i] <= mealTicket[i]) {
				mealTicket[i] -= gomgom[i];
				ans += gomgom[i];
				gomgom[i] = 0;
				
			}
			
			else {
				gomgom[i] -= mealTicket[i];
				ans += mealTicket[i];
				mealTicket[i] = 0;
			}
			
		}

		for(int i = 0; i < 3; i++) {
			if(gomgom[i] > 0 && mealTicket[i - 1 < 0 ? 2 : i - 1] >= 3) {
				
				if(gomgom[i] * 3 >= mealTicket[i - 1 < 0 ? 2 : i - 1]) {
					
					ans += mealTicket[i - 1 < 0 ? 2 : i - 1] / 3;
					gomgom[i] -= mealTicket[i - 1 < 0 ? 2 : i - 1] / 3;
					mealTicket[i - 1 < 0 ? 2 : i - 1] = 0;
					
				} else {
					
					ans += gomgom[i];
					mealTicket[i - 1 < 0 ? 2 : i - 1] -= gomgom[i] * 3;
					gomgom[i] = 0;
					
				}
			}
		}
		
		for(int i = 0; i < 3; i++) {
			if(gomgom[i] > 0 && mealTicket[i + 1 > 2 ? 0 : i + 1] >= 9) {
				
				if(gomgom[i] * 9 >= mealTicket[i + 1 > 2 ? 0 : i + 1]) {
					
					ans += mealTicket[i + 1 > 2 ? 0 : i + 1] / 9;
					gomgom[i] -= mealTicket[i + 1 > 2 ? 0 : i + 1] / 9;
					mealTicket[i + 1 > 2 ? 0 : i + 1] = 0;
					
				} else {
					
					ans += gomgom[i];
					mealTicket[i + 1 > 2 ? 0 : i + 1] -= gomgom[i] * 9;
					gomgom[i] = 0;
					
				}
			}
		}
		return ans;
	}
	
	// 2057번 - 팩토리얼 분해
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Long.parseLong(br.readLine());
		List<Long> facList = new ArrayList<>();
		
		for(long i = 0; i < N; i++) {
			
			long fac = factorial(i);
			if(fac > N) break;
			facList.add(fac);
		}
		
		String ans = "NO";
		for(int i = facList.size() - 1; i >= 0; i--) {
			
			if(facList.get(i) <= N) N -= facList.get(i);
			
			if(N == 0) { ans = "YES"; break; }
		}
		System.out.println(ans);
	}
	
	private static long factorial(long n) {
			
		if(n < 2) return 1;
		return n * factorial(n - 1);
		
	}
	   
	// 27951번 - 옷걸이 F
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());

		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int U = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());

		char[] ans= new char[N];
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] == 1) {
				if(U > 0) { ans[i] = 'U'; U--; }
			}
			
			else if(arr[i] == 2)  {
				if(D > 0) { ans[i] = 'D'; D--; }
			}
			
            else {
				if(U > 0 && U > D) { ans[i] = 'U'; U--; }
				else if(D > 0 && D > U) { ans[i] = 'D'; D--; }
			}
		}
		
		if(U > 0 || D > 0)  System.out.println("NO");
		else {
			System.out.println("YES");
			for (char c : ans) {
                sb.append(c);
			}
            
            System.out.println(sb);
		}
		
	}
	
	// 2872번 - 우리집엔 도서관이 있어 
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(br.readLine());
		
		int cnt = N;
		for (int i = N - 1; i >= 0; i--) 
			if (arr[i] == cnt) cnt--;
		
		System.out.println(cnt);
	}
	
	// 16112번 - 5차 전직
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		long[] arr = new long[n];
		
		for(int i = 0; i < n; i++) arr[i] = Long.parseLong(st.nextToken());
		
		Arrays.sort(arr);
		
		int count = 0;
		long exp  = 0;
		for(int i = 0; i < n; i++) {
			
			if(count < k) {
				count ++;
				exp -= arr[i];				
			}
			exp += (arr[i] * count);
		}
		
		System.out.println(exp);
		
	}
	
	// 24855번 - Natives
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(arr);
		
		long total = 0;
		for(int i = (n % 2 == 0 ? n / 2 : n / 2 + 1); i < n; i++) total += arr[i];
		
		System.out.println(total);
	}
	
	// 27466번 - 그래서 대회 이름 뭐로 하죠
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder(br.readLine());
		
		if(!sb.toString().contains("A")) {
			System.out.println("NO");
			return;
		}
		
		if(N < M) {
			System.out.println("NO");
			return;
		}
		
		while(true) {
			
			if((sb.toString().endsWith("A") || sb.toString().endsWith("E") || sb.toString().endsWith("I") 
										     || sb.toString().endsWith("O") || sb.toString().endsWith("U"))) {
				
				if(N != 0) sb.deleteCharAt(--N);
				
				else {
					System.out.println("NO");
					return;
				}
			} else break;
			
		}
		
		if(N < M) {
			System.out.println("NO");
			return;
		}
		
		while(true) {
			
			if(sb.toString().charAt(N - 2) == 'A') break;
			else {
				if(N > 2) { sb.deleteCharAt(N - 2); N--;}
				else {
					System.out.println("NO");
					return;
				}
			}
		}
		
		if(N < M) {
			System.out.println("NO");
			return;
		}
		
		while(true) {
			
			if(sb.toString().charAt(N - 3) == 'A') break;
			else {
				
				if(N != 0) { sb.deleteCharAt(N - 3); N--; }
				else {
					System.out.println("NO");
					return;
				}
			}
		}
		
		if(N < M) {
			System.out.println("NO");
			return;
		}
		
		if(N != M) sb = new StringBuilder(sb.substring(N - M, N)) ;
		System.out.println("YES");
		System.out.println(sb);
	}
	
	// 25943번 - 양팔저울
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int left = Integer.parseInt(st.nextToken());
		int right = Integer.parseInt(st.nextToken());
		
		while(st.hasMoreTokens()){
			if(left > right) right += Integer.parseInt(st.nextToken());
			else left += Integer.parseInt(st.nextToken());
		}
		
		int cnt = 0;
		while(left != right) {
			int dif = Math.abs(left - right);
			int plus = dif >= 100 ? 100 : dif >= 50 ? 50 : dif >= 20 ? 20 : dif >= 10 ? 10 : dif >= 5 ? 5 : dif >= 2 ? 2 : 1;
			
			if(left > right) right += plus;
			else left += plus;
			dif -= plus;
			cnt++;
			
		}
		
		System.out.println(cnt);
	}
	
	
	
	
}