package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class StringPlus32 {
	
	public static void main(String[] args) throws IOException {
		test02();
	}

	
	// 5582번 - 공통 부분 문자열
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String A = br.readLine();
		String B = br.readLine();
		int[][] dp = new int[A.length() + 1][B.length() + 1];

		int max = 0;

		for(int i = 1; i <= A.length(); i++) {
			
			for(int j = 1; j <= B.length(); j++) {
				if(A.charAt(i - 1) == B.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    max = Math.max(max, dp[i][j]);
                }
			}
		}
		
		System.out.println(max);
	}
	
	
}
