package baekjoon_DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DynamicProgramming03 {
	public static void main(String[] args) throws IOException {
		test01();
	}
	
	// 연속부분최대곱
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		double[] arr = new double[n + 1];
        double[] dp = new double[n + 1];
        double max = 0;
        
        for (int i = 1; i <= n; i++) {
            arr[i] = Double.parseDouble(br.readLine());
            dp[i] = Math.max(arr[i], dp[i-1] * arr[i]);
            max = Math.max(max, dp[i]);
        }
		
        System.out.printf("%.3f", max);
		
	}
	
	//
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
	}
	
	// 
	public static void test03() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
	}

	//
	public static void test04() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N  = Integer.parseInt(br.readLine());
		
	}
	
	// 
	public static void test05() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
	}
	
	// 
	public static void test06() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
	}
	

	// 
	public static void test07() throws IOException{
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
	}

	// 
	public static void test08() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String input = "";
			
	}

	// 
	public static void test09() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		
	}

	// 
	public static void test10() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
	}
}