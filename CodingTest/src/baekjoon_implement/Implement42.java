package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Implement42 {

	public static void main(String[] args) throws IOException {
		test06();
	}
	
	// 1940번 - 주몽
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(arr);
		
		int cnt = 0;
		int start = 0;
		int end = N - 1;
		
		while(start < end) {
			
            if(arr[start] + arr[end] < M) start++;
            
            else if (arr[start] + arr[end] > M) end--;
            
            else {
                
            	cnt++;
                start++;
                end--;
            }
		}
		
		System.out.println(cnt);
	}
	
	// 2684번 - 동전 게임
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			String input = br.readLine();
			int a = 0;
			int b = 0;
			int c = 0;
			int d = 0;
			int e = 0;
			int f = 0;
			int g = 0;
			int h = 0;
			
			for(int j = 0; j <= 37; j++) {
				
				String str = input.substring(j, j + 3);
				
				switch(str) {
					case "TTT" : a++; break;
					case "TTH" : b++; break;
					case "THT" : c++; break;
					case "THH" : d++; break;
					case "HTT" : e++; break;
					case "HTH" : f++; break;
					case "HHT" : g++; break;
					case "HHH" : h++; break;
				}
			}
			System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f +" " + g + " " + h);
		}
		
	}
	
	// 10810번 - 공 넣기
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] burket = new int[N + 1];
		for(int i = 0; i <= N; i++) burket[i] = 0;
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int I  = Integer.parseInt(st.nextToken());
			int J = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			
			for(int j = I; j <= J; j++) burket[j] = K;
		}
		
		for(int i = 1; i < N + 1; i++) System.out.print(burket[i] + " ");
	}
	
	// 1475번 - 방 번호
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String N = br.readLine().replaceAll("6", "9");
		
		int[] arr = new int[10];
		
		for(int i = 0; i < N.length(); i++) {
			int temp = Character.getNumericValue(N.charAt(i));
			arr[temp]++;
		}
		
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < 9; i++) {
			max = Math.max(arr[i], max);
		}
		
		int nine = arr[9];
		if(nine % 2 == 0) nine /= 2;
		else nine = nine / 2 + 1;
		
		max = Math.max(max, nine);
		
		System.out.println(max);
	}
	
	// 11008번 - 복붙의 달인
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
	
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			
			String s = st.nextToken();
			String p = st.nextToken();
			
			int ans = 0;
			while(s.contains(p)) {
				s = s.replaceFirst(p, "");
				ans++;
			}
			
			System.out.println(ans + s.length());
		}
	}
	
	// 11441번 - 합 구하기
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N + 1];

		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++) arr[i] = Integer.parseInt(st.nextToken());
		
        for (int i = 1; i <= N; i++) arr[i] += arr[i-1];
		
        int M = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			
			System.out.println(getRangedSum(arr, start, end));;
			
		}
	}
	
	public static int getRangedSum(int[] arr, int L, int R) {
        return arr[R] - arr[L-1];
    }
	
	// 
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		
	}
	
	// 
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		
	}
	
	// 
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		
	}
	
	// 
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		
	}
	
	
}
