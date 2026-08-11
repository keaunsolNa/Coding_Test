package baekjoon_DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class DynamicProgramming02 {
	public static void main(String[] args) throws IOException {
		test07();
	}
	
	
	// 피보나치
    static BigInteger[] dp;
    static BigInteger zero = new BigInteger("0");
	public static void test07() throws IOException{
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] ps = new int[t+1];
        BigInteger[] qs = new BigInteger[t+1];
        int max = 0;
        StringTokenizer st;
        
        for (int i = 1; i <= t; i++) {
        	
            st = new StringTokenizer(br.readLine());
            ps[i] = Integer.parseInt(st.nextToken());
            qs[i] = new BigInteger(st.nextToken());
            max = Math.max(max,ps[i]);
            
        }
        
        dp = new BigInteger[10001];
        dp[1] = new BigInteger("1");
        dp[2] = new BigInteger("1");
        
        for (int i = 3; i <= max; i++) {
        	
            dp[i] = dp[i-1].add(dp[i-2]);
            
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i <= t; i++) {
        	
            sb.append("Case #" + i + ": " + dp[ps[i]].remainder(qs[i]) + "\n");
            
        }
        
        System.out.print(sb);
	}


	// 악수
	public static void test09() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int a = 1;
		int b = 1;
		int sum = 2;

		if(n <= 1) {
			System.out.println(1);
		} else {
			for(int i = 3; i <= n; i++) {
				a = b;
				b = sum;
				sum = a + b;
			}
			
			sum %= 10;
			
			System.out.println(Math.abs(sum));
		}
		
	}

}