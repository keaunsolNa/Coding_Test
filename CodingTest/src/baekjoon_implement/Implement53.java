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
		test05();
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
	
	// 
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		
	}
	// 
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		
	}
	
	
}
