package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Implement53 {
    
	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// 9916번 - Zeros 
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		String fac = String.valueOf(factorial(N));
		
		int ans = 0;
		for(int i = 0; i < fac.length(); i++) {
			if(fac.charAt(i) == '0') ans++;
		}
		
		System.out.println(ans);
        
	}
	
   private static BigInteger factorial(int n) {
	   
	    if(n == 0 || n == 1) return BigInteger.ONE;
	    
	    BigInteger result = BigInteger.valueOf(n);
	    for(int i = n; i >= 2; i--)  result = result.multiply(BigInteger.valueOf(i - 1));
	    return result;
	}
	   
	// 27880번 - Gahui and Soongsil University station 
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String input = "";
		
		int ans = 0;
		while((input = br.readLine()) != null) {
			
			st = new StringTokenizer(input);
			
			String EOS = st.nextToken();
			int floor = Integer.parseInt(st.nextToken());
			
			ans += EOS.equals("Es") ? floor * 21 : floor * 17;
		
		}
		
		System.out.println(ans);
	}
	
	// 20978번 - 共通要素 (Common Elements) 
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());

		Arrays.sort(arr);
		Set<Integer> list = new TreeSet<>();
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < M; i++) {
			
			int temp = Integer.parseInt(st.nextToken());
			for(int j = 0; j < N; j++) {
				
				if(arr[j] == temp) {
					list.add(temp);
					break;
				}
					
				if(arr[j] > temp) break;
			}
		}

		if(list.isEmpty()) System.exit(0);;
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}
	
	// 27913번 - SciComLove (2023) 
	public static void test04() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int Q = Integer.parseInt(st.nextToken());
		boolean[] arr = new boolean[N];
		for(int i = 0; i < N; i++) {
			switch(i % 10) {
				
				case 0 : arr[i] = true; break;
				case 3 : arr[i] = true; break;
				case 6 : arr[i] = true; break;
				default : arr[i] = false; break;
			}
		}
		
		int ans = 0;
		for(int i = 0; i < arr.length; i++) 
			if(arr[i]) ans++;
		
		for(int i = 0; i < Q; i++) {
			
			int idx = Integer.parseInt(br.readLine()) - 1;
			if(arr[idx]) {
				ans--;
				arr[idx] = false;
			}
			
			else {
				ans++;
				arr[idx] = true;
			}
			
			System.out.println(ans);
		}
			
	}
	
	// 6318번 - Box of Bricks
	public static void test05() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int set = 1;
        
        while (true) {
        	
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;
            
            st = new StringTokenizer(br.readLine());
            int[] arr = new int[n];
            int sum = 0;
            
            for (int i = 0; i < n; i++) {
                int cur = Integer.parseInt(st.nextToken());
                sum += cur;
                arr[i] = cur;
            }
            
            int cnt = 0;
            sum /= n;
            
            for (int i = 0; i < n; i++) 
                if (arr[i] > sum) cnt += arr[i] - sum;
            
            sb.append(String.format("Set #%d\nThe minimum number of moves is %d.\n\n", set++, cnt));
        }
        
        System.out.print(sb);
	}
	
	// 6081번 - Hay Expenses
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int Q = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < Q; i++) {
			st = new StringTokenizer(br.readLine());
			
			int start = Integer.parseInt(st.nextToken()) - 1;
			int end = Integer.parseInt(st.nextToken()) - 1;
			
			long ans = 0;
			for(int j = start; j <= end; j++) {
				ans += arr[j];
			}
			
			System.out.println(ans);
		}
		
		
	}
	
	// 13627번 - Dangerous Dive
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		for(int i = 1; i <= N; i++) arr[i - 1] = i;
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < R; i++) {
			
			int temp = Integer.parseInt(st.nextToken());
			
			arr[temp - 1] = 0;
		}
		
		for(int i = 0; i < N; i++) {
			
			if(arr[i] != 0) sb.append(arr[i] +" ");
		}
		
		if(sb.length() == 0) System.out.println("*");
		else System.out.println(sb);
	}
	
	// 24420번 - ピアノコンクール (Piano Competition)
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		long total = 0;
		for(int i = 1; i < N - 1; i++) total += arr[i];
		
		System.out.println(total);
		
	}
	
	// 6976번 - Divisibility by 11
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		StringBuilder ans = new StringBuilder();
		while(T --> 0) {
			
			StringBuilder sb = new StringBuilder(br.readLine());
			String firstNumber = sb.toString();
			BigInteger ten = new BigInteger("10");
			
			ans.append(sb + "\n");
			while(sb.length() > 2) {
				BigInteger num1 = new BigInteger(sb.toString());
				BigInteger mod = num1.mod(ten);
				num1 = num1.divide(ten);
				num1 = num1.subtract(mod);
				sb.setLength(0);
				sb.append(num1);
				ans.append(sb + "\n");
			}
			
			if(Integer.parseInt(sb.toString()) % 11 == 0) {
				ans.append("The number " + firstNumber +" is divisible by 11.\n");
			} else {
				ans.append("The number " + firstNumber +" is not divisible by 11.\n");
			}
			ans.append("\n");
		}
		
		ans.deleteCharAt(ans.length() - 1);
		System.out.print(ans);
	}
	
	// 2303번 - 숫자 게임
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
        int arr[] = new int[5];
        int[] list = new int[N];
        
        for (int i = 0; i < N; i++) {
        	
        	st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) 
                arr[j] = Integer.parseInt(st.nextToken());
 
            int max = Integer.MIN_VALUE;
 
            for (int j = 0; j < 3; j++) 
                for (int k = j + 1; k < 4; k++) 
                    for (int z = k + 1; z < 5; z++) 
                        max = Math.max(max, (arr[j] + arr[k] + arr[z]) % 10);
            
            list[i] = max;
        }
 
        int idx = -1;
        int res = -1;
 
        for (int i = 0; i < N; i++) {
            if (res <= list[i]) {
                res = list[i];
                idx = i + 1;
            }
        }
 
        System.out.println(idx);
 
	}
	
	
}
