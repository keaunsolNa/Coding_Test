package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Implement56 {
    
	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// 21022번 - Three Points for a Win
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		int[] A = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) A[i] = Integer.parseInt(st.nextToken());
		
		int[] B = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) B[i] = Integer.parseInt(st.nextToken());
		
		int winP = 0;
		for(int i = 0; i < N; i++) 
			winP += A[i] > B[i] ? 3 : A[i] < B[i] ? 0 : 1;
			
		System.out.println(winP);
	}
	
	// 13670번 - Alarme Despertador 
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		while(true) {
			
			st = new StringTokenizer(br.readLine());
			
			int HA = Integer.parseInt(st.nextToken());
			int HB = Integer.parseInt(st.nextToken());
			int TA = Integer.parseInt(st.nextToken());
			int TB = Integer.parseInt(st.nextToken());
			
			if(HA == 0 && HB == 0 && TA == 0 && TB == 0) break;
			
			int time = HA * 60 + HB;
			int target = TA * 60 + TB;
			
			if(time < target) System.out.println(target - time);

			else System.out.println(1440 - time + target);
			
		}
	}
	
	// 20494번 - 스시
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = 0;
		int N = Integer.parseInt(br.readLine());
		
		while(N --> 0) cnt += br.readLine().length();
		
		System.out.println(cnt);
		
	}
	
	// 11636번 - Stand on Zanzibar
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		while(N --> 0) {
			
			st = new StringTokenizer(br.readLine());
			
			int idx = Integer.parseInt(st.nextToken());
			int ans = 0;
			
			while(st.hasMoreTokens()) {
				
				int next = Integer.parseInt(st.nextToken());
				
				if(next > idx * 2) ans += next - idx * 2;
					
				idx = next;
			}
			
			System.out.println(ans);
		}
		
	}
	
	// 18410번 - マージ (Merge)
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());

		int[] arr2 = new int[M];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < M; i++) arr2[i] = Integer.parseInt(st.nextToken());
		
		int[] arr3 = new int[N + M];
        System.arraycopy(arr, 0, arr3, 0, arr.length);
        System.arraycopy(arr2, 0, arr3, arr.length, arr2.length);		
		
        Arrays.sort(arr3);
        
        for (int i : arr3) System.out.println(i);
		
	}
	
	// 18691번 - Pokemon Buddy
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			st = new StringTokenizer(br.readLine());
			
			int G = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
			int E = Integer.parseInt(st.nextToken());
			
			int need = E - C;
			
			if(need <= 0) {
				System.out.println(0); 
				continue;
			}
			
			switch(G) {
				
				case 1 : System.out.println(need); break;
				
				case 2 : System.out.println(need * 3); break;
				
				case 3 : System.out.println(need * 5); break;
					
			}
		}
	}
	
	// 16032번 - Income Inequality
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		while(true) {
			
			int seq = Integer.parseInt(br.readLine());
			
			if(seq == 0) break;

			st = new StringTokenizer(br.readLine());
			double[] arr = new double[seq];
			
			double total = 0;
			
			for(int i = 0; i < seq; i++) {
				
				int temp = Integer.parseInt(st.nextToken());
				total += temp;
				
				arr[i] = temp;
			}
			
			double aver = total / seq;
			
			int cnt = 0;
			
			for(int i = 0; i < seq; i++) {
				if(Double.compare(arr[i], aver) <= 0) cnt++;
			}
			
			System.out.println(cnt);
		}
		
		
	}
	
	// 17011번 - Cold Compress 
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			
			char[] input = br.readLine().toCharArray();
			
			int prev = input[0];
			int cnt = 1;
			for(int i = 1; i < input.length; i++) {
				
				if(prev == input[i]) cnt++;
				
				else  {
					sb.append(cnt + " " + (char)prev);
					cnt = 1;
					sb.append(" ");
				}
				
				prev = input[i];
				
			}
			
			sb.append(cnt + " " + (char)prev);
			sb.append("\n");
		}
		
		System.out.println(sb);
		
	}
	
	// 21965번 - 드높은 남산 위에 우뚝 선
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		int top = N;
		boolean flag = true;
		for(int i = 0; i < N - 1; i++) {
			
			if(arr[i + 1] <= arr[i]) {
				top = i;
				flag = false;
				break;
			}
		}
		
		for(int i = top ; i < N - 1; i++) {
			
			if(arr[i + 1] >= arr[i]) {
				
				System.out.println("NO");
				System.exit(0);
			}
		}
		
		System.out.println("YES");
	}
	
	// 23886번 - 알프수
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] input = br.readLine().toCharArray();
		
		int slope = (input[1] - '0') - (input[0] - '0');
		int upOrDown = (input[1] - '0') - (input[1] - '0');
		
		if(slope <= 0 ) {
			System.out.println("NON ALPSOO");
			System.exit(0);
		}
		
		
		for(int i = 1; i < input.length - 1; i++) {
			
			if(input[i] == input[i + 1]) {
				System.out.println("NON ALPSOO");
				System.exit(0);
			}
			
			upOrDown = ((input[i] - '0') - (input[i - 1] - '0')) * ((input[i + 1] - '0') - (input[i] - '0'));
			
			if(upOrDown > 0) {
				
				if(slope != (input[i + 1] - '0') - (input[i] - '0')) {
					System.out.println("NON ALPSOO");
					System.exit(0);
				}
			}
			
			else {
				slope = (input[i + 1] - '0') - (input[i] - '0');
			}
			
		}
		if(slope < 0) System.out.println("ALPSOO");
		else System.out.println("NON ALPSOO");
		
	}
	
}
