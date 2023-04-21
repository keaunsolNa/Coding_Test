package baekjoon_DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class DynamicProgramming06 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		test04();
	}

	// 9660번 - 돌 게임 6
	public static void test01() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger number = new BigInteger(br.readLine());
		BigInteger seven = new BigInteger("7");
		BigInteger zero = new BigInteger("0");
		BigInteger two = new BigInteger("2");
				
		if(number.mod(seven).compareTo(zero) == 0 || number.mod(seven).compareTo(two) == 0) System.out.println("CY");
		else System.out.println("SK");
		
	}
	
	// 17212번 - 달나라 토끼를 위한 구매대금 지불 도우미
	public static void test02() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] dp = new int[N + 1];
		int[] coin = new int[] {1, 2, 5, 7};
		Arrays.fill(dp, 100001);
		
		dp[0] = 0;

        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < 4; j++) {
            	
                if (i - coin[j] < 0) continue;
                dp[i] = Math.min(dp[i], dp[i - coin[j]] + 1);
                
            }
        }
        
        System.out.print(dp[N]);
		
	}
	
	// 4172번 - sqrt log sin
	public static void test03() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[1000001];
		arr[0] = 1;
		
		for(int i = 1; i < arr.length; i++) {
			int sqrtNum = (int)Math.floor(i - Math.sqrt(i));
			int logNum = (int)Math.log(i);
			int sinNum = (int)(i * Math.sin(i) * Math.sin(i));
			
			arr[i] = (arr[sqrtNum] + arr[logNum] + arr[sinNum]) % 1000000;
		}
		
		while(true) {

			int x = Integer.parseInt(br.readLine());
			
			if(x == -1) break;
			System.out.println(arr[x]);
		}
	}
	
	// 15991번 - 1, 2, 3 더하기 6
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		long[] dp = new long[100001];
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 2;
		dp[4] = 3;
		dp[5] = 3;
		dp[6] = 6;
		
		for(int i = 7; i <= 100000; i++) 
			dp[i] = (dp[i-2] + dp[i-4] + dp[i-6]) % 1000000009;
			
		
		while(T --> 0) {
			int i = Integer.parseInt(br.readLine());
			System.out.println(dp[i]);
		}
		
	}
	
	//
	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
	}
	
	//
	public static void test06() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
	}
	

}
