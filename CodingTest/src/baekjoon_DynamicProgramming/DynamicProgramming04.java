package baekjoon_DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class DynamicProgramming04 {
	public static void main(String[] args) throws IOException {
		test09();
	}
	
	
	// 2293번 - 동전 1
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());				
		int[] token = new int[N];
		
		int K = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < N; i++) 
			token[i] = Integer.parseInt(br.readLine());

		int[] cache = new int[K + 1];
		cache[0] = 1;
		
		for(int coin : token) 
			for(int j = coin; j <= K; j++) cache[j] += cache[j - coin];
		
		System.out.println(cache[K]);
		
	}
	
	
}